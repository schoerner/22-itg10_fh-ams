package de.bs1bt.ams.db;

import de.bs1bt.ams.gateways.MySQLConnection;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class MySQLConnectionTest {

    @Test
    void getConnection() {
        try {
            Connection conn = MySQLConnection.getConnection();
            assertNotEquals(null, conn);
        } catch (SQLException e) {
            fail("Die Verbindung zu MySQL konnte nicht aufgebaut werden:" + e.getMessage());
        }
    }
}