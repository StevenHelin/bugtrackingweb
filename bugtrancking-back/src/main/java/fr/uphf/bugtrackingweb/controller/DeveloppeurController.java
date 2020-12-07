package fr.uphf.bugtrackingweb.controller;

import java.util.List;

import fr.uphf.bugtrackingweb.Commentaire;
import fr.uphf.bugtrackingweb.CreateCommentaire;
import fr.uphf.bugtrackingweb.CreateDeveloppeur;
import fr.uphf.bugtrackingweb.Developpeur;
import fr.uphf.bugtrackingweb.repositories.DeveloppeurRepository;
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
public class DeveloppeurController
{
    @Autowired
    DeveloppeurRepository DeveloppeurRepository;

    @GetMapping("developpeur/{id}")
    public Developpeur getDeveloppeur(@PathVariable("id") Integer id)
    {
        return DeveloppeurRepository.findById(id).orElse(null);
    }

    @GetMapping("developpeur")
    public List<Developpeur> getAllDeveloppeur()
    {
        return DeveloppeurRepository.findAll();
    }

    @PostMapping("developpeur")
    public Developpeur createDeveloppeur(@Validated @RequestBody CreateDeveloppeur dev) {
        return DeveloppeurRepository.save(
                Developpeur
                        .builder()
                        .nom(dev.getNom())
                        .avatar(dev.getAvatar())
                        .bugs(dev.getBugs())
                        .commentaires(dev.getCommentaires())
                        .build()
        );
    }
}
