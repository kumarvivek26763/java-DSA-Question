
import java.util.Scanner;

public  class PQ22{
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
        int patternSize=1;
        int space=mid-1;
        for(int i=1; i<=n; i++){
            for(int k=1; k<=space; k++){
                System.out.print("   ");
            }
            for(int j=1; j<=patternSize; j++){ 

                 System.out.print("*  ");
                
            }
            if(mid>i){
               patternSize +=1;
               space -=1;
            }else{
                 patternSize -=1;
                 space +=1;
            }
            
            System.out.println();
        }
        }
        else{
            System.out.println("Please enter must odd number..");
        }
       
    }
}