package de.bs1bt.ams.instanziierung;

import de.bs1bt.ams.model.Geraet;
import de.bs1bt.ams.model.Raum;

public class Instanziierung {
    public static void main(String[] args) throws Exception {
        // Datentypen => Overflow
        byte b = 127;
        System.out.println("b: " + b);
        b = (byte) (b + 1);
        int i = 32343423;
        short s = (short) i;
        System.out.println("b: " + b);
        System.out.println("i: " + i);
        System.out.println("s: " + s);


        // Klasse Geraet modelliert und implementiert
        Geraet beamer = new Geraet();
        Geraet tafel = new Geraet();

        //tafel.raum = "111";
        tafel.setRaum("111");
        tafel.kaufdatum = "2010,03-12";
        tafel.seriennummer = new String("ta1234");
        tafel.hersteller = "Tafel AG";
        tafel.modell = "Klapptafel 123";
        tafel.garantieInM = 36;
        tafel.defekt = false;
        tafel.inventarnummer = 123456;

        // Benutzer gibt -17.99
        double tmpKaufpreis = -17.99;
        if(tmpKaufpreis < 0) {
            System.out.println("Der Kaufpreis darf nicht negativ sein!");
        } else {
            tafel.kaufpreis = -17.99; // TODO, was machen wir mit solchen Fehlern?
        }
        System.out.println(beamer.toString());
        System.out.println(tafel.toString());


        // Konstruktor für Klasse Raum testen
        Raum u1 = new Raum();
        System.out.println("u1.laenge:" + u1.getLaengeInCm());
        System.out.println("u1.breite:" + u1.getBreiteInCm());

        Raum u2 = new Raum(-200, 300);
        System.out.println("u2.laenge:" + u2.getLaengeInCm());
        System.out.println("u2.breite:" + u2.getBreiteInCm());

    }
}
