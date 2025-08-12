package skill6;
	import java.util.Scanner;
	public class Prime {
	    public boolean checkPrime(int num) {
	        if (num <= 1) { 
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false; 
	            }
	        }
	        return true; 
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        Prime primeChecker = new Prime();
	        if (primeChecker.checkPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }
	}



