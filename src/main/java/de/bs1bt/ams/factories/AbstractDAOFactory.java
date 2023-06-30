package de.bs1bt.ams.factories;

import de.bs1bt.ams.gateways.InterfaceGeraeteDAO;
import de.bs1bt.ams.gateways.InterfaceRaumDAO;

/* ORM: Objekt-relationales Mapping
 * DAO: Data Access Objekt- Pattern
 * Fabric
 * Table Data Gateway - Pattern
 */
public abstract class AbstractDAOFactory {
    public abstract InterfaceRaumDAO createRaumDAO();
    public abstract InterfaceGeraeteDAO createGeraeteDAO();
}
