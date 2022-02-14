import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int val[] = new int[n];
        int weights[] = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            weights[i] = in.nextInt();
        }
        int cap = in.nextInt();

        int dp[][] = new int[n + 1][cap + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (weights[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    int max = Math.max(dp[i - 1][j], dp[i - 1][j - weights[i - 1]] + val[i - 1]);
                    dp[i][j] = max;
                }
            }
        }

        System.out.println(dp[n][cap]);
    }
}