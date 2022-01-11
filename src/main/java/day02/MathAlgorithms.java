package day02;

public class MathAlgorithms {

    public int lnko(int a, int b) {
        if (b == 0) {
            return a;
        }
        return lnko(b, a % b);
    }

    public int lnko2(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else b -= a;
        }
        return a;
    }
}
