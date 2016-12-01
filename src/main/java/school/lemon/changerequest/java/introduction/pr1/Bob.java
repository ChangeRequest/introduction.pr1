package school.lemon.changerequest.java.introduction.pr1;


import java.util.Scanner;

public class Bob {

    public static String hey(String phrase) {
        if (phrase.trim().isEmpty())
            return "Fine";

        if (phrase.toUpperCase().equals(phrase)) {
            for (char c : phrase.toCharArray()) {
                if (Character.isLetter(c)) return "Chill out!";
            }

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
