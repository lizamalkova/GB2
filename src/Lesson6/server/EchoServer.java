package Lesson6.server;


import Lesson6.client.EchoClient;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.w3c.dom.ls.LSOutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EchoServer {

    public static final int SERVER_PORT = 8189;

   public static void client(DataInputStream in) {
       new Thread(new Runnable() {
           @Override
           public void run() {
               while (true) {
                   String message = null;
                   try {
                       message = in.readUTF();
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
                   System.out.println("Cообщение пользователя: " + message);
               }
           }
       }).start();

   }

    public static void server(DataOutputStream out)  {
       new Thread(new Runnable() {
           @Override
           public void run() {
               while (true) {
                   Scanner scanner = new Scanner(System.in);
                   String serverMessage = scanner.nextLine();
                   try {
                       out.writeUTF("Ответ от сервера: " + serverMessage);
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               }
           }
       }).start();

    }

        public static void main(String[] args) {

       EchoServer e1 = new EchoServer();
        try(ServerSocket serverSocket = new ServerSocket(SERVER_PORT)) {
            System.out.println("Ожидаем подключение...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Соединение установлено!");

            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
            DataInputStream in = new DataInputStream(clientSocket.getInputStream());

                client(in);
                server(out);

        }
        catch (IOException e) {
            System.out.println("Порт уже занят");
            e.printStackTrace();
        }
    }
}
