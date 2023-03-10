package org.example.algorithms;

public class GroesssterGemeinsamerTeiler {
    public static int ggT(int x, int y) {
        if( x < y) {
            return ggT(y, x);
        }
        if (y == 0) {
            return x;
        }
        return ggT(x % y, y);
    }


}
