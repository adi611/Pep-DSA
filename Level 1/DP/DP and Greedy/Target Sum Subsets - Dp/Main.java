import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        boolean ans = false;

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int set[] = new int[n];
        for(int i=0;i<n;i++){
            set[i] = in.nextInt();
        }
        int tar = in.nextInt();
        boolean targets[][] = new boolean[n+1][tar+1];

        targets[0][0] = true;
        for(int i=1;i<=n;i++){
            int element = set[i-1];
            for(int target=0;target<=tar;target++){
                if (target == 0){
                    targets[i][target] = true;
                } else if (targets[i-1][target]) {
                    targets[i][target] = true;
                } else if (element == target) {
                    targets[i][target] = true;
                } else if (target > element && targets[i-1][target-element]) {
                    targets[i][target] = true;
                }
            }
            // if(targets[i][tar]){
            //     ans = true;
            //     break;
            // }
        }
        // System.out.println(ans);
        System.out.println(targets[n][tar]);
    }
}