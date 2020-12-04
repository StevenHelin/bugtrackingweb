package fr.uphf.bugtrackingweb.repositories;

import fr.uphf.bugtrackingweb.Commentaire;
import fr.uphf.bugtrackingweb.Developpeur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DeveloppeurRepository extends JpaRepository<Developpeur, Integer> {
    Optional<Developpeur> findById(Integer id);
}
