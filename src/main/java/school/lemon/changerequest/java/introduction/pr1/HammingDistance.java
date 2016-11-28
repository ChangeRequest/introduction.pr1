package school.lemon.changerequest.java.introduction.pr1;

public class HammingDistance {
    public static int compute(String a, String a1) {
        int la = a.length();
        int la1 = a1.length();
        int count = 0;

        if (la == la1) {
            for (int i = 0; i < la; i++) {
                if (a.charAt(i) != a1.charAt(i))
                    count++;
            }
            return count;
        }
        return -1;
    }


}
