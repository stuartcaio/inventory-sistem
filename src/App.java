import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

import main.Config.DBConnection;
import main.Config.ServerConnection;

public class App {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("dbconfig.properties");
        DBConnection connection = new DBConnection(reader);
        connection.connect();

        ServerConnection serverConnection = new ServerConnection();
        serverConnection.connect();
    }
}
