package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    MathAlgorithms mathAlgorithms = new MathAlgorithms();

    @Test
    void lnkoTest1() {
        assertEquals(22, mathAlgorithms.lnko(242, 88));
    }

    @Test
    void lnkoTest2() {
        assertEquals(4, mathAlgorithms.lnko(68, 128));
    }

    @Test
    void lnkoTest3() {
        assertEquals(1, mathAlgorithms.lnko(155, 84));
    }

}