package week3;
import java.util.Scanner;
public class bills {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of units consumed: ");
	        int units = sc.nextInt();
	        int totalBill = 0;
	        if (units >= 51 && units <= 100) {
	            totalBill = units * 3;
	        } 
	        else if (units >= 101 && units <= 300) {
	            totalBill = (units * 5) + 100;
	        } 
	        else if (units >= 301 && units <= 450) {
	            totalBill = (units * 6) + 200;
	        } 
	        else if (units > 450) {
	            totalBill = (units * 8) + 250;
	        } 
	        else {
	            System.out.println("Units must be greater than 50.");
	            return;
	        }
	        System.out.println("Units Consumed: " + units);
	        System.out.println("Total Bill Amount: Rs. " + totalBill);
	    }
	}


