import java.util.Scanner;

public class exercice10 {
	
	public static void main(String[] args) {
		
		// Variables
		String phrase_finale = null, inversion = null, phrase_originelle, pointeur, mot = null, derniere_lettre;
		int longueur_mot, compteur=0, remplir, longueur_phrase, remplir2, longueur_finale;
		Scanner sc = new Scanner(System.in);
		
		
		// Programme
		
		System.out.println("Veuillez indiquer votre phrase :");
		phrase_originelle = sc.nextLine();
		
		
		pointeur = phrase_originelle.substring(compteur, compteur);
		longueur_phrase = phrase_originelle.length();
		
		while (compteur<longueur_phrase)
			while (pointeur!=" " && pointeur!=".")
				{
				if (pointeur != ".")
					{
					mot = mot+pointeur;
					compteur++;
					pointeur = phrase_originelle.substring(compteur, compteur);
					}
				}
			longueur_mot = mot.length();
		for (remplir=0; remplir<longueur_mot; longueur_mot++)
			{
			inversion = inversion+mot.substring(longueur_mot-remplir, 1);
			}
		phrase_finale = phrase_finale+inversion;
		
		phrase_finale = phrase_finale +" ";
		compteur++;
		pointeur = phrase_originelle.substring(compteur, 1);
		mot = "";
		inversion = "";
		
		while (pointeur == " ")
			{
			compteur++;
			pointeur = phrase_originelle.substring(compteur, compteur);
			}
		
		derniere_lettre = phrase_finale.substring(phrase_finale.length()-1, phrase_finale.length());
		
		if (derniere_lettre == " ");
		{
			phrase_finale = phrase_finale.substring(0, phrase_finale.length());
		}
		if (phrase_finale.substring(0,1)==" ")
			phrase_finale = phrase_finale.substring(1, phrase_finale.length());
		
		phrase_finale = phrase_finale+".";
		if (phrase_finale.substring(phrase_finale.length()-2,1)==" ")
		    phrase_finale = phrase_finale.substring(0,phrase_finale.length()-2);
		    phrase_finale = phrase_finale+".";
		    
			System.out.println(phrase_finale);   
		
				
				
	}
}