package school.lemon.changerequest.java.introduction.pr1;


import java.util.Scanner;

public class ConsoleCalculator {

    public static void main(String[] args) {

        Scanner UserInput = new Scanner(System.in);
        System.out.println("Console calculator: ");
        System.out.println("Enter 'add' to perform addition.");
        System.out.println("Enter 'sub' to perform subtraction.");
        System.out.println("Enter 'mul' to perform multiplication");
        System.out.println("Enter 'div' to perform division.");
        System.out.println("Enter 'help' to see help message.");
        System.out.println("Make your choice.");


        String command1 = UserInput.next();

        System.out.println("Enter first number:");
        int x = UserInput.nextInt();

        System.out.println("Enter second number:");
        int y = UserInput.nextInt();


        switch (command1) {
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

        }


        System.out.println("Make your choice.");
        String command2 = UserInput.next();
        UserInput.close();


        switch (command2) {
            case "help":
                System.out.println("Please, read the information above to use the calculator.");
                break;

            case "exit":
                System.out.println("Bye-bye!");
        }


        }
    }

