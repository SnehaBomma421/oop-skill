package skill5;
import java.util.Scanner;
public class Search {
		public static void main(String[] arg)
		{
			Scanner sc=new Scanner(System.in);
			int n;
			System.out.println("Enter the no of elements in array:");
			n=sc.nextInt();
			int temp;
			System.out.println("Enter the element to be searched:");
			temp=sc.nextInt();
			int[] a=new int[n];
			System.out.println("Enter the elements in the array:");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int count=0;
			for(int i=0;i<n;i++)
				if(a[i]==temp)
					count++;
			System.out.println("The no of times "+temp+" appered in the array is "+count);
		}
	}


