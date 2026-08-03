import java.util.Scanner;

public class PQ19 {
     public static void main(String[] args) {
           int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nummber of row: ");
        n=sc.nextInt();
        PatternMethod(n);
    }
    public static  void  PatternMethod(int n){
        int patternSize=1;
        int space=n-1;
           
        for(int i=1; i<=n; i++)
        {
            for(int k=1; k<=space; k++){ //6
                System.out.print("  ");
            }
            for(int j=1; j<=patternSize; j++){
                 System.out.print("* ");

            }
            space -=1;
            patternSize +=2;
            System.out.println();
        }
                    
        
    }
    
}
