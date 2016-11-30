package school.lemon.changerequest.java.introduction.pr1;


import java.util.Scanner;

public class ConsoleCalculator {

    public static void main(String[] args) {
        listOfChoises();
        Scanner sc = new Scanner(System.in);
        String operation;
        while (true) {
            while (!sc.hasNext("(exit|help|div|mul|sub|add)")) {
                System.out.println("False input, try again");
                listOfChoises();
                sc.next();
            }
            operation = sc.next().toLowerCase();
            if (operation.equals("exit")) {
                System.out.println("Bye-bye");
                sc.close();
                break;
            } else if (operation.equals("help")) {
                listOfChoises();
                sc.next();
            }
            System.out.println("Enter first number:");
            int num1 = readNextInt(sc);
            System.out.println("Enter second number:");
            int num2 = readNextInt(sc);
            switch (operation) {
                case "add":
                    String add = String.format("Result of %1$d" + "+" + "%2$d is %3$d", num1, num2, (num1 + num2));
                    System.out.println(add);
                    break;
                case "sub":
                    String sub = String.format("Result of %1$d-%2$d is %3$d", num1, num2, (num1 - num2));
                    System.out.println(sub);
                    break;
                case "div":
                    String div = String.format("Result of %1$d/%2$d is %3$d", num1, num2, (num1 / num2));
                    System.out.println(div);
                    break;
                case "mul":
                    String mul = String.format("Result of %1$d*%2$d is %3$d", num1, num2, (num1 * num2));
                    System.out.println(mul);
                    break;

            }
            listOfChoises();

        }

    }

    private static int readNextInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Not a DIGIT!");
            sc.next();
        }
        return sc.nextInt();
    }


    private static void listOfChoises() {
        System.out.println("List of actions: ");
        System.out.println("Enter 'add' to perform addition.");
        System.out.println("Enter 'sub' to perform subtraction.");
        System.out.println("Enter 'mul' to perform multiplication.");
        System.out.println("Enter 'div' to perform division.");
        System.out.println("Enter 'exit' to exit.");
        System.out.println("Enter 'help' to see help message.");
        System.out.println("Make your choice:");

    }
}


