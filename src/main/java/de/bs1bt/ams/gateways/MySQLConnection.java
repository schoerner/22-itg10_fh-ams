package de.bs1bt.ams.gateways;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

    private MySQLConnection() {}
    private static String connectionUrl = "jdbc:mysql://localhost:3306/ams_fx_test";
    private static String dbUser = "schueler";
    private static String dbPwd = "Geheim01";

    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
        return conn;
    }
}
