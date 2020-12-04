package fr.uphf.bugtrackingweb.controller;

import java.util.List;


import fr.uphf.bugtrackingweb.Commentaire;
import fr.uphf.bugtrackingweb.repositories.CommentaireRepository;
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
public class CommentaireController
{
    @Autowired
    CommentaireRepository CommentaireRepository;

    @GetMapping("commentaire/{id}")
    public Commentaire getCommentaire(@PathVariable("id") Integer id)
    {
        return CommentaireRepository.findById(id).orElse(null);
    }

    @GetMapping("commentaire")
    public List<Commentaire> getAllCommentaire()
    {
        return CommentaireRepository.findAll();
    }
}
