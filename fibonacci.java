package week3;
import java.util.Scanner;
public class fibonacci {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of terms (n): ");
	        int n = sc.nextInt();
	        int a = 0, b = 1;
	        System.out.println("Fibonacci Series up to " + n + " terms:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(a + " ");
	            int temp = a + b;
	            a = b;
	            b = temp;
	        }
	    }
	}


