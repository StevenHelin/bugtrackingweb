package fr.uphf.bugtrackingweb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateBug {
    private String titre;
    private String description;
    private String priorite;
    private String etat;
    private String dateC;
    private Developpeur developpeur;
    private List<Commentaire> commentaires;
}
