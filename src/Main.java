
import javax.management.RuntimeErrorException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

            System.out.println("Welcome to the Sum Program!");


                try {
                    System.out.println("Please input the FIRST number you would like to add: ");
                    double a = userInput.nextDouble();
                    System.out.println("Next, please input the SECOND number you would like to add: ");
                    double b = userInput.nextDouble();
                    double results = a + b;
                    System.out.println("The sum of " + a + " + " + b + " is: " + results);

                } catch (Exception e) {
                    System.out.println("You input a letter or symbol, please restart and type ONLY a number.");


                }
    }
}
