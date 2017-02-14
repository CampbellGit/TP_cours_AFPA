import java.util.Scanner;

public class Fonction {
	public static String pointfinal(String phrase, Scanner sc) {
		while (phrase.charAt(phrase.length()-1)!='.')
			{
			System.out.println("Tut tut, il manque un point final, réessayez :");
			phrase = sc.nextLine();
			}
		return phrase;
}
}
