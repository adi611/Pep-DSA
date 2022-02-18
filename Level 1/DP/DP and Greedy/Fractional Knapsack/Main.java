import java.util.*;
import java.io.*;

public class Main {
    public static class Item implements Comparable<Item> {
        private int wt;
        private int val;
        private double vwratio;

        public int compareTo(Item item) {
            if (this.vwratio > item.vwratio) {
                return 1;
            } else if (this.vwratio < item.vwratio) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String args[]) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Item item[] = new Item[n];

        for (int i = 0; i < n; i++) {
            item[i] = new Item();
            item[i].val = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            item[i].wt = in.nextInt();
            item[i].vwratio = item[i].val * 1.0 / item[i].wt;
        }

        int cap = in.nextInt();
        int remainingCap = cap;
        double valInBag = 0;

        Arrays.sort(item);

        for (int i = n - 1; i >= 0; i--) {
            if (item[i].wt < remainingCap) {
                valInBag += item[i].val;
                remainingCap -= item[i].wt;
            } else {
                valInBag += item[i].vwratio * remainingCap;
                remainingCap = 0;
            }
        }

        System.out.println(valInBag);
    }
}