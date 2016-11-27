package school.lemon.changerequest.java.introduction.pr1;


public class Bob {

    public static String hey(String phrase) {
        int lengthPhrase = phrase.length();
        if (lengthPhrase == 0) {
            return "Fine.";
        }
        int number = 0;
        String newPhrase = phrase.replaceAll("[0-9\\!\\-\\%\\^\\*\\$\\@\\#\\(\\?\\/\\,\\.\\'\\s]", "");
        String newPhraseNumber = phrase.replaceAll("[\\!\\-\\%\\^\\*\\$\\@\\#\\(\\?\\/\\,\\.\\'\\s]", "");
        for (int i = 0; i < newPhrase.length() - 1; i++) {
            if (Character.isUpperCase(newPhrase.charAt(i))) {
                number++;
            }
        }
        if (number == newPhrase.length() - 1) {
            return "Chill out!";
        } else if (phrase.charAt(lengthPhrase - 1) == '?') {
            return "Yeap.";
        } else if (newPhrase.length() == 0 && (newPhraseNumber.length() == 0)) {
            return "Fine.";
        }
        return "Whatever.";
    }
}
