package coding;
import java.util.*;
public class compare {

	public static void main(String [] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string");
		String str =sc.nextLine();
		
		System.out.println("enter the second string");
		String str1= sc.nextLine();
		
		if(str.equals(str1)) {
			System.out.println("both are equal");
		}else {
			System.out.println("not equal");
		}
	}
}
