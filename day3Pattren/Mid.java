package day3Pattren;

import java.util.Scanner;

public class Mid {
     public static void main(String[] args) {
           int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nummber of row: ");
        n=sc.nextInt();
        PatternMethod(n);
    }
    public static void PatternMethod(int n){//5
        if(n%2!=0){
            int mid=(n/2)+1; //3
             for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==mid || j==mid){
                     System.out.print("* ");

                }
                else{
                    System.out.print("  ");
                }

                
                 
            }
            System.out.println();
          
        }
          

        }
        else{
            System.out.println("Please Enter a odd number: ");
        }
       
    }
    
}
