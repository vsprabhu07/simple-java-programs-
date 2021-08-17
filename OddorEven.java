package coding;

import java.util.*;

public class OddorEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr a limit");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		System.out.print("Array elemts are:");
		for(int i=0; i<n; i++)
			System.out.print(""+arr[i]+" ");
			System.out.println();
		
		
		for(int i=0; i<n; i++) {
			if(arr[i] % 2==0) {
				System.out.println(arr[i] +" Even number");
			}
			else
			{
				System.out.println(arr[i] +" Odd number");
			}
		}
	}
}
