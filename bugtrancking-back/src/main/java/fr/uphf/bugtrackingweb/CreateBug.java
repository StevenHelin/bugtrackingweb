package fr.uphf.bugtrackingweb;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
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
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date dateC;
    //private Developpeur developpeur;
    //private List<Commentaire> commentaires;
}
