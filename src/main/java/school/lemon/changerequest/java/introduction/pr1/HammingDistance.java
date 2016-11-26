package school.lemon.changerequest.java.introduction.pr1;

public class HammingDistance {
    public static int compute(String a, String a1) {
        int counter = 0;
        if(a.length() != a1.length()) {
            return -1;
        } else {
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) != a1.charAt(i)){
                    counter++;
                }
            }
        }
        return counter;
    }
}
