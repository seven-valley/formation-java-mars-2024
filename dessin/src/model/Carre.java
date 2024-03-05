package model;

public final class Carre  extends Rectangle{
	

	public Carre(int x, int y, int cote) {
		super(x, y, cote, cote);
		
	}

	@Override
	public String toString() {
		return "Carre [cote=" + longueur + ", x=" + x + ", y=" + y + "]";
	}
	
	
	
}
