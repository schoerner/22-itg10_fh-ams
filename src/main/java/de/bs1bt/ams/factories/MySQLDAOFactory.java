package de.bs1bt.ams.factories;

import de.bs1bt.ams.gateways.InterfaceGeraeteDAO;
import de.bs1bt.ams.gateways.InterfaceRaumDAO;
import de.bs1bt.ams.gateways.RaumMySQLDataGateway;

public class MySQLDAOFactory extends AbstractDAOFactory {

    @Override
    public InterfaceRaumDAO createRaumDAO() {
        System.out.println("return new RaumMySQLDataGateway();");
        return new RaumMySQLDataGateway();
    }

    @Override
    public InterfaceGeraeteDAO createGeraeteDAO() {
        System.out.println("return new GeraeteMySQLDataGateway();");
        return null;
    }
}
