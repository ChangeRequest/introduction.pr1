package school.lemon.changerequest.java.introduction.pr1;

import java.util.Scanner;

public class HammingDistance {
    public static int compute(String a, String a1) {

        int lengthA = a.length();
        int lengthA1 = a1.length();
        int number = 0; //Different
        if (lengthA == lengthA1) {
            for (int i = 0; i < lengthA; i++) {
                if (a.charAt(i) != a1.charAt(i)) {
                    number++;
                }
            }
        } else {
            return -1;

        }
        return number;
    }
}
