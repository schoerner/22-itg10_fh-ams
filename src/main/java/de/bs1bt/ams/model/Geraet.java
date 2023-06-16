package de.bs1bt.ams.model;

public class Geraet {

    public enum ZeitEinheit {
        MONATE,
        JAHRE
    }

    // Attribute
    private String raum;    // Das Attribut raum ist nur innerhalb der Klasse gültig/sichtbar (wenn private)
    public String seriennummer;
    public double kaufpreis;
    public String kaufdatum;
    public boolean defekt;
    public String modell;
    public String hersteller;
    public int garantieInM;
    public int inventarnummer;
    private static int anzahlGeraete;// = 0;

    // has-a - Beziehung:
    // Gerät ist in einem Raum:
    private Raum istInRaum;

    public Geraet() {
        anzahlGeraete = anzahlGeraete+1;
        inventarnummer = anzahlGeraete;
    }

    public Raum istInRaum() {
        return istInRaum;
    }
    public static int getAnzahlGeraete() {
        // Das geht nicht:
        // System.out.println("invantarnr.:" + inventarnummer);
        return anzahlGeraete;
    }

    // Get- und Set-Methoden
    public void setRaum(String raum) // Deklaration der Methode
    {   // Definition der Methode
        // Die Variable raum ist lokale Variable,
        // die nur innerhalb der Methode setRaum() gültig / sichtbar ist.#

        this.raum = raum;       // hinter this verbirgt sich das aktuelle Objekt (Objektereferenz)
                                // this. (PUnkt!) ist das Dereferenzieren (zum Objekt navigieren und das Attribut holen)
    }

    public String getRaum() {
        return raum;
    }

    public String getSeriennummer() {
        return seriennummer;
    }

    public void setSeriennummer(String seriennummer) {
        this.seriennummer = seriennummer;
    }

    public double getKaufpreis() {
        return kaufpreis;
    }

    public void setKaufpreis(double kaufpreis) {
        this.kaufpreis = kaufpreis;
    }

    public String getKaufdatum() {
        return kaufdatum;
    }

    public void setKaufdatum(String kaufdatum) {
        this.kaufdatum = kaufdatum;
    }

    public boolean isDefekt() {
        return defekt;
    }

    public void setDefekt(boolean defekt) {
        this.defekt = defekt;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public int getGarantie() {
        return garantieInM;
    }

    public void setGarantie(int garantieInM) {
        if(garantieInM >= 0) {
            this.garantieInM = garantieInM;
        }
    }
    /** Überladen der Methode setGarantie (gleicher Methodenname): */
    public void setGarantie(int garantie, ZeitEinheit einheit){
        if(einheit == ZeitEinheit.MONATE) {
            setGarantie(garantie);
        } else {
            garantie = garantie * 12;
            setGarantie(garantie);
        }
    }

    public int getInventarnummer() {
        return inventarnummer;
    }

    public void setInventarnummer(int inventarnummer) {
        this.inventarnummer = inventarnummer;
    }

    //Sonstige Methoden
    @Override
    public String toString() {
        String tmp = super.toString();
        tmp += getClass().getName();
        tmp += "[";
        tmp += "Raum: "+ raum;
        tmp += " | Seriennummer: "+ seriennummer;
        tmp += " | Kaufdatum: "+ kaufdatum;
        tmp += " | Modell: "+ modell;
        tmp += " | Hersteller: "+ hersteller;
        tmp += " | Defekt: " + defekt;
        tmp += " | Garantie in Monaten: " + garantieInM;
        tmp += " | Kaufpreis: " + kaufpreis + "€";
        tmp += " | Inventarnummer: " + inventarnummer;
        return tmp;
    }


}
