package de.bs1bt.ams.gateways;

import de.bs1bt.ams.model.Raum;

import java.util.ArrayList;

public interface InterfaceRaumDAO {
    public Raum hole(int id) throws DataGatewayException;
    public ArrayList<Raum> holeAlle() throws DataGatewayException;
    public int erstelle(Raum raumModel) throws DataGatewayException;
    public void aktualisiere(Raum raumModel) throws DataGatewayException;
    public void loesche(int id) throws DataGatewayException;
    public void loesche(Raum raumModel) throws DataGatewayException;
}
