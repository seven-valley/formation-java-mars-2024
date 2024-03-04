/**
 * 
 */
package tp6_cuisson_structure;

import java.util.Scanner;

/**
 * @author bmartin
 *
 */
public class CalculerTemps_Cuisson {

	//zone de déclaration des variables globales
	static final int BOEUF = 1;
	static final int PORC = 2;
	static final int BLEU = 1;
	static final int A_POINT = 2;
	static final int BIEN_CUIT = 3;
	
	static Scanner sc;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int viande;						
		int cuisson;
		int poids;
		int temps_cuisson;
		
		sc = new Scanner(System.in);
		
		viande = saisir_Type_Viande();
		cuisson = saisir_Type_Cuisson();
		poids = saisir_Poids();
		temps_cuisson = calculerTemps(viande, cuisson, poids);
		System.out.println("Le temps de cuisson est de " + temps_cuisson + " secondes");
		
		sc.close();
	}
	
	
	private static int saisir_Type_Viande() {
		int type_viande;
		do {
			System.out.println("Viande ?");		// Choix du type de viande
			System.out.println(BOEUF + " – Boeuf");
			System.out.println(PORC + " – Porc");
			type_viande = sc.nextInt();
		}while(type_viande != BOEUF && type_viande != PORC);
		return type_viande;
	}
	
	private static int saisir_Type_Cuisson() {
		int type_cuisson;
		do{
			System.out.println("Cuisson ?"); 	// Choix du type de cuisson
			System.out.println(BLEU + " – Bleu");
			System.out.println(A_POINT + " – A point");
			System.out.println(BIEN_CUIT + " – Bien cuit");
			type_cuisson = sc.nextInt();
		}while(type_cuisson != BLEU && type_cuisson != A_POINT
				&& type_cuisson != BIEN_CUIT);
		return type_cuisson;
	}
	
	
	private static int saisir_Poids() {
		int poids;
		do{
			System.out.println("Poids en gramme ?"); // Choix du poids de la viande
			poids = sc.nextInt();
		}while(!(poids > 0));
		return poids;
	}
	
	
	private static int calculerTemps(int viande, int cuisson, int poids) {
		int tempsCuisson;
		if (viande == BOEUF)
			tempsCuisson = traiterBOEUF(cuisson, poids);
		else
			tempsCuisson = traiterPORC(cuisson, poids);
		return tempsCuisson;
	}
	
	
	private static int traiterBOEUF(int cuisson, int poids) {
		final int UNE_MINUTE = 60;
		final float BLEU_B = (float)(10f/500f);	 	
		final float A_PT_B = (float)(17f/500f);	 	
		final float B_CU_B = (float)(25f/500f);
         	
		float coefficient;
		if (cuisson == BLEU)
			coefficient = BLEU_B;
		else if (cuisson == A_POINT)
			coefficient = A_PT_B;
		else
			coefficient = B_CU_B;
		return (int)(poids * coefficient * UNE_MINUTE);
	}
	
	
	private static int traiterPORC(int cuisson, int poids) {
		final int UNE_MINUTE = 60;
		final float BLEU_P = (float)(15f/400f);
		final float A_PT_P = (float)(25f/400f);
		final float B_CU_P = (float)(40f/400f);
		float coefficient;
		if (cuisson == BLEU) 
			coefficient = BLEU_P;	
		else if (cuisson == A_POINT)
			coefficient = A_PT_P;
		else
			coefficient = B_CU_P;
		return (int)(poids * coefficient * UNE_MINUTE);
	}

}
