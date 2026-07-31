package day3Pattren;

import java.util.Scanner;

public class P10 {
      public static void main(String[] args) {
           int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nummber of row: ");
        n=sc.nextInt();
        PatternMethod(n);
     }
     public static void PatternMethod(int n){
      if(n%2!=0){
         int mid=(n/2)+1;
          for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
               if(i==1 || j==1|| i==n || j==n || i==j || i+j==n+1 || i==mid || j==mid ){
                  System.out.print("* ");

               }else{
                  System.out.print("  ");
               }
            }
            System.out.println();
         }

      }else{
         System.out.println("Enter must be number is Odd");
      }

        
        
     }
     

    
}
