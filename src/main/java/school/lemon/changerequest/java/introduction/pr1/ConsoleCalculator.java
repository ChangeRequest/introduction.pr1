package school.lemon.changerequest.java.introduction.pr1;


import java.util.Scanner;

public class ConsoleCalculator {

    public static void main(String[] args) {
        System.out.print("Console calculator:\n " +
                "Enter 'add' to perform addition.\n " +
                "Enter 'sub' to perform subtraction.\n " +
                "Enter 'mul' to perform multiplication.\n " +
                "Enter 'div' to perform division.\n " +
                "Enter 'exit' to exit.\n " +
                "Enter 'help' to see help message.\n ");
        int exit=1;

        while (exit==1){
            System.out.print("Make your choice.\n");
            Scanner sc = new Scanner(System.in);
            String s1 = sc.nextLine();
            if (s1.equals("exit")) {System.out.println("Bye-bye.");
                exit=0;
                break; }

            System.out.print("Enter first number\n");
            int number1 = sc.nextInt();
            System.out.print("Enter second number\n");
            int number2 = sc.nextInt();
            switch (s1) {
                case "add":
                    System.out.println("Result of" + number1 + "+" + number2 + "is" + (number1 + number2));
                    break;
                case "sub": System.out.println("Result of" + number1 + "-" + number2 + "is" + (number1 - number2));
                    break;
                case "mul": System.out.println("Result of" + number1 + "*" + number2 + "is" + (number1 * number2));
                    break;
                case "div": System.out.println("Result of" + number1 + "/" + number2 + "is" + (number1 / number2));
                    break;

                default: System.out.println("WRONG!");
                    break;

            }}
    }
}