package day01;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class RunningTest {
    Running running = new Running();

    @Test
    void TestTelj1() throws IOException {
        assertEquals(25.9, running.telj(2022, 01));
    }

    @Test
    void TestTelj2() throws IOException {
        assertEquals(41.2, running.telj(2021, 12));
    }

    @Test
    void TestTelj3() throws IOException {
        assertEquals(7.1, running.telj(2021, 11));
    }

    @Test
    void TestTelj4() throws IOException {
        assertEquals(0.0, running.telj(2021, 10));
    }
}