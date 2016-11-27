package school.lemon.changerequest.java.introduction.pr1;


import java.util.Scanner;

public class ConsoleCalculator {

    public static void main(String[] args) {
        System.out.println("Make your choise: ");
        System.out.println("Enter 'add' to perform addition.");
        System.out.println("Enter 'sub' to perform subtraction.");
        System.out.println("Enter 'mul' to perform multiplication.");
        System.out.println("Enter 'div' to perform division.");
        System.out.println("Enter 'exit' to exit.");
        System.out.println("Enter 'help' to see help message.");
        boolean eq = true;
        while (eq) {
            System.out.println("Make your choice.");
            Scanner sc = new Scanner(System.in);
            String operation = sc.next();
            operation = operation.toLowerCase();
            switch (operation) {
                case "add":
                    addition();
                    continue;
                case "sub":
                    subtraction();
                    continue;
                case "div":
                    division();
                    continue;
                case "mul":
                    multiplication();
                    continue;
                case "help":
                    System.out.println("As example you need to type 'add' when you need 'Addition");
                    continue;
                case "exit":
                    System.out.println("Bye-bye");
                    eq = false;
                    sc.close();
                    break;
                default:
                    System.out.println("Sorry, invalid choise.");

            }
        }
    }

    private static void addition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        sc.close();
        System.out.println("Result of " + num1 + "+" + num2 + " is " + (num1 + num2));
    }

    private static void subtraction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        sc.close();
        System.out.println("Result of " + num1 + "-" + num2 + " is " + (num1 - num2));
    }

    private static void division() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        sc.close();
        System.out.println("Result of " + num1 + "/" + num2 + " is " + (num1 / num2));
    }

    private static void multiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        sc.close();
        System.out.println("Result of " + num1 + "*" + num2 + " is " + (num1 * num2));
    }
}
