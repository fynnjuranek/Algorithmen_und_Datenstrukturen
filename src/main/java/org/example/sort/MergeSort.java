package org.example.sort;

public class MergeSort {

    public static void mergeSort(int[] arr) {
        msort(arr, 0, arr.length - 1);
    }

    public static void msort(int[] arr, int le, int ri) {
        int i, j, k;
        int[] b = new int[arr.length]; // Hilfsarray

        if (ri > le) {
            int mid = (ri + le) / 2;

            msort(arr, le, mid);
            msort(arr, mid + 1, ri);

            // linke Seite ins Hilfsarray übertragen
            for (k = le; k <= mid; k++) {
                b[k] = arr[k];
            }
            // rechte Seite ins Hilfsarray übertragen
            for (k = mid; k < ri; k++) {
                b[ri + mid - k] = arr[k + 1];
            }
            // Two-Pointer Methode zum einsetzten der Elemente, in das richtige Array
            i = le; j = ri;
            for (k = le; k <= ri; k++) {
                if (b[i] < b[j]) {
                    arr[k] = b[i++];
                } else {
                    arr[k] = b[j--];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 8, 3, 9, 2};
        mergeSort(arr);
        System.out.print("\nMergeSort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
}
