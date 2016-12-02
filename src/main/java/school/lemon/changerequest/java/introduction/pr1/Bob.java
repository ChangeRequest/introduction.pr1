package school.lemon.changerequest.java.introduction.pr1;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bob {

    public static String hey(String phrase) {


        if (phrase.equals(phrase.toUpperCase()) ) {
            return "Chill out!";
        }
     else   if (phrase.endsWith("?")) {
            return "Yeap.";
        }
        String trimmed = phrase.trim();
        if (trimmed.isEmpty()) {
            return "Fine.";
        }

        return "Whatever.";
    }

}
