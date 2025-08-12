package skill4;
import java.util.Scanner;
import java.util.Calendar;
public class Age {
	    public static void main(String[] arg) {
	        Scanner sc = new Scanner(System.in);
	        int date, month, year;
	        date = sc.nextInt();
	        month = sc.nextInt();
	        year = sc.nextInt();

	        Calendar cal = Calendar.getInstance();
	        int caldate = cal.get(Calendar.DAY_OF_MONTH);
	        int calmonth = cal.get(Calendar.MONTH) + 1; // 0-based
	        int calyear = cal.get(Calendar.YEAR);

	        int age = calyear - year;
	        if (month > calmonth || (month == calmonth && date > caldate)) {
	            age--;
	        }

	        System.out.print(age);
	    }
	}


