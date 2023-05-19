package ru.itmo.lessons.lesson25;
import ru.itmo.lessons.lesson25.common.Message;
import ru.itmo.lessons.lesson25.common.ReadWrite;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;


public class ClientApp {

    private InetSocketAddress remote;
    public ClientApp(InetSocketAddress remote){
        this.remote = remote;
    }
    
    public void run (){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Введите текст или '/exit' для выхода");
            String input = scanner.nextLine();
            if("/exit".equalsIgnoreCase(input)) return; //Если после цикла while нет ничего полезного то сразу прервать метод run
            try(Socket socket = new Socket (remote.getHostString(), remote.getPort());
                ReadWrite readWrite = new ReadWrite(socket);){

                Message message = new Message(input);
                readWrite.writeMessage(message);
                Message fromServer = readWrite.readMessage();

                System.out.println(fromServer.);
            } catch(UnknownHostException e){
                System.out.println("Ошибка адреса или порта");
            }
            catch (IOException e){
                System.out.println("Сервер не отвечает");

            }
        }
    }
    public static void main(String[] args) {
        String ip = "127.0.0.1";
        int port = 2222;
        InetSocketAddress remote = new InetSocketAddress(ip, port);
        InetSocketAddress local = new InetSocketAddress(ip, 1111);

        Socket socket = new Socket();
        // Socket socket = new Socket(ip, port); // соединение с удаленным сервером
        OutputStream output = null;
        InputStream input = null;
        try {
            socket.bind(local);
            System.out.println(socket.isBound());

            socket.connect(remote /*, 10000 */); // соединение с удаленным сервером
            System.out.println(socket.isConnected());

            System.out.println(socket.getReceiveBufferSize());
            System.out.println(socket.getSendBufferSize());
            System.out.println(socket.getLocalSocketAddress());
            System.out.println(socket.getRemoteSocketAddress());

            output = socket.getOutputStream();
            input = socket.getInputStream();

            output.write(11);
            System.out.println(input.read());
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (input != null) input.close();
                if (output != null) output.close();
                socket.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
