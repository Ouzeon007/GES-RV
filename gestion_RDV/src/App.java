import java.util.Scanner;

import entities.DemandeRV;
import entities.Patient;
import services.DemandeService;
import services.PatientService;

public class App {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        int choix;
        PatientVue patientVue = new PatientVue();
        DemandeVue demandeVue=new DemandeVue();
        DemandeService demandeService=new DemandeService();
        PatientService patientService=new PatientService();

        do {
            choix=Menu();
            switch (choix) {
                case 1 ->{
                    Patient pat=patientVue.saisiPatient(scanner);
                    patientService.addPatient(pat);
                }
                case 2 ->{
                    patientVue.listerClient(patientService.listerPatient());
                }
                case 3->{
                    Patient pat = patientService.retrouverPatient(patientVue.demanderNumero(scanner));
                    if ( pat == null ) {
                        System.out.println("Ce client n'existe pas");
                    } else {
                        DemandeRV dem = demandeVue.saisiDemande(scanner);
                        dem.setPatient(pat);
                        demandeService.saveDemande(dem);
                    }
                }
                case 4->{
                    demandeVue.listerDemandeEncours(demandeService.listerDemande());
                    demandeVue.listerDemandeValider(demandeService.listerDemande());
                    demandeVue.listerDemandeRefuser(demandeService.listerDemande());
                }
                case 5->{
                    demandeVue.listerCardiologie(demandeService.listerDemande());
                    demandeVue.listerOphtalmologie(demandeService.listerDemande());
                    demandeVue.listerUrologie(demandeService.listerDemande());
                }
                case 6->{
                    demandeService.Traitemant(demandeVue.demanderIdDemande(scanner),demandeVue.validation(scanner));
                }
            }
                
                    
                
            }while (choix!=7);
        
    }

    public static int Menu(){
        System.out.println("-------------------------------------------");
        System.out.println("1-Ajouter un Patient dans le Tableau");
		System.out.println("2- Lister tous les patients du Tableau");
		System.out.println("3- Enregistrer un RV pour un patient");
		System.out.println("4- Lister tous les RV par Etat");
		System.out.println("5- Lister tous les RV par Spécialité");
		System.out.println("6- Traiter RV");
		System.out.println("7- Quitter");

        System.out.println("-------------------------------------------");
        System.out.println("Veuiller faire votre choix");
        return scanner.nextInt();
    }
}