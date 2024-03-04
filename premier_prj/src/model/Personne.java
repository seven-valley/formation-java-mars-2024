package model;

public class Personne {
	// business Model
	// zone attributs propriété
	private String prenom;
	private String nom;
	
	private String getFullName() {
		return prenom + " " +nom;
	}
	
	public Personne(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}
	public Personne(String prenom) {
		this.prenom = prenom;
	}
	public Personne() {
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

	@Override
	public String toString() {
		//return "Personne [prenom=" + prenom + ", nom=" + nom + "]";
		 return getFullName();
	}
	
	


	
}
