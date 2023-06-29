package de.bs1bt.ams.factories;

import de.bs1bt.ams.gateways.GeraetRAMDAO;
import de.bs1bt.ams.gateways.InterfaceGeraeteDAO;
import de.bs1bt.ams.gateways.InterfaceRaumDAO;
import de.bs1bt.ams.gateways.RaumRAMDataGateway;

public class RAMDAOFactory extends AbstractDAOFactory {
    @Override
    public InterfaceRaumDAO createRaumDAO() {
        System.out.println("return new RaumRAMDataGateway();");
        return new RaumRAMDataGateway();
    }

    @Override
    public InterfaceGeraeteDAO createGeraeteDAO() {
        System.out.println("return new GeraetRAMDAO();");
        return new GeraetRAMDAO();
    }
}
