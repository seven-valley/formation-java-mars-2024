package model;

public class Forme {
	private int x;
	private int y;
	
	public Forme(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public void seDeplacer(int x, int y) {
		this.x = this.x +x;
		this.y = this.y +y;
	}
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
