package fr.uphf.bugtrackingweb;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

//test
@Entity
public class Bug {
    @Id
    private int idBug;
    private String titre;
    private String description;
    private String priorite;
    private String etat;
    private String dateC;
    @ManyToOne
    private Developpeur developpeur;
    @OneToMany
    private List<Commentaire> commentaire;

    public int getIdBug() {
        return idBug;
    }

    public void setIdBug(int idBug) {
        this.idBug = idBug;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriorite() {
        return priorite;
    }

    public void setPriorite(String priorite) {
        this.priorite = priorite;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;

    }

    public String getDateC(){
        return dateC;
    }

    public void setDateC(String date) {
        this.dateC = date;
    }

    public void suppBug(int idBug){}
}
