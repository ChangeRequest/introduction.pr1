package school.lemon.changerequest.java.introduction.pr1;

import java.util.Scanner;

public class ConsoleCalculator {

    public static String calculator(int firstNumber1, int secondNumber2, String request1) {
        String space = " ";
        switch (request1) {
            case "add":
                int sum = firstNumber1 + secondNumber2;
                return (firstNumber1 + "+" + secondNumber2 + space + sum);
            case "sub":
                int sub = firstNumber1 - secondNumber2;
                return (firstNumber1 + "-" + secondNumber2 + space + sub);
            case "mul":
                int mul = firstNumber1 * secondNumber2;
                return (firstNumber1 + "*" + secondNumber2 + space + mul);
            case "div":
                int div = firstNumber1 / secondNumber2;
                return (firstNumber1 + "/" + secondNumber2 + space + div);
            case "exit":
                return ("Bye-bye.");
            default:
                return "error";

        }
    }

    public static void main(String[] args) {
        System.out.println("Console calculator");
        System.out.println("Enter 'add' to perform addition.");
        System.out.println("Enter 'sub' to perform subtraction.");
        System.out.println("Enter 'mul' to perform multiplication.");
        System.out.println("Enter 'div' to perform division.");
        System.out.println("Enter 'exit' to exit.");
        System.out.println("Enter 'help' to see help message.");
        System.out.println("Make your choice.");

        Scanner scanner = new Scanner(System.in);
        String request = scanner.nextLine();
        while (!request.equals("exit")) {
            if (request.equals("help")) {
                System.out.println(request);
            } else {
                System.out.println("Enter first number:");
                Integer firstNumber = scanner.nextInt();
                System.out.println("Enter second number:");
                Integer secondNumber = scanner.nextInt();
                System.out.println(calculator(firstNumber, secondNumber, request));
            }
            System.out.println("Make your choice.");
            Scanner scanner2 = new Scanner(System.in);
            request = scanner2.nextLine();
        }
        System.out.println("Bye-bye");
    }
}


