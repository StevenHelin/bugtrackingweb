package fr.uphf.bugtrackingweb.repositories;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import fr.uphf.bugtrackingweb.Bug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface BugRepository extends JpaRepository<Bug, Integer> {
    Optional<Bug> findById(Integer id);

    @Query("SELECT b FROM Bug b WHERE b.titre LIKE %?1%")
    List<Bug> findBugByTitle(String titre);

    @Query("SELECT b FROM Bug b WHERE b.etat= ?1 ")
    List<Bug> findBugByEtat(String etat);

    @Query ("SELECT b.priorite FROM Bug b WHERE b.priorite = ?1")
    List<Bug> findBugByPriorite(String priorite);

    @Query("SELECT b FROM Bug b WHERE b.dateC > ?1 AND b.dateC < ?2")
    List<Bug> findBugByDate(Date debut,Date fin);
}
