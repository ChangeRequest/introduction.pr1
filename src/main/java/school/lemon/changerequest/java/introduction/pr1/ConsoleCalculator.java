package school.lemon.changerequest.java.introduction.pr1;


import java.util.Scanner;

public class ConsoleCalculator {
    public int Add(int scannetFirstNumInt, int scannetSecondNumInt, String scannerOperations) {
        if (scannerOperations.equals("add"))
        {
        return  scannetFirstNumInt + scannetSecondNumInt;}
        return 0;
    }

    public int Sub(int scannerFirstNum, int scannerSecondNum) {
        return scannerFirstNum - scannerSecondNum;
    }

    public int Mul(int scannerFirstNum, int scannerSecondNum) {
        return scannerFirstNum * scannerSecondNum;
    }

    public int Div(int scannerFirstNum, int scannerSecondNum) {
        return scannerFirstNum / scannerSecondNum;
    }


    public static void main(String[] args) {
        System.out.println("Console calculator:");
        System.out.println("Enter 'add' to perform addition.");
        System.out.println("Enter 'sub' to perform subtraction.");
        System.out.println("Enter 'mul' to perform multiplication.");
        System.out.println("Enter 'div' to perform division.");
        System.out.println("Enter 'exit' to exit.");
        System.out.println("Enter 'help' to see help message.");
        System.out.println("Make your choice.");
        Scanner scannerOperations = new Scanner(System.in);


        System.out.println("Enter first number:");
        Scanner scannerFirstNum = new Scanner(System.in);
        int scannetFirstNumInt;
        if (scannerFirstNum.hasNextInt()) {
            scannetFirstNumInt = scannerFirstNum.nextInt();}

            System.out.println("Enter second number:");
            Scanner scannerSecondNum = new Scanner(System.in);
            int scannetSecondNumInt;
            if (scannerSecondNum.hasNextInt()) {
                scannetSecondNumInt = scannerSecondNum.nextInt();}


                ConsoleCalculator resultat = new ConsoleCalculator();

                System.out.println("Result of" + resultat);
                System.out.println("Make your choice.");
                Scanner scannerOperationsSecond = new Scanner(System.in);
                System.out.println("Make your choice.");

            }


}
