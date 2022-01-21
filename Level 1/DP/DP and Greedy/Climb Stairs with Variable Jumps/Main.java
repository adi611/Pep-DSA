import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int jumps[] = new int[n];
        for(int i=0; i<n; i++){
            jumps[i] = in.nextInt();
        }
        int paths[] = new int[n+1];
        paths[n] = 1;

        for(int i=n-1;i>=0;i--){
            for(int j=1; j<=jumps[i] && i+j<paths.length; j++){
                paths[i] += paths[i + j];
            }
        }
        System.out.println(paths[0]);
    }

}