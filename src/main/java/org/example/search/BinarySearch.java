package org.example.search;
/*
für die Binäre Suche muss die Liste sortiert sein!
Big-O Laufzeit ist Log2 n
 */
public class BinarySearch {
    public final static int NO_KEY = -1;
    public static int search(int[] arr, int key) {
        int lo = 0, hi = arr.length - 1, m = 0;

        while (lo <= hi) {
            m = (lo + hi) / 2;
            if (arr[m] == key) {
                return m;
            } else if (key < arr[m]) {
                hi = m - 1;
            } else {
                lo = m + 1;
            }
        }
        return NO_KEY;
    }


    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("usage: SeqSearch <key>");
            return;
        }
        int[] f = { 2, 4, 5, 6, 7, 8, 9, 11 };
        int k = Integer.parseInt(args[0]);
        System.out.println("Binär: " + search(f, k));
    }
}
