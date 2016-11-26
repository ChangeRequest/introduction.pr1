package school.lemon.changerequest.java.introduction.pr1;


public class Bob {

    public static String hey(String phrase) {
        char ch;
        int counter = 0;
        boolean flag = true;
        String reply = "";
        if(phrase == "") return "Fine.";

        for(int i = 0; i < phrase.length(); i++){
            ch = phrase.charAt(i);
            if(ch == '?'){
                reply = "Yeap.";
            } else if(ch == '!'){
                reply = "Chill out!";
            } else if(ch == '.') {
                reply = "Whatever.";
            } else if(ch == ' '){
                counter++;
            } else continue;
        }
        if(counter == phrase.length())
            reply = "Fine.";

        return reply;
    }

}
