package org.example.sort;

public class BubbleSort {

    public static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    public static void sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) { // obergrenze
            boolean swapped = false;
            for (int j = 0; j < i; j++) { // damit Sortierte nicht wieder sortiert werden.
                if (arr[j] > arr[j+1]) {
                    swap(arr, j+1 , j);
                    swapped = true;
                }
            }
            if(!swapped) break; // Schleife wird abgebrochen wenn alle geswapt wurden.
        }
    }

    public static void sndsort(int[] arr) {
        boolean swapped;
        do {
            swapped = false;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 8, 3, 9, 2};
        sort(arr);
        sndsort(arr);
        System.out.print("\nBubbleSort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        System.out.print("\n2nd BubbleSort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
}
