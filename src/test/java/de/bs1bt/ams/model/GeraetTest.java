package de.bs1bt.ams.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeraetTest {
    @Test
    void testInventarnummer() {
        assertEquals(0, Geraet.getAnzahlGeraete());

        Geraet g1 = new Geraet();
        assertEquals(1, Geraet.getAnzahlGeraete());
        assertEquals(1, g1.getInventarnummer());

        Geraet g2 = new Geraet();
        assertEquals(2, Geraet.getAnzahlGeraete());
        assertEquals(2, g2.getInventarnummer());

        Geraet g3 = new Geraet();
        assertEquals(3, Geraet.getAnzahlGeraete());
        assertEquals(3, g3.getInventarnummer());
    }
}