import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int den[] = new int[n];
        for(int i=0;i<n;i++){
            den[i] = in.nextInt();
        }
        int amt = in.nextInt();

        int count[][] = new int[n+1][amt+1];
        count[0][0] = 1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=amt;j++){
                count[i][j] = count[i-1][j];
                if(j == 0){
                    count[i][j] = 1;
                } if (j >= den[i-1]){
                    count[i][j] += count[i][j-den[i-1]];
                }
            }
        }
        System.out.println(count[n][amt]);
    }
}