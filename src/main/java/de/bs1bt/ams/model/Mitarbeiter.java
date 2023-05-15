// Klasse Mitarbeiter
package de.bs1bt.ams.model;

import java.time.*;
import java.lang.*;

public class Mitarbeiter extends Person {

    private int personalnummer;
    private double gehalt;
    private String angestelltSeit;

    public Mitarbeiter() {
        super();
    }

    public Mitarbeiter(String vorn, String n, LocalDate gD, String g, int p, double geh, String as) {
        super(vorn, n, gD, g); // Aufruf des Basis-Konstruktors
        setPersonalnummer(p);
        setGehalt(geh);
        setAngestelltSeit(as);
    }


    public int getPersonalnummer() {
        return personalnummer;
    }

    public void setPersonalnummer(int personalnummer) { this.personalnummer = personalnummer; }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public String getAngestelltSeit() {
        return angestelltSeit;
    }

    public void setAngestelltSeit(String angestelltSeit) {
        this.angestelltSeit = angestelltSeit;
    }

}