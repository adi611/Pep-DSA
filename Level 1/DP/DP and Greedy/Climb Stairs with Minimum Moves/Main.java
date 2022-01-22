import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int jumps[] = new int[n];
        for(int i=0;i<n;i++){
            jumps[i] = in.nextInt();
        }

        Integer minMoves[] = new Integer[n+1];
        minMoves[n] = 0;

        for(int pos=n-1;pos>=0;pos--){
            int min = Integer.MAX_VALUE;
            for(int jump=1;jump<=jumps[pos] && pos+jump <= n;jump++){
                if(minMoves[pos+jump] != null){
                    min = Math.min(min, minMoves[pos+jump]);
                }
            }
            if(min != Integer.MAX_VALUE){
                minMoves[pos] = min+1;
            }
        }
        System.out.println(minMoves[0]);
    }

}