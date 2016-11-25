package school.lemon.changerequest.java.introduction.pr1;

import java.util.Scanner;

public class HammingDistance {
    public static int compute(String a, String a1) {
        //System.out.println("Input first word");
        //Scanner scanner = new Scanner(System.in);
        //String a = scanner.nextLine();

        //System.out.println("Input second word");
        //Scanner scanner2 = new Scanner(System.in);
        //String a1 = scanner2.nextLine();

        int lena=a.length();
        int lena1=a1.length();
        int number=0; //Different
        if (lena==lena1){
            for (int i=0;i<lena;i++){
            if (a.charAt(i)!=a1.charAt(i)){
              number++;
            }
            }
        }
        else {
            return -1;

        }
        return number;
    }
}
