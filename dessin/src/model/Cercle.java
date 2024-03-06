package model;

public final class Cercle extends Forme{
	private int rayon;

	public Cercle(int x, int y, int rayon) {
		super(x, y);
		this.rayon = rayon;
	}
	//
	
	public float superficie() {
		return rayon*2*3.14f;
	}
	
	public void dicrisToi() {
		// TODO Auto-generated method stub
		
	}
	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + ", x=" + x + ", y=" + y + "]";
	}
	


}
