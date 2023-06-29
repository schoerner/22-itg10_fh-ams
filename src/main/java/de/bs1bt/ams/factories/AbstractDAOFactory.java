package de.bs1bt.ams.factories;

import de.bs1bt.ams.gateways.InterfaceGeraeteDAO;
import de.bs1bt.ams.gateways.InterfaceRaumDAO;

public abstract class AbstractDAOFactory {
    public abstract InterfaceRaumDAO createRaumDAO();
    public abstract InterfaceGeraeteDAO createGeraeteDAO();
}
