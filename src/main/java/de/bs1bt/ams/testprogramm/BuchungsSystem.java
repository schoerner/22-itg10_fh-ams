package de.bs1bt.ams.testprogramm;

import de.bs1bt.ams.model.Raum;

public class BuchungsSystem {

    public static void main(String[] args) {
        Raum r = new Raum();
        System.out.println("Zustand: "+ r.getZustand());

        r.sperren();
        System.out.println("Zustand: "+ r.getZustand());

        r.aufheben();
        System.out.println("Zustand: "+ r.getZustand());

        // bringt eine Fehlermeldung, da Zustandswechsel nicht erlaubt:
        r.aufheben();
        System.out.println("Zustand: "+ r.getZustand());
    }
}
