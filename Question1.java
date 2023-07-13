//Q1
import java.util.Scanner;
public class CircleCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius (R): ");
        double radius = input.nextDouble();

        // Calculate the Area of Circle (AC)
        double area = Math.PI * radius * radius;

        // Calculate the Circumference of Circle (CC)
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area of Circle: " + area);
        System.out.println("Circumference of Circle: " + circumference);
    }
}