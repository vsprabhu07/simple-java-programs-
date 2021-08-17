package coding;

import java.util.*;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n =sc.nextInt();
		
		int rem;
		int sum=0;
		
		while(n!=0) {
			 rem=n%10;
			 sum = sum*10 +rem;
			 n=n/10;
		}
		System.out.println(sum);
	}

}
