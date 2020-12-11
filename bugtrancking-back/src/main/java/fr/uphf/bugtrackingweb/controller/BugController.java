package fr.uphf.bugtrackingweb.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import fr.uphf.bugtrackingweb.*;
import fr.uphf.bugtrackingweb.repositories.BugRepository;
import fr.uphf.bugtrackingweb.repositories.DeveloppeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class BugController {
    @Autowired
    BugRepository BugRepository;

    @Autowired
    DeveloppeurRepository DeveloppeurRepository;

    // requetes pour afficher un bug par un Id donné en paramètre
    @GetMapping("bug/{id}")
    public Bug getBug(@PathVariable("id") Integer id) {
        return BugRepository.findById(id).orElse(null);
    }

    //requete pour afficher tout les bugs de la bases de données
    @GetMapping("bug")
    public List<Bug> getAllBug() {
        return BugRepository.findAll();
    }

    //requete pour supprimer un bug en fonction d'un Id donné en paramètre
    @DeleteMapping("bug/{id}")
    public void deleteBug(@PathVariable Integer id){
        BugRepository.deleteById(id);

    }

    //requete permettant la création d'un nouveau bug dans la base de donnée
    @PostMapping("bug")
    public Bug createBug(@Validated @RequestBody CreateBug bug){
        return BugRepository.save(
                Bug
                .builder()
                .titre(bug.getTitre())
                .description(bug.getDescription())
                .priorite(bug.getPriorite())
                .etat(bug.getEtat())
                .dateC(bug.getDateC())
                //.developpeur(bug.getDeveloppeur())
                //.commentaire(bug.getCommentaires())
                .build()
        );
    }

    //requete pour la recherche de tout les bug par titre, permet de rechercher tout les titre comportant le meme mot
    @GetMapping("bug/titre")
    public List<Bug> getBugTitre(@RequestParam String titre) {
        return BugRepository.findBugByTitle(titre);
    }


    //requete pour la recherche d'un bug en fonction de son avancement
    @GetMapping("bug/etat")
    public List<Bug> getBugEtat(@RequestParam String etat) {
        return BugRepository.findBugByEtat(etat);
    }

    //requete pour rechercher les bug en fonctions d'un intervalle de dates
    @GetMapping("bug/date")
    public List<Bug> getBugByDate(@RequestParam("debut") @DateTimeFormat(pattern="dd-MM-yyyy")Date debut,
                                  @RequestParam("fin") @DateTimeFormat(pattern = "dd-MM-yyyy") Date fin){
        return BugRepository.findBugByDate(debut,fin);
    }

    //requete pour modifier un bug déja existant en base de données
    @PutMapping("bug/{id}")
    public Optional<Bug> replaceBugById(@RequestBody CreateBug bug, @PathVariable int id){
        return BugRepository.findById(id)
                .map(Bug -> {
                Bug.setTitre(bug.getTitre());
                Bug.setDescription(bug.getDescription());
                Bug.setPriorite(bug.getPriorite());
                Bug.setEtat(bug.getEtat());
                Bug.setDateC(bug.getDateC());
                return BugRepository.save(Bug);
                });
    }

    //requete permettant d'assigner un developpeur a un bug
    @PutMapping("bug/{id}/dev/{iddev}")
    public ResponseEntity<?> ajoutDev(@PathVariable("id") Integer id,@PathVariable("iddev") Integer iddev){
        try {
            Bug bug = this.BugRepository.findById(id).map(bugFound ->{
                Optional<Developpeur> devFound = this.DeveloppeurRepository.findById(iddev);
                if(devFound.isPresent()){
                    bugFound.setDeveloppeur(devFound.get());
                    return BugRepository.save(bugFound);
                }
                else{
                    throw new RuntimeException("Developpeur non trouvé");
                }
            }).orElseThrow(() -> new RuntimeException("Bug non trouvé"));
            return ResponseEntity.ok(bug);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(e);
        }
    }
}
