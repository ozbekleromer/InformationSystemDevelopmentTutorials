package ozbek.BYT9.src;

import java.io.Serializable;

/**
 * created by ozbek
 */
public class URLObserver implements Serializable {
    private String name;

    public URLObserver(String name) {
        this.name = name;
    }

    public void update(String url, String date) {
        System.out.println("UrlObserver name: " + name + " URL: " + url + " Last modification: " + date);
    }
}