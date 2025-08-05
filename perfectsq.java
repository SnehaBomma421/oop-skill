package week3;
import java.util.Scanner;
public class perfectsq {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	        int sqrt = (int)Math.sqrt(n);
	        if (sqrt * sqrt == n) {
	            System.out.println(n + " is a Perfect Square.");
	        } else {
	            System.out.println(n + " is NOT a Perfect Square.");
	        }
	    }
	}



