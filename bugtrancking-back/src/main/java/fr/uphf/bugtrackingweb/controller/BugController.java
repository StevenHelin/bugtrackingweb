package fr.uphf.bugtrackingweb.controller;

import java.util.List;

import fr.uphf.bugtrackingweb.Bug;
import fr.uphf.bugtrackingweb.CreateBug;
import fr.uphf.bugtrackingweb.repositories.BugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("bug/liste/{id}")
    public Bug getBugCom(@PathVariable("id") Integer id) {
        return BugRepository.PrintComById(id);
    }
}
