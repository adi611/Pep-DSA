import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int val[] = new int[n];
        int weights[] = new int[n];
        int cap;

        for (int i = 0; i < n; i++) {
            val[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            weights[i] = in.nextInt();
        }

        cap = in.nextInt();

        int maxValue[] = new int[cap + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < maxValue.length; j++) {
                if (weights[i] <= j) {
                    int max = Math.max(maxValue[j], val[i] + maxValue[j - weights[i]]);
                    maxValue[j] = max;
                }
            }
        }

        System.out.println(maxValue[cap]);
    }
}