
//Q3
import java.util.Scanner;
    public class Multipleoprations{
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
           
          // 1.Check if the person is eligible for voting or not
          System.out.print("Enter your Age:");
          int age = input.nextInt();
          if(age >= 18){
              System.out.print("Your eligible for Voting");
          }else{
                System.out.print("Your Not eligible for Voting");

          }
          // 2.Finding The Gretest Number
          System.out.print("Enter The First Number:");
          int num1 = input.nextInt();
          System.out.print("Enter The second Number:");
          int num2 = input.nextInt();
          System.out.print("Enter The Third Number:");
          int num3 = input.nextInt();
          int max = num1;
          if(num2 > max){
              max = num2;
          }
          if(num3 > max){
              max = num3;
          }
        System.out.print("The gretest number is:" +max);
        
       // 3. check if number is even or odd
        
            System.out.print("Enter The First Number:");
            int Num = input.nextInt();
          if(Num % 2 == 0){
              System.out.print("Given Number" + Num + "is Even");
          }else{
              System.out.print("Given Number" + Num + "is Odd");
          }