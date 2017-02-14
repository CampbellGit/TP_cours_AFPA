import java.util.Scanner;

public class exercice7 {
	
	public static void main(String[] args) {
		
		int conteneur, taille, i, j;
		float age;
		Scanner sc = new Scanner(System.in);
			
		
		// création du tableau
			System.out.println("Veuillez indiquer le nombre d'entrés de votre tableau :");
			taille = sc.nextInt();
			int table[] = new int [taille];
			
			for (i=0; i<taille; i++)
				{
				System.out.println("Veuillez indiquer l'entrée : " +(i+1));	
				table[i]=sc.nextInt();
				}
			
		// affichage du tableau avant traitemennt	
			System.out.println("Voici votre tableau : ");		
			for (i=0; i<taille; i++)
			{
				System.out.println(table[i]);
			}
			
		// traitement du tabeau
			for (i=0; i<taille; i++)
			{
				for (j=0; j<taille-1; j++)
				{
					if (table[j+1]<table[j])
					{
					conteneur=table[j];
					table[j]=table[j+1];
					table[j+1]=conteneur;
					}
				}
			}
		
		// affichage du tabeau final
			System.out.println("Voici votre tableau final : ");		
			for (i=0; i<taille; i++)
			{
				System.out.println(table[i]);
			}
	}
}