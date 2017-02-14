import java.util.Scanner;

public class exercice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phrase_brut, phrase;
		boolean result = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez indiquer votre phrase en incluant un point final :");
		phrase_brut = sc.nextLine();
		// vérif point final
		while (phrase_brut.charAt(phrase_brut.length()-1)!='.')
		{
			System.out.println("J'ai lu un livre sans AUCUNE ponctuation une fois, l'histoire était bien, mais ça faisait mal aux yeux. Bon, réessayez avec un point final :");
			phrase_brut = sc.nextLine();
		}
		
		// suppréssion point final
		phrase=phrase_brut.substring(0, phrase_brut.length()-1);
		
		// comparaison
		int longueur = phrase.length();
	    for( int compteur = 0; compteur < longueur/2; compteur++ )
	        if (phrase.charAt(compteur) != phrase.charAt(longueur-compteur-1))
	    			result = false;
	        else
			{
			result = true;
			}
	    // affichage résultats
	    if (result == true)
		System.out.println("Ceci est un palindrome.");
	    else
	    System.out.println("Ceci n'est pas un palindrome.");	
	}

}