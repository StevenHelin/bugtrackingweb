package fr.uphf.bugtrackingweb.controller;

import fr.uphf.bugtrackingweb.Developpeur;
import fr.uphf.bugtrackingweb.repositories.DeveloppeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

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
}
