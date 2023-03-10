package org.example.sort;

public class SelectionSort {
    public static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    public static void sort(int[] arr) {
        int marker = arr.length - 1;
        while (marker >= 0) {
            int max = 0;
            for (int i = 1; i <= marker; i++) {
                if (arr[i] > arr[max]) {
                    max = i;
                }
            }
            swap(arr, marker, max);
            marker--;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 5, 1, 8, 3, 9, 2};
        sort(arr);

        System.out.print("\nSelectionSort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
