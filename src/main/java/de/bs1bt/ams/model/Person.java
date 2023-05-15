package de.bs1bt.ams.model;

import java.time.LocalDate;

public class Person {

    private String name;
    private String vorname;
    private LocalDate gebDat;
    private String geschlecht;


    public Person() {
    }

    public Person(String vorn, String n, LocalDate gD, String g) {
        setName(n); // Verwende die Methode der Basisklasse
        setVorname(vorn);
        setGebDat(gD);
        setGeschlecht(g);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public LocalDate getGebDat() {
        return gebDat;
    }

    public void setGebDat(LocalDate gebDat) {
        this.gebDat = gebDat;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }


    // 02.03.2023 Deutsch
/*public int getAlter() {
LocalDate heute = LocalDate.now();
LocalDate gebbi = LocalDate.parse(gebDat);
Period p = gebbi.until(heute);
String s = String.valueOf(p);
int i = Integer.parseInt(s);
return i;
} */
    public int getAlter() {
        return gebDat.until(LocalDate.now()).getYears();
    }

    public boolean hatRundenGeb() {
        return (gebDat.getYear() - LocalDate.now().getYear()) % 10 == 0;
    }

    @Override
    public String toString() {
        //String tmp = toString(); // Rekursion: Die Methode ruft sich selbst auf
        String tmp = super.toString();
        tmp += ", " + vorname + ", " + name;
        return tmp;
    }
}
