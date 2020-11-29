package fr.uphf.bugtrackingweb.repositories;

import fr.uphf.bugtrackingweb.Bug;
import fr.uphf.bugtrackingweb.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommentaireRepository extends JpaRepository<Commentaire, Integer> {
    Optional<Commentaire> findById(Integer id);
}
