package de.bs1bt.ams.gateways;

import de.bs1bt.ams.model.Mitarbeiter;

import java.util.ArrayList;
import java.util.Optional;

public class MitarbeiterRAMDAO implements InterfaceMitarbeiterDAO {

    private ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<>();
    private int id = 0;

    public Mitarbeiter hole(int Personalnummer) throws DataGatewayException {
        try {
            Optional<Mitarbeiter> mitarbeiterO = mitarbeiterListe.stream().filter(m -> m.getPersonalnummer() == Personalnummer).findFirst();
            if (mitarbeiterO.isPresent()) {
                Mitarbeiter mitarbeiter = mitarbeiterO.get();
                return  mitarbeiter;
            } else {
                throw new DataGatewayException("Index nicht gefunden");
            }
        } catch (IndexOutOfBoundsException e) {
            throw new DataGatewayException(e.getMessage());
        }

    }

    public ArrayList<Mitarbeiter> holeAlle() throws DataGatewayException {
        return mitarbeiterListe;
    }

    public int erstelle(Mitarbeiter mitarbeiterModel) throws DataGatewayException{
        id++;
        mitarbeiterModel.setPersonalnummer(id);
        mitarbeiterListe.add(mitarbeiterModel);
        return id;

    }

    public void aktualisiere(Mitarbeiter mitarbeiterModel) throws DataGatewayException {
        mitarbeiterListe.set(mitarbeiterListe.indexOf(mitarbeiterModel), mitarbeiterModel);
    }



    public void loesche(Mitarbeiter mitarbeiterModel) throws DataGatewayException {
        loesche(mitarbeiterModel.getPersonalnummer());
    }

    public void loesche(int Personalnummer) throws DataGatewayException {
        try {
            Optional<Mitarbeiter> mitarbeiterO = mitarbeiterListe.stream().filter(m -> m.getPersonalnummer() == Personalnummer).findFirst();
            if (mitarbeiterO.isPresent()) {
                Mitarbeiter mitarbeiter = mitarbeiterO.get();
                mitarbeiterListe.remove(mitarbeiter);
            } else {
                throw new DataGatewayException("Index nicht gefunden");
            }
        } catch (IndexOutOfBoundsException e) {
            throw new DataGatewayException(e.getMessage());
        }
    }

}
