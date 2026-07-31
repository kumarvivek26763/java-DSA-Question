package day3Pattren;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
           int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nummber of row: ");
        n=sc.nextInt();
        PatternMethod(n);
     }

     public static void PatternMethod(int n){
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i==1 || j==1 ||j==n || i==n ||i==2||j==2||j==n-1||i==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");

                }
            }
            System.out.println();
            
        }
     }
    
}
