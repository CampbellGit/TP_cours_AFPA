import java.io.*;
import java.util.Scanner;

public class creafichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nomfich;
		int n;
		System.out.println("Donnez le nom du fichier à créer :");
		nomfich = sc.nextLine();
		DataOutputStream sortie = new DataOutputStream
								(new FileOutputStream (nomfich));
		do {
			System.out.print("Donnez un entier : ");
			n = sc.nextInt();
			if (n != 0);
			{
				sortie.writeInt (n);
				
			}
		}
		while (n != 0);
		sortie.close();
		System.out.println("---- fin création de fichier. ----");
	}
}