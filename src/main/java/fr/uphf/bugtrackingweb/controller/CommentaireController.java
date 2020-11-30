package fr.uphf.bugtrackingweb.controller;

import fr.uphf.bugtrackingweb.Commentaire;
import fr.uphf.bugtrackingweb.repositories.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

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
