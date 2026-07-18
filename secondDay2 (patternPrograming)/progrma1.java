
import java.util.Scanner;



class program1{
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nummber of row");
        n=sc.nextInt();
        printPtternMethod(n);
        

    }


    public static void printPtternMethod(int n){
        for(int i =1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}