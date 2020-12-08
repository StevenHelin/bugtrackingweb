package fr.uphf.bugtrackingweb;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Bug {
    @Id
    private int idBug;
    private String titre;
    private String description;
    private String priorite;
    private String etat;
    private Date dateC;
    @ManyToOne
    private Developpeur developpeur;
    @OneToMany(mappedBy = "bug")
    private List<Commentaire> commentaire;
}
