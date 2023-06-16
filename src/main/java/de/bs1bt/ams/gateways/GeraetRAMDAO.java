package de.bs1bt.ams.gateways;

import de.bs1bt.ams.model.Geraet;

import java.util.ArrayList;
import java.util.Optional;

public class GeraetRAMDAO implements InterfaceGeraeteDAO {

    private ArrayList<Geraet> geraeteListe = new ArrayList<>();
    private int inventarnummer = 0;

    public Geraet hole(int inventarnummer) throws DataGatewayException{
        try {
            Optional<Geraet> geraetOptional = geraeteListe.stream().filter(r -> r.getInventarnummer() == inventarnummer).findFirst();
            if (geraetOptional.isPresent()) {
                Geraet geraet = geraetOptional.get();
                return  geraet;
            } else {
                throw new DataGatewayException("Index nicht gefunden");
            }
        } catch (IndexOutOfBoundsException e) {
            throw new DataGatewayException(e.getMessage());
        }
    }

    public ArrayList<Geraet> holeAlle() throws DataGatewayException {
        return geraeteListe;
    }

    public int erstelle(Geraet geraetModel) throws DataGatewayException{
        inventarnummer++;
        geraetModel.setInventarnummer(inventarnummer);
        geraeteListe.add(geraetModel);
        return inventarnummer;
    }

    public void aktualisiere(Geraet geraetModel) throws DataGatewayException {
        geraeteListe.set(geraeteListe.indexOf(geraetModel), geraetModel);
    }

    public void loesche(int inventarnummer) throws DataGatewayException {
        try {
            Optional<Geraet> geraetOptional = geraeteListe.stream().filter(g -> g.getInventarnummer() == inventarnummer).findFirst();
            if (geraetOptional.isPresent()) {
                Geraet geraet = geraetOptional.get();
                geraeteListe.remove(geraet);
            } else {
                throw new DataGatewayException("Index nicht gefunden");
            }
        } catch (IndexOutOfBoundsException e) {
            throw new DataGatewayException(e.getMessage());
        }
    }


    public void loesche(Geraet geraetModel) throws DataGatewayException {
        loesche(geraetModel.getInventarnummer());
    }
}
