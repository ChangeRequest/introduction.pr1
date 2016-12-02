package school.lemon.changerequest.java.introduction.pr1;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bob {

    public static String hey(String phrase) {
        String tabul = "\\s";
        Pattern patternPharse = Pattern.compile(tabul);
        Matcher matcherPharse = patternPharse.matcher(phrase);
        if (phrase.equals(matcherPharse)) {
            return "Fine.";
        }

      else if (phrase.equals(phrase.toUpperCase())) {
        return "Chill out!";
    }

      else  if (phrase.endsWith("?")) {
            return "Yeap.";
        }


         else return "Whatever.";
    }

}
