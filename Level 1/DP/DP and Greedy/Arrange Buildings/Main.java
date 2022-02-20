import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int countWaysEndWithBg = 1, countWaysEndWithPlot = 1;

        for (int i = 1; i < n; i++) {
            int temp = countWaysEndWithBg;
            countWaysEndWithBg = countWaysEndWithPlot;
            countWaysEndWithPlot += temp;
        }

        long waysOneSide = countWaysEndWithBg + countWaysEndWithPlot;
        System.out.println(waysOneSide * waysOneSide);
    }

}