package model;

public abstract class Forme {
	protected int x;
	protected int y;
	
	public Forme(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	
	public final void seDeplacer(int x, int y) {
		this.x = this.x +x;
		this.y = this.y +y;
	}
	
	// lancer un contrat aux classes filles
	public abstract void dicrisToi();
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Forme [x=" + x + ", y=" + y + "]";
	}
	
	
}
