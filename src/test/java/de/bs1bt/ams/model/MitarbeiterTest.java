package de.bs1bt.ams.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MitarbeiterTest {
    @Test
    void getAlter() {
        Mitarbeiter m = new Mitarbeiter();

        m.setGebDat(LocalDate.parse("2004-05-03"));
        assertEquals(18, m.getAlter());

        m.setGebDat(LocalDate.parse("2004-04-20"));
        assertEquals(19, m.getAlter());

        Person p = new Person();
        p.setGebDat(LocalDate.parse("2003-05-02"));
        assertEquals(20, p.getAlter());
    }

    @Test
    void hatRundenGeb() {
        Mitarbeiter m = new Mitarbeiter();
        m.setGebDat(LocalDate.parse("2003-03-20"));
        assertTrue(m.hatRundenGeb());
    }
}