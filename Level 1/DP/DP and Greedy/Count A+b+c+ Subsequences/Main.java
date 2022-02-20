import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int n = str.length();
        int subsequences[][] = new int[3][n + 1];
        for (int stringPos = 1; stringPos < subsequences[0].length; stringPos++) {
            ;
            char ch = str.charAt(stringPos - 1);
            if (ch == 'a') {
                subsequences[0][stringPos] = 2 * subsequences[0][stringPos - 1] + 1;
                subsequences[1][stringPos] = subsequences[1][stringPos - 1];
                subsequences[2][stringPos] = subsequences[2][stringPos - 1];
            } else if (ch == 'b') {
                subsequences[1][stringPos] = 2 * subsequences[1][stringPos - 1] + subsequences[0][stringPos - 1];
                subsequences[0][stringPos] = subsequences[0][stringPos - 1];
                subsequences[2][stringPos] = subsequences[2][stringPos - 1];
            } else {
                subsequences[2][stringPos] = 2 * subsequences[2][stringPos - 1] + subsequences[1][stringPos - 1];
                subsequences[0][stringPos] = subsequences[0][stringPos - 1];
                subsequences[1][stringPos] = subsequences[1][stringPos - 1];
            }
        }
        System.out.println(subsequences[2][n]);
    }
}