package coding;

import java.util.*;

public class Prime {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number");
		int n =sc.nextInt();
		
	
	boolean flag=false;
		if(n==0 || n==1) {
		     flag=false;
		} 
		else{
			for(int i=2; i<n; i++) {
				if(n%i==0)
					 flag =true ;
			}
	
	}
	if(flag==true) {
		System.out.println(n +" is  not prime");
	}
	else {
		System.out.println(n +" is prime");
	}
}
}
