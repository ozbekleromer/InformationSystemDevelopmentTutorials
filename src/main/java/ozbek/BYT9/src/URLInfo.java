package ozbek.BYT9.src;

import java.io.Serializable;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * created by ozbek
 */
public class URLInfo implements Serializable {
    private transient URLConnection connection;
    private Date lastModified;
    private List<URLObserver> urlObservers = new ArrayList<>();

    public URLInfo(URLConnection connection) {
        this(connection, new Date(0));
    }

    public URLInfo(URLConnection connection, Date lastDateModified) {
        this.connection = connection;
        this.lastModified = lastDateModified;
    }


    public void addObserver(URLObserver urlObserver) {
        urlObservers.add(urlObserver);
    }

    public void setLastModified(Date lastDateModified) {
        this.lastModified = lastDateModified;
    }

    public List<URLObserver> getUrlObservers() {
        return urlObservers;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public Date fetchLastModified() {
        return new Date(connection.getLastModified());
    }

    public URLConnection getConnection() {
        return connection;
    }

    public void setConnection(URLConnection connection) {
        this.connection = connection;
    }
}

