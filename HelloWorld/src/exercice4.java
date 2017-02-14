import java.util.Scanner;

public class exercice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phrase;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez indiquer votre phrase :");
		phrase = sc.nextLine();
		
		while (phrase.charAt(phrase.length()-1)!='.')
		{
			System.out.println("On a dit une phrase, il manque un point final (comme les . dans O.K. au fait, on dit \"oké\", pas \"auque\", non ?). Bon, réessayez :");
			phrase = sc.nextLine();
		}
		System.out.println("Longueur de votre entrée, point final non inclus mais espaces comprises :");
		System.out.println(phrase.length()-1);
		}

}