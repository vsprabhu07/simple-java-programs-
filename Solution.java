package coding;

import java.util.Scanner;
class Solution {
    public static void main(String args[]) {
        
        
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int a[] = new int[n];
                
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        
       
        int c=0;
        
        for(int j=0; j<n; j++) {
        for(int i=0; i<n; i++){
            if(a[j]==a[i])
                c++;
            
        }
    j++;
        }
        System.out.println(c);
        
    }
}