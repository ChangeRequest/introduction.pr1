package school.lemon.changerequest.java.introduction.pr1;


import java.util.Scanner;

public class ConsoleCalculator {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        operationsChoise();

        while (true) {
            makeChoice();
            while (!userInput.hasNext("(exit|help|div|mul|sub|add)")) {
                System.out.println("Please, read the instruction.");
                operationsChoise();
                makeChoice();
                userInput.nextLine();
            }


            String command = userInput.nextLine(); // поле

            if (command.equals("exit")) {
                System.out.println("Bye-bye");
                userInput.close();
                break;

            } else if (command.equals("help")) {
                operationsChoise();
                continue;
            }

            System.out.println("Enter first number:");
            int x = userInput.nextInt();

            System.out.println("Enter second number:");
            int y = userInput.nextInt();
            userInput.nextLine();

            switch (command) {
                case "add":
                    int add = x + y;
                    System.out.printf("Result of %d + %d is %d \n", x, y, add);
                    break;

                case "sub":
                    int sub = x - y;
                    System.out.printf("Result of %d - %d is %d \n", x, y, sub);
                    break;

                case "mul":
                    int mul = x * y;
                    System.out.printf("Result of %d * %d is %d \n", x, y, mul);
                    break;

                case "div":
                    int div = x / y;
                    System.out.printf("Result of %d / %d is %d \n", x, y, div);
                    break;
            }

        }

    }


    private static void operationsChoise() {
        System.out.println("Enter 'add' to perform addition.");
        System.out.println("Enter 'sub' to perform subtraction.");
        System.out.println("Enter 'mul' to perform multiplication");
        System.out.println("Enter 'div' to perform division.");
        System.out.println("Enter 'help' to see help message.");
        System.out.println("Enter 'exit' to exit.");
    }

    private static void makeChoice() {
        System.out.println("Make your choice.");
    }


}

