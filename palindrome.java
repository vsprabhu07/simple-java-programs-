
package coding;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rev = "";
		
		System.out.println("Enter string");
		String  str = sc.nextLine();
		for(int i=str.length() -1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		if(rev.equals(str)) {
			System.out.println(str+" is palindrome");
		}else {
			System.out.println(str= " is not palindrome");
		}
	}
}

	