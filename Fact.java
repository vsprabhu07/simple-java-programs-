package coding;

import java.util.*;

public class Fact {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println(fact(n));
	}
		
		static int fact(int n) {
			if(n==0) {
				return 1;
			}
			else {
				return n*fact(n-1);
			}
			
		}
	

}
