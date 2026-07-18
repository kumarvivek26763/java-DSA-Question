import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
           int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nummber of row");
        n=sc.nextInt();
        Pattern(n);

    }

    public static void Pattern(int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }

    }
}
