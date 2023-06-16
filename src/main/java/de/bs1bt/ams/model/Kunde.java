package de.bs1bt.ams.model;

import java.time.LocalDate;

public class Kunde extends Person {

    // Gemeinsame Variable für alle Kunden-Objekte
    private static int anzahlKunden = 0;
    private int kundennummer;
    private boolean hatAGBZugestimmt;

    public Kunde() {
        super();
        initialisiere();
    }

    public Kunde(String vorname,
                 String name,
                 LocalDate geburtsdatum,
                 String geschlecht,
                 int kundennummer,
                 boolean hatAGBZugestimmt
    ) {
        super(vorname, name, geburtsdatum, geschlecht);
        setHatAGBZugestimmt(hatAGBZugestimmt);
        initialisiere();
    }

    private void initialisiere() {
        anzahlKunden++;
        kundennummer = anzahlKunden;
    }

    public int getKundennummer() {
        return kundennummer;
    }

    public boolean isHatAGBZugestimmt() {
        return hatAGBZugestimmt;
    }

    public void setHatAGBZugestimmt(boolean hatAGBZugestimmt) {
        this.hatAGBZugestimmt = hatAGBZugestimmt;
    }

    @Override
    public String toString() {
        return super.toString() + "Kunde{" +
                "kundennummer=" + kundennummer +
                ", hatAGBZugestimmt=" + hatAGBZugestimmt +
                '}';
    }
}
