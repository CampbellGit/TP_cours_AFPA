import java.util.Scanner;

public class exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int persmoins20 = 0, pers2040 = 0, pers40plus = 0, nbPers = 0;
		float age=0;
		Scanner sc = new Scanner(System.in);
		
		while (age < 100) 
			{
			System.out.println("Veuillez indiquer votre âge en chiffre :");
			age = sc.nextFloat();
			nbPers = nbPers+1;
	
			if (age < 20) 
				{
				persmoins20 = persmoins20+1;
				}
			if (age>=20 && age<=40) 
				{
				pers2040 = pers2040+1;
				}
			if (age>40 && age<100) 
				{
				pers40plus = pers40plus+1;
				}
			if (age>=100) 
				{
				nbPers = nbPers-1;
				}
			System.out.println("Résultats actuels :");
			System.out.println("Jeunes : " +persmoins20);
			System.out.println("20-40 : " +pers2040);
			System.out.println("40+ : " +pers40plus);
			}
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Whaou ! Un centenaire ! C'est beaucoup trop pour moi, voici les résutats finaux :");
		System.out.println("Nombre de jeunes de moins de 20 ans :");
		System.out.println(persmoins20);
		System.out.println("Nombre de moins jeunes (entre 20 et 40) :");
		System.out.println(pers2040);
		System.out.println("Nombre de personne qui si elles n'ont pas de Rolex ont raté leur vie (plus de1 40 ans donc) :");
		System.out.println(pers40plus);
	}
}