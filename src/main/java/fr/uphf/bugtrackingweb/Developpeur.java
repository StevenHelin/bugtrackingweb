package fr.uphf.bugtrackingweb;

import javax.persistence.*;
import java.util.List;

@Entity
public class Developpeur
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idDev;
    private String nom;
    private String avatar;
    @OneToMany
    private List<Bug> bugs;

    public int getIdDev() {
        return idDev;
    }

    public void setIdDev(int idDev) {
        this.idDev = idDev;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public List<Bug> getBugs() {
        return bugs;
    }

    public void setBugs(List<Bug> bugs) {
        this.bugs = bugs;
    }
}
