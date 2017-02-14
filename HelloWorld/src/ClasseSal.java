import java.util.ArrayList;

public class ClasseSal {

	public String matricule;
	private String nom;
	private int salaire;

	// ************* ACCESSEURS *************

	// Retourne le matricule
	public String getMatricule() {
		return matricule;
	}

	public String getNom() {
		return nom;
	}

	public int getSalaire() {
		return salaire;
	}
	public String toString() {
		  return "Employé : " + nom + ", " + matricule + "," +salaire;
		}

	// ************* MUTATEURS *************

	// Définit le matricule
	public void setMatricule(String _Matricule) {
		matricule = _Matricule;
	}
	
	// Définit le nom
	public void setNom(String _Nom) {
		nom = _Nom;
	}

	public void setSalaire(int _salaire) {
		salaire = _salaire;
	}

	public static void sort(ArrayList<ClasseSal> matricule2) {
		// TODO Auto-generated method stub
		
	}



	
	
	
	
	
	
	
}