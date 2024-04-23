package services;

import entities.Patient;

/**
 * PatientService
 */
public class PatientService {
    private final int N = 10;
    private Patient[] tabPatient = new Patient[N];
    private int n;

    public void addPatient(Patient pat){
        if (n<N) {
            tabPatient[n++]=pat;
        }
    }

    public Patient retrouverPatient(String numero){
        for (int i = 0; i < tabPatient.length; i++) {
            if (tabPatient[i]!=null) {
                if (tabPatient[i].getNumero().equals(numero)) {
                    return tabPatient[i];
                }
            }
        }
        return null;
    }
    public Patient[] listerPatient(){
        return tabPatient;
    }
  
}