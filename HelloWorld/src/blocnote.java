import java.util.ArrayList;
import java.util.Random;

public class blocnote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			@SuppressWarnings("rawtypes")
			ArrayList<Comparable> db = new ArrayList<Comparable>();
			db.add(12);
			db.add("truc");
			db.add(9999);
			
			for (int i = 0; i< db.size(); i++ )
			{System.out.println("Affichage : " +db.get(i));
			
			}
			
			//generateur de chiffres 
			
			Random rn = new Random();

			for(int i =0; i < 10; i++)
			{
			    int answer = rn.nextInt(100) + 1;
			    System.out.println(answer);
			    db.add(answer);
			}
			
			// affichage liste à jour
			for (int i = 0; i< db.size(); i++ )
			{System.out.println("Affichage : " +db.get(i));
			
			}
	}

}
