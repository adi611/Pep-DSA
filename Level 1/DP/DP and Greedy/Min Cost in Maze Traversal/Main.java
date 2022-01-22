import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int maze[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                maze[i][j] = in.nextInt();
            }
        }

        int minCost[][] = new int[n][m];
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if (i == n-1 && j == m-1){
                    minCost[i][j] = maze[i][j];
                } else if (j == m-1) {
                    minCost[i][j] = minCost[i+1][j] + maze[i][j];
                } else if (i == n-1) {
                    minCost[i][j] = minCost[i][j+1] + maze[i][j];
                } else {
                    minCost[i][j] = Math.min(minCost[i+1][j], minCost[i][j+1]) + maze[i][j];
                }
            }
        }
        System.out.println(minCost[0][0]);
    }

}