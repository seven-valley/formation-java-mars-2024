package model;

public class Rectangle extends Forme{

	protected int longueur;
	protected int largeur;
	
	public Rectangle(int x, int y, int longueur, int largeur) {
		super(x, y);
		this.longueur = longueur;
		this.largeur = largeur;
	}
	public int superficie() {
		return longueur *largeur;
	}
	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + ", x=" + x + ", y=" + y + "]";
	}
	



}
