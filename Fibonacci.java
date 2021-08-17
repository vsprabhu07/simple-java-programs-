package coding;

import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int n =sc.nextInt();
		fibo(n);
		
	}
	
	static  void fibo (int n) {
		int num1=0, num2=1;
		int count=0;
		while(count<n) {
			System.out.print(num1);
			
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			count +=1;
		}
	}

}

