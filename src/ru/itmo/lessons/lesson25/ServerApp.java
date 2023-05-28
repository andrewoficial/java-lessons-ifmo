package ru.itmo.lessons.lesson25;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        OutputStream output = null;
        InputStream input = null;
            try {
                serverSocket = new ServerSocket(2222);
                logMsgS("Сервер запущен");

                Socket socket = serverSocket.accept();
                logMsgS(" Новое подключение");

                logMsgS(" LocalAddress:" + socket.getLocalAddress());
                logMsgS(" RemoteSocketAddress:" + socket.getRemoteSocketAddress());

                output = socket.getOutputStream();
                input = socket.getInputStream();

                // ObjectInputStream objectInput = new ObjectInputStream(input); //Десерриализация
                // ObjectOutputStream objectOutput = new ObjectOutputStream(); //Серриализация.
                //while(true) {
                    logMsgS(" Получено:" + input.read());
                    logMsgS(" Записываю:" + 2);
                    output.write(2);

                //}
            } catch (IOException e) {
                logMsgS("Произошло исключение");
                e.printStackTrace();
            } finally {
                logMsgS("Закрываю ресурсы");
                try {
                    if (input != null) input.close();
                    logMsgS("   Закрываю input");
                    if (output != null) output.close();
                    logMsgS("   Закрываю output");
                    if (serverSocket != null) serverSocket.close();
                    logMsgS("   Закрываю serverSocket");
                } catch (IOException e) {
                    logMsgS("   Произошло исключение при закрытии ресурсов");
                    e.printStackTrace();
                }
            }
        }


    private static void logMsgS(String msg){
        System.out.println("SRV:" + msg);
    }
}
