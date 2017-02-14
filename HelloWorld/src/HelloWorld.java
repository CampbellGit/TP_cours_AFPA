import java.util.Scanner;

public class HelloWorld {
public static void main(String[] args) {
System.out.println("Hello world!");	
Scanner sc = new Scanner(System.in); 
System.out.println("Veuillez indiquer :");
String str = sc.nextLine();
System.out.println("Vous avez saisi : " + str);
System.out.println("Veuillez indiquer chiffre :");
int chiffre = sc.nextInt();
System.out.println("Vous avez saisi : " + chiffre);

}
}
