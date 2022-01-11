package day02;

public class MathAlgorithms {

    public int lnko(int a, int b) {
        if(b == 0) {
            return a;
        }
        return lnko(b, a % b);
    }
}
