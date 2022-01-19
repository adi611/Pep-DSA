import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int fibo[] = new int[n+1];

    fibo[0] = 0;
    fibo[1] = 1;
    for(int i=2; i<=n; i++){
        fibo[i] = fibo[i-1] + fibo[i-2];
    }

    System.out.println(fibo[n]);
 }

}