package de.bs1bt.ams.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class BeziehungenTest {

    @Test
    void testeAlleBeziehungen() throws Exception {
        Geraet tafel = new Geraet();
        Mitarbeiter meike = new Mitarbeiter();
        Kunde max = new Kunde();
        ElektroGeraet netzteil = new ElektroGeraet();
        NetzwerkGeraet router = new NetzwerkGeraet();


        ////////////////////////////mitarbeiter.felix///////////////////////////////////////////////////
        meike.setVorname("Meike");
        meike.setNachname("Musterfrau");
        meike.setGeschlecht("w");
        meike.setGeburtsDatum(LocalDate.parse("2002-07-08"));
        //meike.setPersonalnummer(001);
        meike.setGehalt(1500);
        meike.setAnfangsDatum(LocalDate.parse("2022-09-01"));
        System.out.println(meike.toString());

        //////////////////////////////kunde.max//////////////////////////////////////////
        max.setVorname("Max");
        max.setNachname("Mustermann");
        max.setGeschlecht("m");
        max.setGeburtsDatum(LocalDate.parse("2000-01-01"));
        //max.setKundennummer(1234);
        max.setHatAGBZugestimmt(true);
        System.out.println(max.toString());

        //////////////////////////////////elektrogeraet.netzteil//////////////////////////////////////
        netzteil.setRaum("U01");
        netzteil.setSeriennummer("2349603FQL");
        netzteil.setKaufdatum("16.05.2023");
        netzteil.setModell("EliteBook 840");
        netzteil.setHersteller("HP");
        netzteil.setDefekt(false);
        netzteil.setGarantie(45, Geraet.ZeitEinheit.MONATE);    // !!! Überladen der Methode setGarantie
        netzteil.setKaufpreis(455.99);
        netzteil.setInventarnummer(56);
        netzteil.setSpannungsart("Wechselspannung");
        netzteil.setHatElektroniksicherheitsprüfung(true);
        netzteil.setLeistung(45);
        netzteil.setWirkungsgrad(97);
        //System.out.println(netzteil.toString());

        //////////////////////////////netzwerkgeraet.router////////////////////////////////////////////////////
        router.setRaum("U01");
        router.setSeriennummer("2349603FQL");
        router.setKaufdatum("16.05.2023");
        router.setModell("EliteBook 840");
        router.setHersteller("HP");
        router.setDefekt(false);
        router.setGarantie(45);
        router.setKaufpreis(455.99);
        router.setInventarnummer(56);
        router.setTyp("Router");
        router.setKapatzität(345);
        router.setLaufzeit(45);
        System.out.println(router.toString());

        ///////////////////// Konstruktor für Klasse Raum testen mit ArrayList////////////////////////////////////
        Raum u3 = new Raum();
        u3.setId(003);
        u3.setBezeichnung("ITG10a_FH");
        u3.setGebaeude("Container");
        u3.setBreiteInCm(200);
        u3.setLaengeInCm(800);
        u3.getGeraeteliste().add(router);
        u3.getGeraeteliste().add(netzteil);
        System.out.println(u3.toString());

        ////////////////Konstruktor für Klasse Gerät testen mit ArrayList//////////////////////////////
        Gebaeude container = new Gebaeude();
        container.setBeschreibung("Ein Containergebäude");
        container.setBezeichnung("con");
        container.setGebaeudenummer(01);
        container.setStockwerke(2);
        container.getRaumListe().add(u3);
        System.out.println(container.toString());
    }
}
