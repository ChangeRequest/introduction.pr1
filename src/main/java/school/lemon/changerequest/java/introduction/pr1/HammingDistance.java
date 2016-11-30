package school.lemon.changerequest.java.introduction.pr1;

public class HammingDistance {
    public static int compute(String a, String a1) {
        char[] aA = a.toCharArray();
        char[] a1A1 = a1.toCharArray();
        int count = 0;
        if (a.length()!= a1.length()) {
            return -1;
        }
        for  (int i=0;i<a.length();i++) {
            if (a1A1[i]!=aA[i]) {
                count = count + 1;
            }

            if (i == a1.length()-1) {

                return count;}
        }

    return 0;
    }}
