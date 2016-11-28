package school.lemon.changerequest.java.introduction.pr1;


public class Bob {

    public static String hey(String phrase) {


        if (phrase.equals(phrase.toUpperCase()) && !phrase.equals(phrase.toLowerCase())) {
            return "Chill out!";
        }


        if (phrase.endsWith("?")) {
            return "Yeap.";
        }



        String trimmed = phrase.trim();
        if (trimmed.isEmpty()) {
            return "Fine.";
        }
                return "Whatever.";
    }
}

