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

    @Test
    void lnko2Test1() {
        assertEquals(22, mathAlgorithms.lnko2(242, 88));
    }

    @Test
    void lnko2Test2() {
        assertEquals(4, mathAlgorithms.lnko2(68, 128));
    }

    @Test
    void lnko2Test3() {
        assertEquals(1, mathAlgorithms.lnko2(155, 84));
    }

    @Test
    void lnko2Test4() {
        assertEquals(6, mathAlgorithms.lnko2(1668, 1194));
    }

}