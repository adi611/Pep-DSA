import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int den[] = new int[n];
        for (int i = 0; i < n; i++) {
            den[i] = in.nextInt();
        }
        int amt = in.nextInt();

        int per[] = new int[amt + 1];
        per[0] = 1;

        for (int i = 1; i <= amt; i++) {
            for (int j = 0; j < n; j++) {
                if (den[j] <= i) {
                    per[i] += per[i - den[j]];

                }
            }
        }
        System.out.println(per[amt]);
    }
}