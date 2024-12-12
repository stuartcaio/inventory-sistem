import java.util.Scanner;

import Controller.EstablishmentController;
import Config.DBConnection;
import Model.Establishment;
import Model.Product;
import Traits.Functions;

public class App {
    public static void main(String[] args) throws Exception {
        DBConnection connection = new DBConnection("inventory-system", "root", "123");

        connection.connect();

        // EstablishmentController establishmentController = new EstablishmentController();

        // establishmentController.createEstablishment();

        // Establishment currentEstablishment = establishmentController.getEstablishment();

        // establishmentController.addProduct();
    }
}
