package org.example.sort;

public class QuickSort {

    public static int partition(int[] array, int lo, int hi, int p) {
        int pn = lo;
        int pv = array[p];

        // Pivot-Element an das Ende verschieben
        swap(array, p, hi);
        for (int i = lo; i < hi; i++) {
            if (array[i] <= pv) {
                swap(array, pn++, i);
            }
        }
        // Pivot-Element an die richtige Position kopieren
        swap(array, hi, pn);
        return pn;
    }

    public static void qSort(int[] array, int lo, int hi) {
        // Pivot-Element bestimmen
        int p = (lo + hi) / 2;
        if (hi > lo) {
            // Feld zerlegen
            int pn = partition(array, lo, hi, p);
            // und Partitionen sortieren
            qSort(array, lo, pn - 1);
            qSort(array, pn + 1, hi);
        }
    }



    public static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }


    public static void quickSort(int[] array){
        qSort(array, 0, array.length-1);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 6, 8, 5, 9, 100, 2304, 100023, 2};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        quickSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

}
