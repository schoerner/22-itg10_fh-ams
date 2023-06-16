package de.bs1bt.ams.gateways;

import de.bs1bt.ams.model.Geraet;

import java.util.ArrayList;

public interface InterfaceGeraeteDAO {

    public Geraet hole(int inventarnummer) throws DataGatewayException;

    public ArrayList<Geraet> holeAlle() throws DataGatewayException ;

    public int erstelle(Geraet geraetModel) throws DataGatewayException;

    public void aktualisiere(Geraet geraetModel) throws DataGatewayException ;

    public void loesche(int inventarnummer) throws DataGatewayException ;

    public void loesche(Geraet geraetModel) throws DataGatewayException ;
}
