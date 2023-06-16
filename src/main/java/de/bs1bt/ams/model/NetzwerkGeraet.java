package de.bs1bt.ams.model;

// Die Klasse NetzwerkGeraet erbt alle Eigenschaften und Methoden
// der Klasse ElektroGeraet
public class NetzwerkGeraet extends Geraet {
    private String typ;
    private int laufzeit;
    private int kapatzität;

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getTyp() {
        return typ;
    }

    public void setLaufzeit(int laufzeit) {
        this.laufzeit = laufzeit;
    }

    public int getLaufzeit() {
        return laufzeit;
    }

    public void setKapatzität(int kapatzität) {
        this.kapatzität = kapatzität;
    }

    public int getKapatzität() {
        return kapatzität;
    }

    // Override: toString() überschreibt die Methode der Basiskklasse "ElektroGeraet"
    @Override
    public String toString() {
        // Mit super ruft man die Methode der Oberklasse auf:
        String tmp = super.toString();
        tmp += " | Typ: " + getTyp() + " | ";
        tmp += "Kapazität: " + getKapatzität() + "VA | ";
        tmp += "Laufzeit: " + getLaufzeit() + "min | ";
        return tmp;
    }
}
