package main.Config;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerConnection {
    private int port;

    public ServerConnection(){
        this.port = 8080;
    };
    
    public void connect(){
        try(ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("O servidor está rodando na porta " + port);
    
            while(true){
                Socket clientSocket = serverSocket.accept();
                System.out.println("Cliente conectado: " + clientSocket.getInetAddress());
    
                clientSocket.close();
            }
        } catch (IOException e){
            System.out.println("Ocorreu um erro: " + e.getMessage());
        };
    }

}
