package de.bs1bt.ams.gateways;

import de.bs1bt.ams.model.Mitarbeiter;

import java.util.ArrayList;

public interface InterfaceMitarbeiterDAO {

    public Mitarbeiter hole(int Personalnummer) throws DataGatewayException;

    public ArrayList<Mitarbeiter> holeAlle() throws DataGatewayException ;

    public int erstelle(Mitarbeiter mitarbeiterModel) throws DataGatewayException;

    public void aktualisiere(Mitarbeiter mitarbeiterModel) throws DataGatewayException ;

    public void loesche(int Personalnummer) throws DataGatewayException ;

    public void loesche(Mitarbeiter mitarbeiterModel) throws DataGatewayException ;
}
