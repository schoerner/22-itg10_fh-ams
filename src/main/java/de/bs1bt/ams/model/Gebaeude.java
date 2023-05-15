package de.bs1bt.ams.model;

public class Gebaeude {
    private int gebaeudenummer;
    private String bezeichnung;
    private int stockwerke;
    private String beschreibung;

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
}
