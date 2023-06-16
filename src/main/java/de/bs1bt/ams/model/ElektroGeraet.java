package de.bs1bt.ams.model;

import java.util.ArrayList;

// is-a - Beziehung: Ein Elektro-Gerät ist auch ein Gerät
// Die Klasse ElektroGeraet erbt alle Eigenschaften und Methoden
// der Klasse Geraet
public class ElektroGeraet extends Geraet {


    private String spannungsart;
    private Boolean hatElektroniksicherheitsprüfung;
    private int leistung;
    private int wirkungsgrad;

    public void setSpannungsart(String spannungsart) {
        this.spannungsart = spannungsart;
    }
    public String getSpannungsart() {
        return spannungsart;
    }
    public void setHatElektroniksicherheitsprüfung(Boolean hatElektroniksicherheitsprüfung) {
        this.hatElektroniksicherheitsprüfung = hatElektroniksicherheitsprüfung;
    }
    public Boolean getHatElektroniksicherheitsprüfung() {
        return hatElektroniksicherheitsprüfung;
    }
    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }
    public int getLeistung() {
        return leistung;
    }
    public void setWirkungsgrad(int wirkungsgrad) {
        this.wirkungsgrad = wirkungsgrad;
    }
    public int getWirkungsgrad() {
        return wirkungsgrad;
    }


    // Override: toString() überschreibt die Methode der Basiskklasse "Geraet"
    @Override
    public String toString() {
        // Mit super ruft man die Methode der Oberklasse auf:
        String tmp = super.toString();
        tmp += " | Spannungsart: " + getSpannungsart() + " | ";
        tmp += "Hat eine Elektroniksicherheitsprüfung: " + getHatElektroniksicherheitsprüfung() + " | ";
        tmp += "Leistung: " + getLeistung() + "W | ";
        tmp += "Wirkungsgrad: " + getWirkungsgrad() + "%]";
        return tmp;
    }
}
