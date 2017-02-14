import java.io.*;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String phrase;

			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez indiquer votre phrase :");
			phrase = sc.nextLine();
		
			while (phrase.charAt(phrase.length()-1)!='.')
			{
				System.out.println("On a dit une phrase, il manque un point final, réessayez :");
				phrase = sc.nextLine();
			}
			phrase = phrase.substring(0, phrase.length() - 1);
		    phrase = phrase.replaceAll("\\s+", " ");
		    
		    String[] str =phrase.split(" ");
		    StringBuffer buffer = new StringBuffer();

		    for(int i=str.length-1;i>=0;i--)
		    {
		        buffer.append(str[i]);
		        buffer.append(" ");
		    }


		    String string=buffer.toString();
		    String reverse = new StringBuffer(string).reverse().toString();
		    reverse = reverse.trim();
		    System.out.println(reverse+".");
		    

		    }
		}
	


