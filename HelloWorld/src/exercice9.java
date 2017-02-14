import java.awt.List;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class exercice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// variables

		ArrayList<ClasseSal> db = new ArrayList<ClasseSal>();
		int reponse, salairenew, del, matriculenew ;		
		Scanner sc = new Scanner(System.in);
		String nomnew;
		
		ClasseSal m1 = new ClasseSal();
		m1.setNom("Penelope");
		m1.setMatricule(1001);
		m1.setSalaire(3677);
		db.add(m1);
		
		ClasseSal m2 = new ClasseSal();
		m2.setNom("Michel");
		m2.setMatricule(1002);
		m2.setSalaire(1001);
		db.add(m2);
		ClasseSal m3 = new ClasseSal();
		m3.setNom("Kevin");
		m3.setMatricule(1003);
		m3.setSalaire(525);
		db.add(m3);
		
		
	
		
		// programme
		
		
		// menu
		
		do
		{
		System.out.println("Veuillez indiquer le chiffre de l'action que vous souhaitez effectuer :");
		System.out.println("1. Créer une fiche.");
		System.out.println("2. Détruire une fiche.");
		System.out.println("3. Voir une fiche.");
		System.out.println("4. Lister les fiches par ordre croissant de salaire.");
		System.out.println("5. Quitter.");
		reponse = sc.nextInt();
		
				
		// fonction créer fiche
		if (reponse == 1)
		{
		ClasseSal newemp = new ClasseSal();
		System.out.println("Création d'une nouvelle fiche :");
		System.out.println("Veuillez indiquer le nom du salarié :");
		sc.nextLine();
		nomnew = sc.nextLine();
		newemp.setNom(nomnew);
		
		System.out.println("Veuillez indiquer le salaire du salarié :");
		salairenew = sc.nextInt();
		newemp.setSalaire(salairenew);
		
		System.out.println("Veuillez indiquer le matricule du salarié (chiffres uniquement) :");
		sc.nextLine();
		matriculenew = sc.nextInt();
		newemp.setMatricule(matriculenew);

		db.add(newemp);
		}
		
				
		// fonction détruire fiche
		if (reponse == 2)
		{
			System.out.println("Voici la liste des matricules actuels :");
			//for (i=0; i<db.size(); i++)
			for (ClasseSal classeSal : db) {				
				System.out.println(classeSal.getMatricule());
			}


			System.out.println("Veuillez indiquer le matricule du salarié à SUPPRIMER :");
			sc.nextLine();
			del = sc.nextInt();
			for (ClasseSal classeSal : db)
				{
				if (classeSal.matricule==del)
				{
					 db.remove(classeSal);		
					 break;
				}
				}			
		}
		
		// fonction voir fiche
		if (reponse == 3)
		{
			System.out.println("Voici la liste des matricules actuels :");
			//for (i=0; i<db.size(); i++)
			for (ClasseSal classeSal : db) {				
				System.out.println(classeSal.getMatricule());
			}


			System.out.println("Veuillez indiquer le matricule du salarié à AFFICHER :");
			sc.nextLine();
			del = sc.nextInt();
			for (ClasseSal classeSal : db) {
				if (classeSal.matricule==del)
				{
				System.out.println("Nom : " +classeSal.getNom());
				System.out.println("Matricule : "+classeSal.getMatricule());
				System.out.println("Salaire : "+classeSal.getSalaire());
				}
			}		
		}
		
		
		// fonction listage (ordre croissant) fiches

		if (reponse == 4)
		{
			System.out.println("Voici la liste actuelle des matricules :");
			//for (i=0; i<db.size(); i++)
			for (ClasseSal classeSal : db) {				
				System.out.println(classeSal.getMatricule());
			}
			System.out.println("Voici la liste en ordre croissant des matricules :");
			Collections.sort(db,(p1, p2) -> p1.getMatricule()-p2.getMatricule());
			
			for (ClasseSal classeSal : db) {				
				System.out.println(classeSal.getMatricule());
			}


			}
		
		}
		while (reponse !=5);
		}

}
