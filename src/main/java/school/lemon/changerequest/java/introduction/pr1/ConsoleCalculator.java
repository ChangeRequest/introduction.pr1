package school.lemon.changerequest.java.introduction.pr1;


import java.util.Scanner;

public class ConsoleCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        makeChoice();
        String input;
        int a, b;
        while (true) {
            while (!scanner.hasNext("(exit|help|add|sub|mul|div)")) {
                System.out.println("False, please try again.");
                makeChoice();
                scanner.next();
            }
            input = scanner.next();

            if (input.equals("exit")) {
                System.out.println("Bye-bye");
                scanner.close();
                break;
            }
            if (input.equals("help")) {
                makeChoice();
                scanner.next();
            }

            System.out.println("Enter first number:");
            a = scanner.nextInt();
            System.out.println("Enter second number:");
            b = scanner.nextInt();

            switch (input) {
                case "add":
                    int sum = a + b;
                    System.out.println(a + "+" + b + "= " + sum);
                    break;
                case "sub":
                    int sub = a - b;
                    System.out.println(a + "-" + b + "= " + sub);
                    break;
                case "mul":
                    int mul = a * b;
                    System.out.println(a + "*" + b + "= " + mul);
                    break;
                case "div":
                    int div = a / b;
                    System.out.println(a + "/" + b + "= " + div);
                    break;
                }
            makeChoice();
        }

    }

    private static void makeChoice () {
        System.out.println("Console calculator");
        System.out.println("Enter 'add' to perform addition.");
        System.out.println("Enter 'sub' to perform subtraction.");
        System.out.println("Enter 'mul' to perform multiplication.");
        System.out.println("Enter 'div' to perform division.");
        System.out.println("Enter 'exit' to exit.");
        System.out.println("Enter 'help' to see help message.");
        System.out.println("Make your choice.");

    }
}
