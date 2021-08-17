package coding;

import java.util.*;

public class BigAndSmall {
	public static void main (String[] args) {
		//int arr[] = new int[] {12,25,36,5,2,4,21,152,521,-25};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		
		int arr[] =new int[n];
		System.out.println("Enter the numbers");
		
		for(int i=0; i<n; i++)
		 arr[i] =sc.nextInt();
		
		 int min=arr[0];
		 int max=arr[0];
		 
		 for(int i=0; i<arr.length;i++) {
			 if(arr[i]<min) {
				 min=arr[i];
			 } 
				 
			 if(arr[i]>max) {
				 max=arr[i];
			 }
			 
		 }
		System.out.println("smallest number = "+min);
		System.out.println("Biggest number  =" +max);
		}
	}


