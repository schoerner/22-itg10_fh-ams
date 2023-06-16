package de.bs1bt.ams.mvc;

import de.bs1bt.ams.gateways.GeraetRAMDAO;
import de.bs1bt.ams.gateways.MitarbeiterRAMDAO;
import de.bs1bt.ams.gateways.RaumRAMDataGateway;
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

        MainController mc = fxmlLoader.getController();
        // Aufgabe
        // 1) Alle new für RaumMySQLDataGateway in
        //    MainController entfernen
        // 2) RaumRAMDataGateway implementieren
        // 3) Testen ;-)
        //mc.setDao(new RaumMySQLDataGateway());

        mc.setRaumDao(new RaumRAMDataGateway());
        mc.setMitarbeiterDAO(new MitarbeiterRAMDAO());
        mc.setGeraeteDAO(new GeraetRAMDAO());

        mc.zeigeRaeumeInTabelle();
        mc.zeigeGesamtflaeche();

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}