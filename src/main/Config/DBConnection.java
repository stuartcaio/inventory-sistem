package main.Config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private String DBName, user, password;

    public DBConnection(String DBName, String user, String password){
        this.DBName = DBName;
        this.user = user;
        this.password = password;
    };

    public Connection connect(){
        Connection conn = null;

        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + this.DBName, this.user, this.password);

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
