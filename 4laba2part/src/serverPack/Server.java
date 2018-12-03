package serverPack;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Server {
    private static final int PORT = 1502;
    private static final int LOW_PERCENT = 5;
    private static final int MID_PERCENT = 10;
    private static final int HIGH_PERCENT = 15;

    private static final double NULL_SALARY = 0.;
    private static final double LOW_SALARY = 100_000.;
    private static final double HIGH_SALARY = 500_000.;


    private static final String EXIT = "exit";
    private static final String ERROR = "Not right salary!";
    private static final String EXIT_REGEXP = "^[Ee][Xx][Ii][Tt]$";
    private static final String IS_DOUBLE_REGEXP = "^[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?$";

    private static final String DIRECTORY = "F:/studies/ПрогСП/programs(java)/4lab/MyLog.log";
    //  private static final String IS_INT_REGEXP = "^[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?$";



    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        Socket client = null;
        ObjectInputStream objectInputStream = null;
        ObjectOutputStream objectOutputStream = null;
        Logger logger = Logger.getLogger(Server.class.getName());
        FileHandler fh = null;
        try {

            fh = new FileHandler("MyFileLog.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            // the following statement is used to log any messages
            logger.info("starting server...");

            serverSocket = new ServerSocket(PORT);

            client = serverSocket.accept();

            logger.info("connection established");


            objectInputStream = new ObjectInputStream(client.getInputStream());

            objectOutputStream = new ObjectOutputStream(client.getOutputStream());

            String receivedMessage = (String) objectInputStream.readObject();


            while (!receivedMessage.equals("exit")) {

                logger.info("Message received");

                receivedMessage = Server.calculateTax(receivedMessage);

                objectOutputStream.writeObject(receivedMessage);

                receivedMessage = (String) objectInputStream.readObject();

            }

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
                objectOutputStream.close();
                client.close();
                serverSocket.close();

            } catch (Exception e) {

            }
        }
    }

    private static boolean isDouble(String salary) {
        return salary.matches(IS_DOUBLE_REGEXP);
    }


    private static boolean isExit(String salary) {
        return salary.matches(EXIT_REGEXP);
    }

    private static int checkPercent(double salary) {

        if (salary <= LOW_SALARY && salary > NULL_SALARY)
            return LOW_PERCENT;
        if (salary > LOW_SALARY && salary <= HIGH_SALARY)
            return MID_PERCENT;
        else
            return HIGH_PERCENT;

    }

    private static String calculateTax(String salary) {
        double realSalary;
        int percent;
        if (isDouble(salary)) {
            realSalary = Double.parseDouble(salary);
            percent = checkPercent(realSalary);
            return checkTax(realSalary, percent);
        }
        if (isExit(salary)) {
            return EXIT;
        }
        return ERROR;
    }

    private static String checkTax(double salary, int percentOfTax) {

        salary = salary / 100 * percentOfTax;
        return String.valueOf(salary);

    }
}
