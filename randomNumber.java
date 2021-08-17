package coding;
import java.util.Scanner;
import java.util.Random;

public class randomNumber {
	
	
	    public static void main(String[] args) 
	    {
	        int maxRange;

	        //create objects
	        Scanner sc= new Scanner(System.in);
	        Random rand = new Random();
	        
	        System.out.print("Please enter maximum range: ");
	        maxRange=sc.nextInt();
	        
	        for(int i=1; i<=5; i++)
	        {
	            System.out.println(rand.nextInt(maxRange));
	        }
	    }
	}



