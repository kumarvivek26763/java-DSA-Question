package day3Pattren;

import java.util.Scanner;

public class MattrixP7 {
     public static void main(String[] args) {
           int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nummber of row: ");
        n=sc.nextInt();
        PatternMethod(n);
    }
    public static void PatternMethod(int n){
        for(int i=1; i<=n; i++){ //1
            for(int j=1; j<=n; j++){
                System.out.print( "("+i+","+j+") ");
            }
            
          System.out.println(" ");
        }
    }
}
