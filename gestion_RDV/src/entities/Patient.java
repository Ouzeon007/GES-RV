package entities;



/**
 * Patient
 */
public class Patient {

    private String nomComplet;
    private String telephone;
    private String numero;
    private static int nbrPatient;
    private final int N=10;
    private DemandeRV[] Demande=new DemandeRV[N];


    public Patient() {
        nbrPatient++;
        numero=genererNumeroPatient(nbrPatient);
    }
    public DemandeRV[] getDemande() {
        return Demande;
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        if (!nomComplet.isEmpty()) {
            
        }
        this.nomComplet = nomComplet;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        if (!telephone.isEmpty()) {
            
        }
        this.telephone = telephone;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public static int getNbrPatient() {
        return nbrPatient;
    }
    public static void setNbrPatient(int nbrPatient) {
        Patient.nbrPatient = nbrPatient;
    }

    private String genererNumeroPatient(int nbrPatient) {
       
        String numeroPatient;
        if (nbrPatient < 10) {
            numeroPatient = "PAT00" + nbrPatient;
        } else if (nbrPatient < 100) {
            numeroPatient = "PAT0" + nbrPatient;
        } else {
            numeroPatient = "PAT" + nbrPatient;
        }

        return numeroPatient;
    }
    @Override
    public String toString() {
        return "Patient [nomComplet=" + nomComplet + ", telephone=" + telephone + ", numero=" + numero + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomComplet == null) ? 0 : nomComplet.hashCode());
        result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
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
        Patient other = (Patient) obj;
        if (nomComplet == null) {
            if (other.nomComplet != null)
                return false;
        } else if (!nomComplet.equals(other.nomComplet))
            return false;
        if (telephone == null) {
            if (other.telephone != null)
                return false;
        } else if (!telephone.equals(other.telephone))
            return false;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        return true;
    }
    
}