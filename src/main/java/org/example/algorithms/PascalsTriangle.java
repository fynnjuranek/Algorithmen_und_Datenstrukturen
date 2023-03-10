package org.example.algorithms;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> pascalsTriangle(int n) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>(1);
        firstRow.add(1);
        triangle.add(firstRow);
        for (int i = 1; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prev = triangle.get(i-1);
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prev.get(j-1)+prev.get(j));
            }
            row.add(1);
            triangle.add(row);
            System.out.println(row);
        }
        return triangle;
    }

    public static List<Integer> pascalsTriangleRowSelect(int n) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>(1);
        firstRow.add(1);
        triangle.add(firstRow);
        for (int i = 1; i <= n; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prev = triangle.get(i-1);
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prev.get(j-1)+prev.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle.get(n);
    }
}
