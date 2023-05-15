package de.bs1bt.ams.model;

import java.time.LocalDate;

public class Kunde extends Person {

    private int kundennummer;
    private boolean hatAGBZugestimmt;

    public Kunde() {
        super();
    }

    public Kunde(String vorname,
                 String name,
                 LocalDate geburtsdatum,
                 String geschlecht,
                 int kundennummer,
                 boolean hatAGBZugestimmt
    ) {
        super(vorname, name, geburtsdatum, geschlecht);
        setKundennummer(kundennummer);
        setHatAGBZugestimmt(hatAGBZugestimmt);
    }

    public int getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }

    public boolean isHatAGBZugestimmt() {
        return hatAGBZugestimmt;
    }

    public void setHatAGBZugestimmt(boolean hatAGBZugestimmt) {
        this.hatAGBZugestimmt = hatAGBZugestimmt;
    }
}
