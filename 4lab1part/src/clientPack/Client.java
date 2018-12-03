package clientPack;


import java.io.*;
import java.net.Socket;
import java.nio.channels.spi.SelectorProvider;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static final int PORT = 1502;
    public static final String LOCALHOST = "localhost";


    public static void main(String[] args) {
        Socket socket = null;
        ObjectInputStream objectInputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            System.out.println("server connecting");
            socket = new Socket(LOCALHOST, PORT);

            System.out.println("connection established");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectInputStream = new ObjectInputStream(socket.getInputStream());


            System.out.println("Enter salary for a worker :");

            String clientMessage = bufferedReader.readLine();

            System.out.println("Salary is : " + clientMessage);

            while (!clientMessage.equals("exit")) {

                objectOutputStream.writeObject(clientMessage);//потоку вывода присваивается //значение строковой переменной (передается серверу)

                System.out.println("Tax is: " + objectInputStream.readObject());//выводится на //экран со-держимое потока ввода (переданное сервером)

                System.out.println("---------------------------");

                clientMessage = bufferedReader.readLine();//ввод текста с клавиатуры

                System.out.println("Salary is : " + clientMessage);
            }

        } catch (Exception e) {

        } finally {
            try {
                objectInputStream.close();
                objectOutputStream.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}


