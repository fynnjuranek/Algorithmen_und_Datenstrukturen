package org.example.sort;

public class InsertionSort {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int m = arr[i];
            int j = i;
            while (j > 0 && arr[j-1] > m) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = m;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 8, 3, 9, 2};
        sort(arr);
        System.out.print("\nInsertionSort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");

    }
}
