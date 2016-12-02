package school.lemon.changerequest.java.introduction.pr1;

public class HammingDistance {
    public static int compute(String a, String a1) {
        if (a.length() == a1.length()) {
            int numbers = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != a1.charAt(i))
                    numbers++;
            }
            return numbers;
        }
        return -1;
    }
}
