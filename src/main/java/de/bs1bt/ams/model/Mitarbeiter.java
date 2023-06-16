// Klasse Mitarbeiter
package de.bs1bt.ams.model;

import java.time.*;
import java.lang.*;

public class Mitarbeiter extends Person {

    private static int anzahlMitarbeiter = 0;
    private int personalnummer;
    private double gehalt;
    private LocalDate anfangsDatum;

    public Mitarbeiter() {
        super();
        initialisiere();
    }

    public Mitarbeiter(String vorn, String n, LocalDate gD, String g, int p, double geh, LocalDate as) {
        super(vorn, n, gD, g); // Aufruf des Basis-Konstruktors
        setPersonalnummer(p);
        setGehalt(geh);
        setAnfangsDatum(as);
        initialisiere();
    }

    private void initialisiere() {
        anzahlMitarbeiter++;
        setPersonalnummer(anzahlMitarbeiter);
    }

    public int getPersonalnummer() {
        return personalnummer;
    }

    private void setPersonalnummer(int personalnummer) { this.personalnummer = personalnummer; }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public LocalDate setAnfangsDatum() {
        return anfangsDatum;
    }

    public void setAnfangsDatum(LocalDate anfangsDatum) {
        this.anfangsDatum = anfangsDatum;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mitarbeiter{" +
                "personalnummer=" + personalnummer +
                ", gehalt=" + gehalt +
                ", anfangsDatum=" + anfangsDatum +
                '}';
    }
}