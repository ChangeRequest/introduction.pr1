package school.lemon.changerequest.java.introduction.pr1;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bob {

    public static String hey(String phrase) {
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(phrase);
        if (phrase.trim().isEmpty()) {
            return "Fine.";
        }
        if (phrase.toUpperCase().equals(phrase) && matcher.find()) {
            return "Chill out!";
        }
        if (phrase.endsWith("?")) {
            return "Yeap.";
        }
        return "Whatever.";
    }
}
