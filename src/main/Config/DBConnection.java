package main.Config;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {
    FileReader fileReader;

    public DBConnection(FileReader fileReader){
        this.fileReader = fileReader;
    };

    public Connection connect(){
        Connection conn = null;

        try{
            Properties properties = new Properties();
            properties.load(this.fileReader);

            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + properties.getProperty("db_name"), properties.getProperty("username"), properties.getProperty("password"));

            if(conn != null){
                System.out.println("Conexão realizada com sucesso!");
            } else{
                System.out.println("Não foi possível estabelecer conexão com o banco de dados.");
            };
        } catch(Exception error){
            System.out.println(error);
        };

        return conn;
    }
}
