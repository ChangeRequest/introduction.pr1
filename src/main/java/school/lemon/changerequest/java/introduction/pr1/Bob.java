package school.lemon.changerequest.java.introduction.pr1;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bob {

    public static String hey(String phrase) {
        String phraseCheck=phrase.replaceAll(" ","");
        if(phraseCheck.equals("")){return "Fine.";}
        char question ='?';
        char dot = '.';
        char exclamation ='!';
        char last= phrase.charAt(phrase.length()-1);
        String anger= phrase.toUpperCase();
        String notAnger= phrase.toLowerCase();
        boolean notString=anger==notAnger;
        if (last==question&&(notString||phrase!=anger))
        {return "Yeap.";}

        if (anger==phrase&&anger!=notAnger){return  "Chill out!";}

        return "Whatever.";



            }




    }


