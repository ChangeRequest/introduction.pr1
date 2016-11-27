package school.lemon.changerequest.java.introduction.pr1;


import java.util.Scanner;

public class ConsoleCalculator {

    public static void main(String[] args) {
        text();
        boolean param = true;
        while (param) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Make your choice.");
            String operation = sc.next();
            operation = operation.toLowerCase();
            switch (operation) {
                case "add":
                    System.out.println("Enter first number:");
                    int num1 = sc.nextInt();
                    System.out.println("Enter second number:");
                    int num2 = sc.nextInt();
                    System.out.println("Result of " + num1 + "+" + num2 + " is " + (num1 + num2));
                    continue;
                case "sub":
                    System.out.println("Enter first number:");
                    num1 = sc.nextInt();
                    System.out.println("Enter second number:");
                    num2 = sc.nextInt();
                    System.out.println("Result of " + num1 + "-" + num2 + " is " + (num1 - num2));
                    continue;
                case "div":
                    System.out.println("Enter first number:");
                    num1 = sc.nextInt();
                    System.out.println("Enter second number:");
                    num2 = sc.nextInt();
                    System.out.println("Result of " + num1 + "/" + num2 + " is " + (num1 / num2));
                    continue;
                case "mul":
                    System.out.println("Enter first number:");
                    num1 = sc.nextInt();
                    System.out.println("Enter second number:");
                    num2 = sc.nextInt();
                    System.out.println("Result of " + num1 + "*" + num2 + " is " + (num1 * num2));
                    continue;
                case "help":
                    text();
                    continue;
                case "exit":
                    System.out.println("Bye-bye");
                    sc.close();
                    param = false;
                    break;
                default:
                    System.out.println("Sorry, invalid choise.");

            }
        }
    }

    private static void text() {
        System.out.println("Make your choise: ");
        System.out.println("Enter 'add' to perform addition.");
        System.out.println("Enter 'sub' to perform subtraction.");
        System.out.println("Enter 'mul' to perform multiplication.");
        System.out.println("Enter 'div' to perform division.");
        System.out.println("Enter 'exit' to exit.");
        System.out.println("Enter 'help' to see help message.");
    }
}
