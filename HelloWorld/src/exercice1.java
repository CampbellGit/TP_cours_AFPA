import java.util.Scanner;

public class exercice1 {
	
	public static void main(String[] args) {
		
		int persmoins20 = 0, nbPers = 0;
		float age;
		Scanner sc = new Scanner(System.in);
		do
			{
			System.out.println("Veuillez indiquer votre âge en chiffre :");
			age = sc.nextFloat();
			
			if (age < 20) 
				{
				persmoins20 = persmoins20+1;
				}
			
			nbPers = nbPers+1;
			System.out.println("Résultats actuels");
			System.out.println("Nombre de personnes intérrogées : " +nbPers);
			System.out.println("Personnes de moins de 20 ans : " +persmoins20);
			}
		while (nbPers < 20);
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println("20 personnes ont répondu à l'enquète, voici les résultats :");
		System.out.println("Nombre de personnes intérrogés : " +nbPers);
		System.out.println("Personnes de moins de 20 ans : " +persmoins20);
	}
}