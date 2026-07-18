import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
          int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nummber of row");
        n=sc.nextInt();
        printPattern(n);
    }


    public static void printPattern(int n){
             for(int i =1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    System.out.print(i+" ");
                }
                System.out.println();
             }
    }
    
}
