import java.io.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    String phrase = "le chat est tres gris";
		    String[] str =phrase.split(" ");
		    StringBuffer buffer = new StringBuffer();
		    StringBuilder lettres = new StringBuilder(phrase);
		    String phrase_inverse = lettres.reverse().toString();
		    for(int i=str.length-1;i>=0;i--)
		    {
		        buffer.append(str[i]);
		        buffer.append(" ");
		    }
		    System.out.println("\nOriginal string: " );
		    System.out.println("Reverse word string:"+buffer.toString());
		    String string=buffer.toString();
		    String reverse = new StringBuffer(string).reverse().toString();
		    System.out.println(reverse+".");
		    

		    }
		}
	


