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
        String resultString;
        int result;
        do {
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            switch (choice) {
                case "exit": {
                    System.out.println("Bye-bye.");
                    return;
                }
                case "add":
                case "sub":
                case "mul":
                case "div":
                    System.out.println("Enter first number:");
                    String firstNumber = scanner.nextLine();
                    int firstNumberIn = Integer.valueOf(firstNumber);

                    System.out.println("Enter second number:");
                    String secondNumber = scanner.nextLine();
                    int secondNumberIn = Integer.valueOf(secondNumber);

                    if (choice.equals("add")) {
                        result = firstNumberIn + secondNumberIn;
                        resultString = "+";
                    } else if (choice.equals("sub")) {
                        result = firstNumberIn - secondNumberIn;
                        resultString = "-";
                    } else if (choice.equals("mul")) {
                        result = firstNumberIn * secondNumberIn;
                        resultString = "*";
                    } else {
                        result = firstNumberIn / secondNumberIn;
                        resultString = "/";
                    }
                    String resultFormat = String.format("Result of %1$s%2$s%3$s is %4$s.", firstNumber, resultString, secondNumber, result);
                    System.out.println(resultFormat);
                    break;
                case "help": {
                    System.out.println("Enter 'add' to perform addition.");
                    System.out.println("Enter 'sub' to perform subtraction.");
                    System.out.println("Enter 'mul' to perform multiplication.");
                    System.out.println("Enter 'div' to perform division.");
                    System.out.println("Enter 'exit' to exit.");
                    break;
                }
                default: {
                    System.out.println("You made the wrong choice. Repeat.");
                    break;
                }
            }
            System.out.println("Make new choice.");
        } while (next);
    }
}
