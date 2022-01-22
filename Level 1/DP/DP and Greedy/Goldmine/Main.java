import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int goldmine[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                goldmine[i][j] = in.nextInt();
            }
        }

        int maxGold[][] = new int[n][m];
        for(int j=m-1;j>=0;j--){
            for(int i=n-1;i>=0;i--){
                if (j == m-1) {
                    maxGold[i][j] = goldmine[i][j];
                } else if (i == n-1) {
                    maxGold[i][j] = goldmine[i][j] + Math.max(maxGold[i][j+1], maxGold[i-1][j+1]);
                } else if (i == 0) {
                    maxGold[i][j] = goldmine[i][j] + Math.max(maxGold[i][j+1], maxGold[i+1][j+1]);
                } else {
                    maxGold[i][j] = goldmine[i][j] + Math.max(Math.max(maxGold[i][j+1], maxGold[i+1][j+1]), maxGold[i-1][j+1]);
                }
            }
        }

        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            ans = Math.max(ans, maxGold[i][0]);
        }

        System.out.println(ans);
    }

}