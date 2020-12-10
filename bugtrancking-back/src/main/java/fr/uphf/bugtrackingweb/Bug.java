package fr.uphf.bugtrackingweb;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.*;
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
public class Bug {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String titre;
    private String description;
    private String priorite;
    private String etat;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date dateC;
    @ManyToOne
    //@JsonBackReference
    private Developpeur developpeur;
    @OneToMany(mappedBy = "bug", orphanRemoval=true)
    //@JsonManagedReference
    private List<Commentaire> commentaire;
}
