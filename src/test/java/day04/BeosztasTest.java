package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeosztasTest {

    @Test
    void ora() {
        Beosztas b = new Beosztas();
        b.reader();
        assertEquals(3, b.ora("Albatrosz Aladin"));
        assertEquals(2, b.ora("Csincsilla Csilla"));
        assertEquals(0, b.ora("John Doe"));
    }
}