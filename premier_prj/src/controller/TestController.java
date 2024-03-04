package controller;

public class TestController {

	
	
	public static void main(String[] args) {
		disBonjour();
		disBonjour();
		disOla("Brad");
		String str = disCoucou("Tom");
		System.out.println(str);
	}
	
	public static void disBonjour() {
		System.out.println("Bonjour!");
	}
	public static void disOla(String nom) {
		System.out.println("Ola "+nom);
	}
	public static String disCoucou(String nom) {
		return ("Coucou "+nom);
	}
}
