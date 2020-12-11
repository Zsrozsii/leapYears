package test;

import main.main;
import org.junit.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @org.junit.jupiter.api.Test
    void checkIfLeap() {
        main main = new main();

        assertEquals(true, main.checkIfLeap(2000));
        assertEquals(true, main.checkIfLeap(1988));
        assertEquals(true, main.checkIfLeap(2012));
        assertEquals(true, main.checkIfLeap(1976));
        assertEquals(false, main.checkIfLeap(1700));
        assertEquals(false, main.checkIfLeap(1800));
        assertEquals(false, main.checkIfLeap(1451));
    }

    @Test
    void validEvszam() {
        main main = new main();

        assertEquals(true, main.validEvszam(1200));
        assertEquals(false, main.validEvszam(-2334));
        assertEquals(false, main.validEvszam(0));
    }
}