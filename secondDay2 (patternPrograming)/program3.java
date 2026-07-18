import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
           int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nummber of row");
        n=sc.nextInt();
        printPattern3(n);
    }

    public static void printPattern3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("("+i+","+j+") ");
            }
            System.out.println();
        }
    }
}
