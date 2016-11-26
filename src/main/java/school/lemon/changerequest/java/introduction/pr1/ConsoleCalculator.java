package school.lemon.changerequest.java.introduction.pr1;

import java.util.Scanner;

public class ConsoleCalculator {

    public static void main(String[] args) {
        System.out.println("Console Calculation");
        System.out.println("Enter 'add' to perform addition");
        System.out.println("Enter 'sub' to perform subtraction");
        System.out.println("Enter 'mul' to perform multiplication");
        System.out.println("Enter 'div' to perform division");
        System.out.println("Enter 'exit' to exit");
        System.out.println("Enter 'help' to see help message");
        boolean flag = true;
        while(flag) {
            System.out.println("Make your choice: ");
            Scanner read = new Scanner(System.in);
            String choice = read.next();
            choice = choice.toLowerCase();
            switch (choice) {
                case "add": {
                    System.out.println("Enter first number: ");
                    int first = read.nextInt();
                    System.out.println("Enter second number: ");
                    int second = read.nextInt();
                    int res = first + second;
                    System.out.println("    Result of " + first + "+" + second + " is " + res);
                    break;
                }
                case "sub" : {
                    System.out.println("Enter first number: ");
                    int first = read.nextInt();
                    System.out.println("Enter second number: ");
                    int second = read.nextInt();
                    int res = first - second;
                    System.out.println("    Result of " + first + "-" + second + " is " + res);
                    break;
                }
                case "mul" : {
                    System.out.println("Enter first number: ");
                    int first = read.nextInt();
                    System.out.println("Enter second number: ");
                    int second = read.nextInt();
                    int res = first*second;
                    System.out.println("    Result of " + first + "*" + second + " is " + res);
                    break;
                }
                case "div" : {
                    System.out.println("Enter first number: ");
                    int first = read.nextInt();
                    System.out.println("Enter second number: ");
                    int second = read.nextInt();
                    double res = first/second;
                    System.out.println("    Result of " + first + "/" + second + " is " + res);
                    break;
                }
                case "exit" : {
                    System.out.println("bye-bye!");
                    flag = false;
                    break;
                }
                case "help" : {
                    System.out.println("Enter 'add' to perform addition");
                    System.out.println("Enter 'sub' to perform subtraction");
                    System.out.println("Enter 'mul' to perform multiplication");
                    System.out.println("Enter 'div' to perform division");
                    System.out.println("Enter 'exit' to exit");
                    System.out.println("Enter 'help' to see help message");
                }

            }
        }

    }
}
