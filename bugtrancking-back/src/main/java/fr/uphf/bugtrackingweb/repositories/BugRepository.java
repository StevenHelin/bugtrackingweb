package fr.uphf.bugtrackingweb.repositories;
import java.util.Optional;

import fr.uphf.bugtrackingweb.Bug;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BugRepository extends JpaRepository<Bug, Integer> {
    Optional<Bug> findById(Integer id);
}
