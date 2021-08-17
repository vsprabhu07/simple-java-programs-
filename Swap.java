package coding;

import java.util.*;

public class Swap {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st number");
		int n1=sc.nextInt();
		
		System.out.println("Enter the 2nd number");
		int n2=sc.nextInt();
		
		System.out.println("Before swapping");
		System.out.println("1st =" +n1);
		System.out.println("2nd =" +n2);
		
		
		/*int temp = n1;			//with using temporary variable
		n1=n2;
		n2=temp;*/
		
		
		n1=n1+n2;			//without using temporary variable
		 n2=n1-n2;
		 n1=n1-n2 ;
		 
		
		
	System.out.println("Afetr swapping");
	System.out.println("1st =" +n1);
	System.out.println("2nd =" +n2);
	}

}
