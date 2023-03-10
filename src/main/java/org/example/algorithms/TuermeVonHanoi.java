package org.example.algorithms;

public class TuermeVonHanoi {
    public static void towersOfHanoi(int n, String quelle, String senke, String ab) {
        if (n == 0) {
            return;
        }
        towersOfHanoi(n-1, quelle, ab, senke);
        System.out.println("Bewege Scheibe " + n + " von " + quelle + " zur " + senke);
        towersOfHanoi(n-1, ab, senke, quelle);
    }
}
