package tp8_shaker;
import java.util.Random;

/**
 * 
 */

public class Melangeur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String chaine = "Notre cerveau est formidable car il est capable "
				+ "de lire un mot même si ses lettres sont mélangées";
		
		String[] mots =chaine.split("[ ]");
		
		//concaténations multiples, préférer StringBuffer en lieu et place
		//de String
		String chaineMelangee="";
		for (String mot : mots) {
			String motMelange;
			if (mot.length() > 3)
				motMelange = melanger(mot);
			else
				motMelange = mot;
			//reconstruire la chaine
			chaineMelangee += " " + motMelange;
		}
		System.out.println(chaineMelangee);
		
	}

	/**
	 * @param mot
	 * @return
	 */
	private static String melanger(String mot) {
		char[] tabChar = mot.toCharArray();
		char[] tabCharMelange = new char[tabChar.length];
		//on ne touche pas au 1er et au dernier caractère
		tabCharMelange[0] = tabChar[0];
		tabCharMelange[tabChar.length -1] = tabChar[tabChar.length-1];
		//mélanger les autres caractères...
		Random position = new Random();
		for (int i = 1; i < tabChar.length-1; i++) {
			int index = 0;
			//tirer au sort une position de déplacement tant que
			//la position visée est occupée
			do{
				index = position.nextInt(tabChar.length-1);
			}while(tabCharMelange[index]!='\u0000');
			tabCharMelange[index]=tabChar[i];
		}
		return String.valueOf(tabCharMelange); 
	}

}
