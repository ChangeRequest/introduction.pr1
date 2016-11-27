package school.lemon.changerequest.java.introduction.pr1;


public class Bob {

    public static String hey(String phrase) {
        if (phrase.trim().isEmpty()) {
            return "Fine.";
        }
        if (phrase.equals(phrase.toUpperCase()) && !phrase.equals(phrase.toLowerCase())) {
            return "Chill out!";
        }
        if (phrase.endsWith("?")) {
            return "Yeap.";
        }
        return "Whatever.";
    }
}
