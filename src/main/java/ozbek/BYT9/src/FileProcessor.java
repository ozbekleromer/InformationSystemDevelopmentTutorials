package ozbek.BYT9.src;

import java.io.*;
/**
 * created by ozbek
 */

public class FileProcessor {
    String file = "/home/ozbek/Desktop/Java/InformationSystemDevelopment/src/main/java/ozbek/BYT9/src/log.txt";

    public void writeToFile(MonitorState state) {
        try {
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(state);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public MonitorState readFromFile() {
        MonitorState state = null;
        try {
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            state = (MonitorState) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
        return state;
    }
}
