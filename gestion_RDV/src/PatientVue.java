import java.util.Scanner;

import entities.Patient;

/**
 * PatientVue
 */
public class PatientVue {

    public Patient saisiPatient(Scanner scanner){
        Patient pat=new Patient();
        scanner.nextLine();
        do {
            System.out.println("enter le nom complet du patient");
            pat.setNomComplet(scanner.nextLine());
            
        } while (pat.getNomComplet().isEmpty() );
        do {
            System.out.println("enter le nom complet du patient");
            pat.setTelephone(scanner.nextLine());
        } while (pat.getTelephone().isEmpty());
        return pat;
        
    }
    public String demanderNumero(Scanner scanner){
        scanner.nextLine();
        System.out.println("Veullez entrer le numero du patient");
        return scanner.nextLine();
    }
    public void listerClient(Patient[] patients){
        for (int i = 0; i < patients.length; i++){
            if (patients[i] != null){
                System.out.println(patients[i]);
            }
        }   
    }
}