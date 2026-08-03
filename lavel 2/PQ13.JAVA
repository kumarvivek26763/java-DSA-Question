
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
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i+1; j++){ //This is the inverted triangle
        //          System.out.print("* ");
                
        //     }
        //     System.out.println();
          
        // }
        int patternSize=n;

          for(int i=1; i<=n; i++){
            for(int j=1; j<=patternSize; j++){ //This is the inverted triangle
                 System.out.print("* ");
                
            }
            patternSize--;
            System.out.println();
          
        }
    }
}