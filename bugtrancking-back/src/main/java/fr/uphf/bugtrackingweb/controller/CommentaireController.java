package fr.uphf.bugtrackingweb.controller;

import java.util.List;
import java.util.Optional;


import fr.uphf.bugtrackingweb.*;
import fr.uphf.bugtrackingweb.repositories.BugRepository;
import fr.uphf.bugtrackingweb.repositories.CommentaireRepository;
import fr.uphf.bugtrackingweb.repositories.DeveloppeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentaireController {
    @Autowired
    CommentaireRepository CommentaireRepository;

    @Autowired
    BugRepository BugRepository;

    @Autowired
    DeveloppeurRepository DeveloppeurRepository;

    @GetMapping("commentaire/{id}")
    public Commentaire getCommentaire(@PathVariable("id") Integer id) {
        return CommentaireRepository.findById(id).orElse(null);
    }

    @GetMapping("commentaire")
    public List<Commentaire> getAllCommentaire() {
        return CommentaireRepository.findAll();
    }

    @PostMapping("/com/bug/{id}/dev/{iddev}")
    public ResponseEntity<?> ajoutCom(@PathVariable("id") int id, @PathVariable("iddev") int iddev,@Validated @RequestBody CreateCommentaire com) {

        try {
            Bug bug = this.BugRepository.findById(id).map(bugFound -> {
                return bugFound;
            }).orElseThrow(() -> new RuntimeException("Bug non trouvé"));
            Developpeur dev = this.DeveloppeurRepository.findById(id).map(devFound -> {
                return devFound;
            }).orElseThrow(() -> new RuntimeException("Dev non trouvé"));
            CommentaireRepository.save(
                    Commentaire
                            .builder()
                            .message(com.getMessage())
                            .developpeur(dev)
                            .dateP((com.getDateP()))
                            .bug(bug)
                            .build()
            );
            return ResponseEntity.ok(com);
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(e);
        }

    }
}
