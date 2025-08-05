package skill2;
import java.util.Scanner;
public class strbuilding {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first string: ");
	        StringBuilder sb1 = new StringBuilder(sc.nextLine());
	        System.out.print("Enter second string: ");
	        StringBuilder sb2 = new StringBuilder(sc.nextLine());
	        System.out.println("First String: " + sb1);
	        System.out.println("Second String: " + sb2);
	        System.out.println("After joining (Second String): " + sb2);
	        System.out.println("After joining (First String) " + sb1);
	    }
	}


