import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

import main.Config.DBConnection;

public class App {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("dbconfig.properties");
        Properties properties = new Properties();
        properties.load(reader);

        DBConnection connection = new DBConnection(properties.getProperty("db_name"), properties.getProperty("username"), properties.getProperty("password"));

        connection.connect();

        // EstablishmentController establishmentController = new EstablishmentController();

        // establishmentController.createEstablishment();

        // Establishment currentEstablishment = establishmentController.getEstablishment();

        // establishmentController.addProduct();
    }
}
