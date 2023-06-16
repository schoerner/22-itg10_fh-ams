package de.bs1bt.ams.gateways;

import de.bs1bt.ams.model.Raum;

import java.util.ArrayList;
import java.util.Optional;

public class RaumRAMDataGateway implements InterfaceRaumDAO {
    // ArrayList, die Räume im RAM hält
    private ArrayList<Raum> RaumListe = new ArrayList();

    // ID wird benötigt um die ID wie bei AUTO_INCREMENT in der Datenbank hochzuzählen
    private int id = 0;

    public Raum hole(int id) throws DataGatewayException {
        try {
            // Suche Raum mit der angegebenen ID und schreibe ihn in raum0
            Optional<Raum> raumO = RaumListe.stream().filter(r -> r.getId() == id).findFirst();
            if (raumO.isPresent()) {
                Raum raum = raumO.get();
                return raum;
            } else {
                throw new DataGatewayException("Index nicht gefunden");
            }
        } catch (IndexOutOfBoundsException e) {
            throw new DataGatewayException(e.getMessage());
        }
    }

    public ArrayList<Raum> holeAlle() {
        return RaumListe;
    }

    public int erstelle(Raum raumModel) {
        id++;
        raumModel.setId(id);
        RaumListe.add(raumModel);
        return id;
    }

    public void aktualisiere(Raum raumModel) throws DataGatewayException {
        RaumListe.set(RaumListe.indexOf(raumModel), raumModel);
    }

    public void loesche(int id) throws DataGatewayException {
        try {
            Optional<Raum> raumO = RaumListe.stream().filter(r -> r.getId() == id).findFirst();
            if (raumO.isPresent()) {
                Raum raum = raumO.get();
                RaumListe.remove(raum);
            } else {
                throw new DataGatewayException("Index nicht gefunden");
            }
        } catch (IndexOutOfBoundsException e) {
            throw new DataGatewayException(e.getMessage());
        }
    }

    public void loesche(Raum raumModel) throws DataGatewayException {
        loesche(raumModel.getId());
    }
}
