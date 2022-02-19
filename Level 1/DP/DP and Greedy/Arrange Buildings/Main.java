import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int countBg = 1, countPlot = 1;

        for (int i = 1; i < n; i++) {
            countBg = countPlot;
            countPlot += countBg;
        }
        System.out.println(countBg * countBg);
    }

}