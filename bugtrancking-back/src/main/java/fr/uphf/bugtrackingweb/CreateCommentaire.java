package fr.uphf.bugtrackingweb;

import com.fasterxml.jackson.annotation.JsonFormat;
import fr.uphf.bugtrackingweb.Bug;
import fr.uphf.bugtrackingweb.Commentaire;
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
public class CreateCommentaire {
    private String message;
    private Developpeur auteur;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date dateP;
    private Bug bug;
}
