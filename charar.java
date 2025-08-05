package skill2;
import java.util.Scanner;
public class charar {
	    public static void main(String[] args) {
	        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputStr = sc.nextLine();
	        System.out.println("Character Array as String: " + new String(charArray));
	        System.out.println("Input String: " + inputStr);
	        String converted = new String(charArray);
	        System.out.println("Converted String from char array: " + converted);
	    }
	}



