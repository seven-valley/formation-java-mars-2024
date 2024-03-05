package controller;


	import java.util.Scanner;

	public class MainController {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			String nom;
			int age;	
			System.out.println("saisir age :");
			age = sc.nextInt();
			System.out.println("saisir votre nom :");
			nom = sc.next();
			System.out.println("votre age :"+age+ " , votre nom :"+nom);


		}
	}
		
		
		/*
		 * 		System.out.println("saisir age :");
		age = sc.nextInt();
		System.out.println("saisir votre nom :");
		str = sc.next();
		System.out.println("saisir age :");
		age = sc.nextInt();
		System.out.println("votre age :"+age);
		System.out.println("votre nom :"+str);
		int age = 18;
		if (age >= 18 ) {
			System.out.println("vous êtes majeur");
		}else if (age > 15){ // 15 < age <18 donc 16 et 17
			System.out.println("Je suis adolescent");
		}
		else {
			System.out.println("interdit !");
		}
		*/
		
	


