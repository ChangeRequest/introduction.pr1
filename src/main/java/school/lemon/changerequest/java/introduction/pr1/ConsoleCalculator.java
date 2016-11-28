package school.lemon.changerequest.java.introduction.pr1;


import java.util.Scanner;

public class ConsoleCalculator {

    public static void main(String[] args) {
        listOfChoises();
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        while (true) {
            System.out.println("Make your choice.");
            String operation = sc.next().toLowerCase();
            if (!operation.equals("exit, help, add, sub, div, mul")) {
                System.out.println("Your type not ringt, you was trying - " + "/" + operation + "/" + " but bellow that you can do");
                listOfChoises();
                continue;
            } else if (operation.equals("exit")) {
                System.out.println("Bye-bye");
                break;

            } else if (operation.equals("help")) {
                listOfChoises();
                continue;
            }
            System.out.println("Enter first number:");
            num1 = sc.nextInt();
            System.out.println("Enter second number:");
            num2 = sc.nextInt();
            String resText = "Result of " + num1 + "+" + num2 + " is ";
            switch (operation) {
                case "add":
                    System.out.println(resText + (num1 + num2));
                    continue;
                case "sub":
                    System.out.println(resText + (num1 - num2));
                    continue;
                case "div":
                    System.out.println(resText + (num1 / num2));
                    continue;
                case "mul":
                    System.out.println(resText + (num1 * num2));
                    continue;
                default:
                    System.out.println("Sorry, invalid choise.");

            }
        }

    }


    private static void listOfChoises() {
        System.out.println("List of actions: ");
        System.out.println("Enter 'add' to perform addition.");
        System.out.println("Enter 'sub' to perform subtraction.");
        System.out.println("Enter 'mul' to perform multiplication.");
        System.out.println("Enter 'div' to perform division.");
        System.out.println("Enter 'exit' to exit.");
        System.out.println("Enter 'help' to see help message.");

    }
}
