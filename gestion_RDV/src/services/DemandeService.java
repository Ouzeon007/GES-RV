package services;

import entities.DemandeRV;
import enums.Etat;

public class DemandeService {
    private final int N = 10;
    private DemandeRV[] Demandes = new DemandeRV[N];
    private int n;

    public void saveDemande(DemandeRV dem){
        if ( n < N ) {
            Demandes[n++] = dem;
        }
    }

    public DemandeRV getDemandeById(int id){
        for (int i = 0; i < Demandes.length; i++) {
            if (Demandes[i]!=null) {
                if (Demandes[i].getId()==id) {
                    return Demandes[i];
                }
            }
        }
        return null;
    }

    public void Traitemant(int id,int val){
        
        for (DemandeRV dem : Demandes) {
            if (dem!=null) {
               
            if (dem.getEtat()==Etat.EnCours && dem.getId()==id){
                if (val==1) {
                    dem.setEtat(Etat.Valider);
                }
                if (val==2) {
                    dem.setEtat(Etat.Refuser);
                }
            }
        }
        }
    }
    public DemandeRV[] listerDemande(){
        return Demandes;
    }
}
