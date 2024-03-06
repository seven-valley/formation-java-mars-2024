package model;

public class Personne {
	private String prenom;
	private String nom;
	private static int indice;
	
	public Personne(String prenom, String nom) {
		indice++;
		this.prenom = prenom;
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public static int getIndice() {
		return indice;
	}

	@Override
	public String toString() {
		return "Personne [prenom=" + prenom + ", nom=" + nom + "]";
	}
	
	
	
}
