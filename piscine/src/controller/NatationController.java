package controller;

import java.util.Scanner;

public class NatationController {

	private static int[] nageurs ;
	private static String[] nomNageurs = { "Bousquet", "Le veau", "Dubosc"};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		nageurs= new int[nomNageurs.length];
		boolean nager = true;
		do {
		hautPiscine();
		afficheNageur();
		basPiscine();
		sc.nextLine();
		}while(nager);


	}
	public static void afficheNageur() {
		for (int i=0;i<nageurs.length;i++) {
		System.out.print("║");
		
		if (nageurs[i] < 23) { // si aller
			
		
		afficheEspace(nageurs[i]);
		// affiche nageur
		System.out.print("=#o");
		afficheEspace(23-nageurs[i]); // 25 - 3 =2
		}else { // sinon retour
			
			afficheEspace(46-nageurs[i]); //23 +23
			// affiche nageur
			System.out.print("o#=");
			afficheEspace(nageurs[i]-23); // 25 - 3 =2
		}
		System.out.println("║");
		if (nageurs[i]<46) 
			nageurs[i]++;
		}
	}
	public static void afficheEspace(int x) {
		for (int i = 0;i<x;i++){
			System.out.print(" ");
		}
	}
	public static void hautPiscine() {
		System.out.print("╔");
		for (int i = 0;i<26;i++){
			System.out.print("═");
		}
		System.out.println("╗");
	}
	public static void basPiscine() {
		System.out.print("╚");
		for (int i = 0;i<26;i++){
			System.out.print("═");
		}
		System.out.println("╝");
	}

}
