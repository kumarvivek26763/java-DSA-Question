import java.util.Scanner;

public class PQ21 {
      public static void main(String[] args) {
           int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nummber of row: ");
        n=sc.nextInt();
        PatternMethod(n);
    }
    public static void PatternMethod(int n) {
        int patternsize=n;
        int space=0;
        for(int i=1; i<=n; i++){
            for(int k=1; k<=space; k++){
                System.out.print("  ");//space must be two
            }
            for(int j=1; j<=patternsize; j++){ //space must be four 4
                System.out.print("*   ");

            }
            space +=1;
            patternsize -=1;
               System.out.println();
        }
      
        
    }
    
}
