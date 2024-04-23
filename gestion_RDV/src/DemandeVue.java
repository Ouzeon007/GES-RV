import java.util.Scanner;

import entities.DemandeRV;
import enums.Etat;
import enums.Specialite;

/**
 * DemandeVue
 */
public class DemandeVue {

    public  DemandeRV saisiDemande(Scanner scanner){
        int x;
        DemandeRV dem=new DemandeRV();
        
        do {
            System.out.println("enter la date du RV");
            dem.setDate(scanner.nextLine());
        } while (dem.getDate().isEmpty());
        do {
            System.out.println("enter l'heure du RV");
            dem.setHeure(scanner.nextLine());
        } while (dem.getHeure().isEmpty());
        do {
            System.out.println("enter le motif du RV");
            dem.setMotif(scanner.nextLine());
        } while (dem.getMotif().isEmpty());
        
        do {
            System.out.println("1-Cardiologie");
            System.out.println("2-Ophtalmologie");
            System.out.println("3-Urologue");
            System.out.println("enter la specialisation du RV");
            x=scanner.nextInt();
        } while (x<1 && x>3);
        if (x==1) {
            dem.setSpecialite(Specialite.Cardiologie);
        }
        if (x==1) {
            dem.setSpecialite(Specialite.Ophtalmologie);
        }
        if (x==1) {
            dem.setSpecialite(Specialite.Urologue);
        }
        return dem;
    }


        public int demanderIdDemande(Scanner scanner){
            System.out.println("Veullez entrer l'id de la commande");
            return scanner.nextInt();
        }
        public int validation(Scanner scanner){
            System.out.println("1-Valider");
            System.out.println("2-Refuser");
            System.out.println("Faites votre choix");
            return scanner.nextInt();
        }

        public void listerClient(DemandeRV[] Demandes){
            for (int i = 0; i < Demandes.length; i++){
                if (Demandes[i] != null){
                    System.out.println(Demandes[i]);
                }
            }   
        }

        public void listerDemandeEncours(DemandeRV[] demandes){
            System.out.println("A-Encours");
            for (int i = 0; i < demandes.length; i++) {
                if (demandes[i]!=null) {
                    if (demandes[i].getEtat()==Etat.EnCours) {
                        
                        System.out.println(demandes[i]);
                    }
                
                }
            }
        }
        public void listerDemandeValider(DemandeRV[] demandes){
            System.out.println("B-Valider");
            for (int i = 0; i < demandes.length; i++) {
                if (demandes[i]!=null) {
                    if (demandes[i].getEtat()==Etat.Valider) {
                        
                        System.out.println(demandes[i]);
                    }
                
                }
            }
        }
        public void listerDemandeRefuser(DemandeRV[] demandes){
            System.out.println("C-Refuser");
            for (int i = 0; i < demandes.length; i++) {
                if (demandes[i]!=null) {
                    if (demandes[i].getEtat()==Etat.Refuser) {
                        
                        System.out.println(demandes[i]);
                    }
                
                }
            }
        }
        public void listerCardiologie(DemandeRV[] demandes){
            System.out.println("A-Cardiologie");
            for (int i = 0; i < demandes.length; i++) {
                if (demandes[i]!=null) {
                    if (demandes[i].getSpecialite()==Specialite.Cardiologie) {
                        
                        System.out.println(demandes[i]);
                    }
                
                }
            }
        }
        public void listerOphtalmologie(DemandeRV[] demandes){
            System.out.println("B-Ophtalmologie");
            for (int i = 0; i < demandes.length; i++) {
                if (demandes[i]!=null) {
                    if (demandes[i].getSpecialite()==Specialite.Ophtalmologie) {
                        
                        System.out.println(demandes[i]);
                    }
                
                }
            }
        }
        public void listerUrologie(DemandeRV[] demandes){
            System.out.println("C-Urologue");
            for (int i = 0; i < demandes.length; i++) {
                if (demandes[i]!=null) {
                    if (demandes[i].getSpecialite()==Specialite.Urologue) {
                        
                        System.out.println(demandes[i]);
                    }
                
                }
            }
        }
}