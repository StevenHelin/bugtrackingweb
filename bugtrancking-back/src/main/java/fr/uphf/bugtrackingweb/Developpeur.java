package fr.uphf.bugtrackingweb;

import javax.persistence.*;
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
public class Developpeur
{
    @Id
    private int idDev;
    private String nom;
    private String avatar;
    @OneToMany
    private List<Bug> bugs;
    @OneToMany
    private List<Commentaire> commentaires;

}