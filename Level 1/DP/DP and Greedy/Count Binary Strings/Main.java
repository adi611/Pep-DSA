import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int countZero = 1, countOne = 1;

        for (int i = 1; i < n; i++) {
            int newCountZero = countOne;
            int newCountOne = countZero + countOne;

            countOne = newCountOne;
            countZero = newCountZero;
        }
        System.out.println(countOne + countZero);
    }

}