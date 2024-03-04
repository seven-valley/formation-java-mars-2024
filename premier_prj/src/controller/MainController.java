package controller;

import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int age = 0;
		String nom = "";
		System.out.println("Saisir un age : ");
		age = sc.nextInt();
		System.out.println("Saisir un nom : ");
		nom = sc.next();
		System.out.println("Votre nom est:"+nom);
		System.out.println("Votre age est:"+age);
		if (age >= 18) {
			System.out.println("OK");
		}else {
			System.out.println("Interdit");
		}
	}

}
