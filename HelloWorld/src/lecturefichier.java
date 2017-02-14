import java.io.*;
import java.util.Scanner;

public class lecturefichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		
		//variables
		Scanner sc = new Scanner(System.in);
		String nomfich;
		int n = 0;
		
		System.out.println("Donnez le nom du fichier à lister :");
		nomfich = sc.nextLine();
		DataInputStream entree = new DataInputStream
								(new FileInputStream (nomfich));
		
		System.out.println("Valeurs lues dans le fichier " +nomfich +" : ");
		boolean eof = false; // fin du fichier
		while (!eof)
		{
			try
			{
				n = entree.readInt();
			}
			catch (EOFException e)
			{
				eof = true;
			}
			if (!eof) System.out.println(n);
			
		}
		entree.close();
		System.out.println("----Fin liste fichier----");
	
	}
}