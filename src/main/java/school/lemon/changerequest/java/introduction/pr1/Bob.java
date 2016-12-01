package school.lemon.changerequest.java.introduction.pr1;


public class Bob {

    public static String hey(String phrase) {
        int lengthPhrase = phrase.length();
        if (lengthPhrase == 0) {
            return "Fine.";
        }
        int numberBig = 0;
        int numberSpace = 0;

        StringBuilder newPhrase = new StringBuilder();
        for (int i = 0; i < lengthPhrase - 1; i++) {
            if (Character.isLetter(phrase.charAt(i))) {
                newPhrase.append(phrase.charAt(i));
            } else if (Character.isWhitespace(phrase.charAt(i))) {
                numberSpace++;
            }
        }
        for (int i = 0; i < newPhrase.length() - 1; i++) {
            if (Character.isUpperCase(newPhrase.charAt(i))) {
                numberBig++;
            }
        }
        if (numberBig == newPhrase.length() - 1) {
            return "Chill out!";
        } else if (phrase.charAt(lengthPhrase - 1) == '?') {
            return "Yeap.";
        } else if ((lengthPhrase - 1 == numberSpace)) {
            return "Fine.";
        }
        return "Whatever.";
    }
}
