import java.util.Scanner;

public class exercice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int occurences = 0, compteur = 0;
		String extrait, caractere1, caractere2, conteneur = null;
		char terminateur=0;
		Scanner sc = new Scanner(System.in);
		String phrase;
		System.out.println("Veuillez indiquer votre phrase :");
		phrase = sc.nextLine();
		while (phrase.equals(""))
			{
			System.out.println("Bon cette fois, on va rien dire pour le point final, par contre s'il n'y a rien on ne va pas avancer, entrez AU MOINS quelque chose :");
			phrase = sc.nextLine();
			}
		
		System.out.println("Veuillez indiquer le premier caractère :");
		caractere1 = sc.nextLine().substring(0);
		while (caractere1.equals(""))
			{
			System.out.println("Non, ça ne marche pas si vous n'indiquez rien :");
			caractere1 = sc.nextLine();
			}
		
		System.out.println("Veuillez indiquer le second caractère :");
		caractere2 = sc.nextLine().substring(0);
		while (caractere2.equals(""))
			{
			System.out.println("Essayez d'appuyer sur une autre touche que Entrée, ça marchera mieux :");
			caractere2 = sc.nextLine();
			}
		
		extrait = caractere1+caractere2;
		System.out.println("Veuillez indiquer le caractère terminateur :");
		terminateur = sc.nextLine().charAt(0);

		while (compteur<phrase.length() && phrase.charAt(compteur)!=terminateur)
			{		
			conteneur = phrase.substring(compteur, compteur+2);
		
			if (conteneur.equals(extrait))
					{
					occurences++;
					}
			compteur++;
			}

		System.out.println("Occurences successives des deux caractères indiqués : " + occurences);
	}
}

