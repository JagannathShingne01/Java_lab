//Q4
 
import java.util.Scanner;

         public class factorial{
            public static void main(String[] args) {
                 Scanner input = new Scanner(System.in);
            System.out.print("Enter The Number:");
             int Number = input.nextInt();
         int Factorial = 1;
         for( int i=1;i<=Number;i++){
             Factorial *= i;
         }
         System.out.print("The Factorial of"+Number+"is:"+ Factorial);