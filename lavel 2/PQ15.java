
import java.util.Scanner;

public  class PQ15{
      public static void main(String[] args) {
           int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nummber of row: ");
        n=sc.nextInt();
        PatternMethod(n);
    }
    public  static void PatternMethod(int n){
        if(n%2!=0){
               int mid= n/2+1;
        int patternSize=mid;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=patternSize; j++){ 

                 System.out.print("* ");
                
            }
            if(mid>i){
                patternSize -=1;
            }
            else{
                patternSize +=1;
            }
           
            
            System.out.println();
        }
        }
        else{
            System.out.println("Please enter must odd number..");
        }
       
    }
}