package school.lemon.changerequest.java.introduction.pr1;


import java.util.Scanner;

public class Bob {

    public static String hey(String phrase) {
        if (phrase == null || phrase.trim().length() == 0) {
            return "Fine";
        }
        if (phrase.matches("^[A-Z\\p{Lu}]+[\\d\\W]*$")) { // "^[A-Z]+[\\d\\W]*$"  ("^[A-Z\\d\\W]+$") - working[A-Z0-9_]+[\\w]*"))  A-Z \d\W]+$
                return "Chill out!";
        }
        if (phrase.endsWith("?")) {
                return "Yeap.";
        }
            return "Whatever.";
        }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Speak to Bob!");
        String speech = scanner.nextLine();
        System.out.println(hey(speech));

    }

}
