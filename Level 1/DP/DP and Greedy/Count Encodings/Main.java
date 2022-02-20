import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int n = str.length();
        int enc[] = new int[n];
        enc[0] = str.charAt(0) == '0' ? 0 : 1;
        for (int i = 1; i < n; i++) {
            int newEnc1 = 0, newEnc2 = 0;
            int two = 0;
            char ch = str.charAt(i);
            char ch2 = str.charAt(i - 1);
            int chInt = Character.getNumericValue(ch);
            int ch2Int = Character.getNumericValue(ch2);
            if (chInt != 0) {
                newEnc1 = enc[i - 1];
            }
            
            two = ch2Int * 10 + chInt;
            if (two >= 10 && two <= 26) {
                newEnc2 = i > 1 ? enc[i - 2] : 1;
            }
            enc[i] = newEnc1 + newEnc2;
        }
        System.out.println(enc[n - 1]);
    }
}