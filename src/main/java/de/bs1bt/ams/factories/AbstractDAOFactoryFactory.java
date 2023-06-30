package de.bs1bt.ams.factories;

public class AbstractDAOFactoryFactory {
    public enum Types {
        MYSQL,
        RAM
    }

    public static AbstractDAOFactory create(Types types) {
        if(types==Types.MYSQL) {
            return new MySQLDAOFactory();
        } else {
            return new RAMDAOFactory();
        }
    }
}
