package de.bs1bt.ams.model;

public class Raum {
    /*
    private final int FREI = 1;
    private final int GESPERRT = 2;
    private final int GEBUCHT = 3;
    private final int ANGEFRAGT = 4;
     */

    /** Aufzählungstyp (enumeration) */
    public enum BuchungsStatus {
        FREI,
        GESPERRT,
        GEBUCHT,
        ANGEFRAGT
    }

    // Entspricht: "Raum anlegen"
    private BuchungsStatus zustand = BuchungsStatus.FREI;

    private int id;
    private String bezeichnung;
    private String gebaeude;
    private double breiteInCm;
    private double laengeInCm;
    private int garantieInMonaten;

    public Raum() {
        //zustand = 1; // Don't use magic numbers => "lieber Konstanten verwenden"
        breiteInCm = 100;
        this.laengeInCm = 100;
    }

    public Raum(double laengeInCm, double breiteInCm) throws Exception {
        //zustand = FREI;
        /* Redundanter Code:
           Mindestens 2 Stellen im Code machen das selbe,
           das erhöht die Fehleranfälligkeit,
           verringert die Wartbarkeit und Änderbarkeit

        if(laengeInCm>=0) {
            this.laengeInCm = laengeInCm;
        }
           => Abhilfe ist Wiederverwendung von Code
         */
        setLaengeInCm(laengeInCm);
        setBreiteInCm(breiteInCm);
    }

    public Raum(String bezeichnung, String gebaeude) throws Exception {
        //zustand = FREI;
        setId(-1);
        setBezeichnung(bezeichnung);
        setGebaeude(gebaeude);
        setBreiteInCm(0);
        setLaengeInCm(0);
    }

    public Raum(int id, String bezeichnung, String gebaeude, double breiteInCm, double laengeInCm) throws Exception {
        //zustand = FREI;
        setId(id);
        setBezeichnung(bezeichnung);
        setGebaeude(gebaeude);
        setBreiteInCm(breiteInCm);
        setLaengeInCm(laengeInCm);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getGebaeude() {
        return gebaeude;
    }

    public void setGebaeude(String gebaeude) {
        this.gebaeude = gebaeude;
    }

    public double getBreiteInCm() {
        return breiteInCm;
    }

    public void setBreiteInCm(double breiteInCm) throws Exception {
        if(laengeInCm < 0) {
            throw new Exception("Invalider Wert für Parameter breiteInCm (>0 cm!): " + breiteInCm);
        }
        this.breiteInCm = breiteInCm;
    }

    public double getLaengeInCm() {
        return laengeInCm;
    }

    public void setLaengeInCm(double laengeInCm) throws Exception {
        if(laengeInCm < 0) {
            throw new Exception("Invalider Wert für Parameter laengeInCm (>0 cm!): " + laengeInCm);
        }
        this.laengeInCm = laengeInCm;
    }


    /**
     * @TODO Untersuchen Sie die Methode auf etwaige Fehler und verbessern Sie diese.
     * @return
     */
    public double getFlaecheInQm() {
        double flaeche = laengeInCm * breiteInCm;
        return flaeche;
    }

    /**
     * @TODO Implementieren Sie die toString()-Methode mit einer sinnvollen Ausgabe selbst.
     * @TODO Nutzen Sie die "Generate-Funktion" im Kontext-Menü von IntelliJ, um die Methode automatisch generieren zu lassen.
     * @return
     */

    public BuchungsStatus getZustand() {
        return zustand;
    }

    public void sperren() {
        if(zustand == BuchungsStatus.FREI) {
            this.zustand = BuchungsStatus.GESPERRT;
        } else {
            System.out.println("Zustandswechsel nicht erlaubt");
        }
    }
    public void aufheben() {
        if(zustand == BuchungsStatus.GESPERRT) {
            this.zustand = BuchungsStatus.FREI;
        } else {
            System.out.println("Zustandswechsel nicht erlaubt");
        }
    }
}
