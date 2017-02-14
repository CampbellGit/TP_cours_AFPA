import java.util.Scanner;

public class exercice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int occurences = 0;
		String phrase;
		char caractère;
		Scanner sc = new Scanner(System.in);
		Fonction f = new Fonction();
		
		System.out.println("Veuillez indiquer votre phrase :");
		phrase = sc.nextLine();
		
		phrase = f.pointfinal(phrase, sc);

		System.out.println("Veuillez indiquer votre caractère :");
		caractère = (sc.nextLine()).charAt(0);
		for (int compteur = 0; compteur<phrase.length(); compteur++)
			{
			if(phrase.charAt(compteur) == caractère)
				{
				occurences++;
				}
			}
		System.out.println("Le caractère choisi était : "+caractère);
		System.out.println("Occurences du caractère : " + occurences);
		}

	
	}



