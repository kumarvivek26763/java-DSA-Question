package day3Pattren;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
           int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nummber of row: ");
        n=sc.nextInt();
        PatternMethod(n);
    }

    public static void PatternMethod(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){

                System.out.print( j%2 +" ");   //whern we want to 1 colom 1 and second colom 0 so bulid logic like j%2;
            }
            System.out.println();
        }
    }
}
