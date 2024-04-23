package entities;

import enums.Etat;
import enums.Specialite;

public class DemandeRV {
    private int id;
    private String date;
    private String heure;
    private String motif;
    private Etat etat;
    private Specialite specialite;
    private Patient patient;
    private static int ndbDemandes;

    public DemandeRV() {
        ndbDemandes++;
        id=ndbDemandes;
        etat=Etat.EnCours;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getHeure() {
        return heure;
    }
    public void setHeure(String heure) {
        this.heure = heure;
    }
    public String getMotif() {
        return motif;
    }
    public void setMotif(String motif) {
        this.motif = motif;
    }
    public Etat getEtat() {
        return etat;
    }
    public void setEtat(Etat etat) {
        this.etat = etat;
    }
    public Specialite getSpecialite() {
        return specialite;
    }
    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }
    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((heure == null) ? 0 : heure.hashCode());
        result = prime * result + ((motif == null) ? 0 : motif.hashCode());
        result = prime * result + ((etat == null) ? 0 : etat.hashCode());
        result = prime * result + ((specialite == null) ? 0 : specialite.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DemandeRV other = (DemandeRV) obj;
        if (id != other.id)
            return false;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (heure == null) {
            if (other.heure != null)
                return false;
        } else if (!heure.equals(other.heure))
            return false;
        if (motif == null) {
            if (other.motif != null)
                return false;
        } else if (!motif.equals(other.motif))
            return false;
        if (etat != other.etat)
            return false;
        if (specialite != other.specialite)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "DemandeRV [id=" + id + ", date=" + date + ", heure=" + heure + ", motif=" + motif + ", etat=" + etat
                + ", specialite=" + specialite + ", patient=" + patient + "]";
    }
    
    

}
