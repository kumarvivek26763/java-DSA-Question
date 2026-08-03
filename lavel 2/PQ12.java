
import java.util.Scanner;

public  class PQ12{
     public static void main(String[] args) {
           int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nummber of row: ");
        n=sc.nextInt();
        PatternMethod(n);
    }
    public  static void PatternMethod(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){ //
                 System.out.print("* ");
                
            }
            System.out.println();
        }
    }
}