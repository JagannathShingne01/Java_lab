Q5
import java.util.Scanner;

        public class Multiplication{
            public static void main(String[] args) {
                  Scanner input = new Scanner(System.in);
                    System.out.print("Enter The Number:");
                    int NumbeR = input.nextInt();
                    for(int i=1; i<=10; i++){
                        int result = i*NumbeR;
                    
        System.out.println(NumbeR + "*" + i + "="+ result);
                    }
}
}