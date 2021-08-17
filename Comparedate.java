package coding;

import java.util.Date;

public class Comparedate {
	public static void main(String[] args) {
		Date d1= new Date();
		Date d2= new Date();
		
		if(d1.before(d2)) {
			System.out.println("d1 is before d2");
		}
		
		if(d1.after(d2)) {
			System.out.println("d1 is after d2");
		}
		
		if(d1.equals(d2)) {
			System.out.println("Both dates are equal");
		}
	}

}
