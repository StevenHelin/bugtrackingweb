package fr.uphf.bugtrackingweb;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Commentaire
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idCom;
    private String message;
    @ManyToOne
    private Developpeur auteur;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date date;
    @ManyToOne
    private Bug bug;

    public int getIdCom() {
        return idCom;
    }

    public void setIdCom(int idCom) {
        this.idCom = idCom;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Developpeur getAuteur() {
        return auteur;
    }

    public void setAuteur(Developpeur auteur) {
        this.auteur = auteur;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Bug getBug() {
        return bug;
    }

    public void setBug(Bug bug)
    {
        this.bug = bug;
    }
}
