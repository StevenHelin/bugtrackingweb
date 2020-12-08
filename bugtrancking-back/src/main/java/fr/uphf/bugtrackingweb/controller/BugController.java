package fr.uphf.bugtrackingweb.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import fr.uphf.bugtrackingweb.*;
import fr.uphf.bugtrackingweb.repositories.BugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class BugController {
    @Autowired
    BugRepository BugRepository;

    @GetMapping("bug/{id}")
    public Bug getBug(@PathVariable("id") Integer id) {
        return BugRepository.findById(id).orElse(null);
    }

    @GetMapping("bug")
    public List<Bug> getAllBug() {
        return BugRepository.findAll();
    }

    @DeleteMapping("bug/{id}")
    public void deleteBug(@PathVariable Integer id){
        BugRepository.deleteById(id);

    }

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
                .developpeur(bug.getDeveloppeur())
                .commentaire(bug.getCommentaires())
                .build()
        );
    }

    @GetMapping("bug/titre")
    public List<Bug> getBug(@RequestParam String titre) {
        return BugRepository.findBugByTitle(titre);
    }

    @GetMapping("bug/etat")
    public List<Bug> getBugEtat(@RequestParam String etat) {
        return BugRepository.findBugByEtat(etat);
    }

    @GetMapping("bug/date")
    public List<Bug> getBugByDate(@RequestParam("debut") @DateTimeFormat(pattern="dd-MM-yyyy")Date debut,
                                  @RequestParam("fin") @DateTimeFormat(pattern = "dd-MM-yyyy") Date fin){
        return BugRepository.findBugByDate(debut,fin);
    }

    @GetMapping("bug/liste/{id}")
    public Bug getBugCom(@PathVariable("id") Integer id) {
        return BugRepository.PrintComById(id);
    }

    @PutMapping("/bug/{id}")
    public Optional<Bug> replaceBugById(@RequestParam CreateBug bug, @PathVariable int id){
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
}
