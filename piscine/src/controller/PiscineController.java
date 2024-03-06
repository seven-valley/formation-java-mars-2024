package controller;

import java.util.Scanner;

public class PiscineController {
	private static int x;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean nager = true;
		do {
			hautPiscine();
			afficheNageur();
			basPiscine();
			sc.nextLine();
		} while (nager);

	}

	public static void afficheNageur() {
		System.out.print("║");

		afficheEspace(x);
		// affiche nageur
		System.out.print("=#o");
		afficheEspace(23 - x); // 25 - 3 =2
		if (x < 23) {
			x++;
		}
		System.out.println("║");
	}

	public static void afficheEspace(int x) {
		for (int i = 0; i < x; i++) {
			System.out.print(" ");
		}
	}

	public static void hautPiscine() {
		System.out.print("╔");
		for (int i = 0; i < 26; i++) {
			System.out.print("═");
		}
		System.out.println("╗");
	}

	public static void basPiscine() {
		System.out.print("╚");
		for (int i = 0; i < 26; i++) {
			System.out.print("═");
		}
		System.out.println("╝");
	}

}
