package fr.uphf.bugtrackingweb;

import javax.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class Developpeur
{
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String avatar;
    @OneToMany(mappedBy = "developpeur")
    //@JsonManagedReference
    private List<Bug> bugs;
    @OneToMany(mappedBy = "developpeur")
    //@JsonManagedReference
    private List<Commentaire> commentaires;

}
