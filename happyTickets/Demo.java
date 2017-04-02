package happyTickets.kuznetsov.ru;

import java.io.FileNotFoundException;

public class Demo {
    private static String fileNameRead = "input.txt";
    private static String fileNameWrite = "output.txt";

    public static void main(String args[]) throws FileNotFoundException{
        String strFromFile = WorkWithFile.read(fileNameRead);
        WorkWithFile.write(fileNameWrite, HappyTickets.happyTicket(strFromFile));
    }
}
