package school.lemon.changerequest.java.introduction.pr1;


import java.util.Scanner;

public class ConsoleCalculator {

    public static void main(String[] args) {

        System.out.println("Console calculator:");
        System.out.println("Enter 'add' to perform addition.");
        System.out.println("Enter 'sub' to perform subtraction.");
        System.out.println("Enter 'mul' to perform multiplication.");
        System.out.println("Enter 'div' to perform division.");
        System.out.println("Enter 'exit' to exit.");
        System.out.println("Enter 'help' to see help message.");
        System.out.println("Make your choice.");

        boolean next = true;

        do {
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            switch (choice) {
                case "exit": {
                    System.out.println("Bye-bye.");
                    return;
                }
            }

            System.out.println("Enter first number:");
            Scanner scanner1 = new Scanner(System.in);
            String firstNumber = scanner1.nextLine();
            int firstNumberIn = Integer.valueOf(firstNumber);

            System.out.println("Enter second number:");
            Scanner scanner3 = new Scanner(System.in);
            String secondNumber = scanner3.nextLine();
            int secondNumberIn = Integer.valueOf(secondNumber);

            switch (choice) {
                case "add": {
                    int result = firstNumberIn + secondNumberIn;
                    System.out.println("Result of " + firstNumber + "+" + secondNumber + " is " + result + ".");
                    break;
                }
                case "sub": {
                    int result = firstNumberIn - secondNumberIn;
                    System.out.println("Result of " + firstNumber + "-" + secondNumber + " is " + result + ".");
                    break;
                }
                case "mul": {
                    int result = firstNumberIn * secondNumberIn;
                    System.out.println("Result of " + firstNumber + "*" + secondNumber + " is " + result + ".");
                    break;
                }
                case "div": {
                    int result = firstNumberIn / secondNumberIn;
                    System.out.println("Result of " + firstNumber + "/" + secondNumber + " is " + result + ".");
                    break;
                }
                case "help": {
                    System.out.println("What can I help you?");
                    break;
                }
                default: {
                    System.out.println("You made the wrong choice. Repeat.");
                }
            }
            System.out.println("Make new choice.");
        } while (next);
    }
}
