import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // int cp = countPaths(n, new int[n + 1]);
        int cp = countPathsTab(n);
        System.out.println(cp);
    }

    public static int countPaths(int n, int[] qb) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        if (qb[n] != 0) {
            return qb[n];
        }

        int p1 = countPaths(n - 1, qb);
        int p2 = countPaths(n - 2, qb);
        int p3 = countPaths(n - 3, qb);

        int cp = p1 + p2 + p3;
        qb[n] = cp;

        return cp;
    }

    public static int countPathsTab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else if (i == 2) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }
        return dp[n];
    }

}