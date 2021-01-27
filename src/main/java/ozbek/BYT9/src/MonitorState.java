package ozbek.BYT9.src;

import java.io.Serializable;
import java.util.HashMap;

/**
 * created by ozbek
 */
public class MonitorState implements Serializable {
    private HashMap<String, URLInfo> urlInfoMap;

    public MonitorState() {
        urlInfoMap = new HashMap<>();
    }

    public void setUrlInfo(String url, URLInfo urlInfo) {
        urlInfoMap.put(url, urlInfo);
    }

    public URLInfo getUrlInfo(String url) {
        return urlInfoMap.get(url);
    }

    public HashMap<String, URLInfo> getUrlInfoMap() {
        return urlInfoMap;
    }
}