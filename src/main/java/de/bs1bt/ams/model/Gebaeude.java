package de.bs1bt.ams.model;

import java.util.ArrayList;

public class Gebaeude {
    private int gebaeudenummer;
    private String bezeichnung;
    private int stockwerke;
    private String beschreibung;

    // Neuer Datentyp ArrayListRaum wird zur Kompilierzeit erzeugt
    private ArrayList<Raum> raumListe = new ArrayList<Raum>();

    public Gebaeude(String bezeichnung, int stockwerke, String beschreibung)
    {
        setGebaeudenummer(-1);
        setBezeichnung(bezeichnung);
        setStockwerke(stockwerke);
        setBeschreibung(beschreibung);
    }
    public Gebaeude(int gebaeudenummer, String bezeichnung, int stockwerke, String beschreibung) {
        this.gebaeudenummer = gebaeudenummer;
        this.bezeichnung = bezeichnung;
        this.stockwerke = stockwerke;
        this.beschreibung = beschreibung;
    }

    public int getGebaeudenummer() {
        return gebaeudenummer;
    }

    public void setGebaeudenummer(int gebaeudenummer) {
        this.gebaeudenummer = gebaeudenummer;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getStockwerke() {
        return stockwerke;
    }

    public void setStockwerke(int stockwerke) {
        this.stockwerke = stockwerke;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public ArrayList<Raum> getRaumListe() {
        return raumListe;
    }

    public void setRaumListe(ArrayList<Raum> raumListe) {
        this.raumListe = raumListe;
    }

    public double gesamtflaeche() {
        double gesamtflaeche = 0.0;
        for(int i=0; i<raumListe.size(); i++) {
            gesamtflaeche += raumListe.get(i).getFlaecheInQm();
        }
        return gesamtflaeche;
    }

    @Override
    public String toString() {
        String tmp = super.toString();

        tmp += "\nGebäude: " + getBezeichnung();
        tmp += "\nGesamtfläche: " + gesamtflaeche() + " qm";
        tmp += "\n[\n";
        for(Raum r: raumListe) {
            tmp += "\t" + r.toString();
            tmp += "\n";
        }
        tmp += "\n]";
        return tmp;
    }
}
