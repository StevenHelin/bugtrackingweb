package fr.uphf.bugtrackingweb;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

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
public class Commentaire
{
    @Id
    private int id;
    private String message;
    @ManyToOne
    @JsonBackReference
    private Developpeur developpeur;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date dateP;
    @ManyToOne
    @JsonBackReference
    private Bug bug;
}
