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
        boolean start = true;
        while (start) {
            System.out.println("Make your choice.");
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();
            choice.toLowerCase();
            switch (choice) {
                case "add":
                    add();
                    break;
                case "sub":
                    sub();
                    break;
                case "mul":
                    mul();
                    break;
                case "div":
                    div();
                    break;
                case "exit":
                    exit();
                    break;
                case "help":
                    help();
                    break;
                default:
            }
        }


    }

    private static void help() {
    }

    private static void exit() {
        System.out.println("Bye-bye");
        System.exit(0);
    }

    private static void div() {
        Scanner sc = new Scanner(System.in);
        int a, b, result;
        System.out.println("Enter first number:");
        a = sc.nextInt();
        System.out.println("Enter second number:");
        b = sc.nextInt();
        result = a / b;
        System.out.println("Result of " + a + "/" + b + " is " + result);
    }

    private static void mul() {
        Scanner sc = new Scanner(System.in);
        int a, b, result;
        System.out.println("Enter first number:");
        a = sc.nextInt();
        System.out.println("Enter second number:");
        b = sc.nextInt();
        result = a * b;
        System.out.println("Result of " + a + "*" + b + " is " + result);
    }

    private static void sub() {
        Scanner sc = new Scanner(System.in);
        int a, b, result;
        System.out.println("Enter first number:");
        a = sc.nextInt();
        System.out.println("Enter second number:");
        b = sc.nextInt();
        result = a - b;
        System.out.println("Result of " + a + "-" + b + " is " + result);
    }

    private static void add() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter first number:");
        a = sc.nextInt();
        System.out.println("Enter second number:");
        b = sc.nextInt();
        System.out.println("Result of " + a + "+" + b + " is " + a + b);
    }
}
