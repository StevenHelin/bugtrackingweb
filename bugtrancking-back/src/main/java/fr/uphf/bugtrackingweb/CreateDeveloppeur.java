package fr.uphf.bugtrackingweb;

import fr.uphf.bugtrackingweb.Bug;
import fr.uphf.bugtrackingweb.Commentaire;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CreateDeveloppeur {
    private String nom;
    private String avatar;
    //private List<Bug> bugs;
    //private List<Commentaire> commentaires;
}
