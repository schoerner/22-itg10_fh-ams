package de.bs1bt.ams.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GebaeudeTest {

    @Test
    void testToString() {
        Gebaeude itc = new Gebaeude("IT-Container", 2, "Asyl für Fachinformatiker und ihre Lehrer");

        Raum u1 = new Raum();
        u1.setBezeichnung("U1");
        itc.getRaumListe().add(u1);

        Raum u2 = new Raum();
        u2.setBezeichnung("U2");
        itc.getRaumListe().add(u2);

        System.out.println(itc.toString());
    }
}