Q2
import java.util.Scanner;
class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Define Result variable
        double result;
        //Show The Option 
        System.out.println("Operator Options:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Greate  and  Less ( > | < )");        
        // Enter the Opton 
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        // Switch Operation
        switch (choice) {
            case 1:
            //Case 1 method for Addition
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();
            result = num1 + num2;
            System.out.println("Result: " + result);
                break;
            case 2:
            //Case 2 Method for Subtraction
            System.out.print("Enter the first number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            num2 = sc.nextDouble();
            result = num1 - num2;
            System.out.println("Result: " + result);
                break;
            case 3:
            //Case 3 Method for Multiplication
            System.out.print("Enter the first number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            num2 = sc.nextDouble();
            result = num1 * num2;
            System.out.println("Result: " + result);
                break;
            case 4:
                //Case 4 Method for Division
                System.out.print("Enter the first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = sc.nextDouble();
                result = num1 / num2;
                System.out.println("Result: " + result);
                break;
            case 5:
                //Case 5 Method for Comparsion
                System.out.print("Enter the first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = sc.nextDouble();
                if(num1>num2){
                    System.out.println("Number 1 is Greater then Number 2"+num1);
                }
                else{
                    System.out.println("Number 2 is Greater then Number 1"+num2);
                }
                break;
            default:
                //Case UnExpeted Value  
                System.out.println("Invalid choice!");
                break;
        }
        sc.close();
    }
}