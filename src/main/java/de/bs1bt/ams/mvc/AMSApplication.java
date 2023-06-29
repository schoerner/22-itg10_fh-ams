package de.bs1bt.ams.mvc;

import de.bs1bt.ams.factories.AbstractDAOFactory;
import de.bs1bt.ams.factories.MySQLDAOFactory;
import de.bs1bt.ams.factories.RAMDAOFactory;
import de.bs1bt.ams.gateways.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AMSApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AMSApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 480);
        stage.setTitle("BS1 BT - Asset Management System");
        stage.setScene(scene);

        AbstractDAOFactory daoFactory;
        // AA 3: Fabrikmethode für Erzeugung der AbstractFactory
        String type = "MySQL";
        if(type == "RAM") {
            // AA 2: Implementierung der Abstrakten Fabrik
            daoFactory = new RAMDAOFactory();
        } else {
            daoFactory = new MySQLDAOFactory();
        }
        /* ORM: Objekt-relationales Mapping
         * DAO: Data Access Objekt- Pattern
         * Fabric
         * Table Data Gateway - Pattern
         */
        InterfaceGeraeteDAO geraeteDAO = daoFactory.createGeraeteDAO();
        InterfaceRaumDAO raumDAO = daoFactory.createRaumDAO();

        MainController mc = fxmlLoader.getController();
        mc.setRaumDao(raumDAO);
        mc.setGeraeteDAO(geraeteDAO);

        // Aufgabe
        // 1) Alle new für RaumMySQLDataGateway in
        //    MainController entfernen
        // 2) RaumRAMDataGateway implementieren
        // 3) Testen ;-)
        //mc.setDao(new RaumMySQLDataGateway());

        // TODO Einstieg in Abstrakte Klassen, Entwurfsmuster und Abstrakte Fabriken
/*
        mc.setMitarbeiterDAO(new MitarbeiterRAMDAO());
        mc.setGebaeudeDao(new RaumRAMDataGateway());
        mc.setKundenDAO(new MitarbeiterRAMDAO());
        mc.setNetzwerkGeraeteDAO(new GeraetRAMDAO());
*/
        mc.zeigeRaeumeInTabelle();
        mc.zeigeGesamtflaeche();

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}