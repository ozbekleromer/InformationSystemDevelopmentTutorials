package ozbek.BYT9.src;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
/**
 * created by ozbek
 */

public class ConnectionFactory {
    URLConnection connection;

    public ConnectionFactory(URLConnection connection) {
        this.connection = connection;
    }

    public URLConnection createConnection(String urlString) {
        URLConnection connection = null;
        try {
            URL url = new URL(urlString);
            connection = url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public URLConnection createConnection() {
        try {
            URL url = new URL(urlString);
            connection = url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this.connection;
    }

    public URLConnection getConnection() {
        return connection;
    }

    public void setConnection(URLConnection connection) {
        this.connection = connection;
    }
}