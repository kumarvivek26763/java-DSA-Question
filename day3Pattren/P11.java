package day3Pattren;

import java.util.Scanner;

public class P11 {
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
                  if(i==mid || j==mid || (i==1&&j>mid) || (i==n && j<mid) || (j==1 && mid>i) || (j==n && mid<i)){
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
            System.out.println("Enter number must be Odd");
        }
       
     }
    
}
