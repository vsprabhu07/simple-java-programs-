package coding;
import java.util.*;

public class Inverttriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int n =sc.nextInt();
		
		while(n >0) {
			for(int i=0; i<n; i++) {
				System.out.print(" "+n+" ");
			}
			System.out.print("\n");
			n--;
		}
	}
}
