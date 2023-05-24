package ru.itmo.lessons.lesson25;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        OutputStream output = null;
        InputStream input = null;

        try{
            serverSocket = new ServerSocket(2222);
            System.out.println("Сервер запущен");

            Socket socket = serverSocket.accept();
            System.out.println("Новое подключение");

            System.out.println(socket.getLocalAddress());
            System.out.println(socket.getRemoteSocketAddress());

            output = socket.getOutputStream();
            input = socket.getInputStream();

            // ObjectInputStream objectInput = new ObjectInputStream(input); //Десерриализация

            // ObjectOutputStream objectOutput = new ObjectOutputStream(); //Серриализация

            System.out.println(input.read());
            output.write(2);



        }catch(IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (input != null) input.close();
                if (output != null) output.close();
                if (serverSocket != null) serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}