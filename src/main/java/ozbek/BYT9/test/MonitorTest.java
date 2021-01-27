package ozbek.BYT9.test;

/**
 * created by ozbek
 */
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import ozbek.BYT9.src.*;
import java.net.URLConnection;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MonitorTest {
    private Date date1;
    private Date date2;
    private Date date3;
    private Date date4;

    @Before
    public void setUp() {
        date1 = new GregorianCalendar(2020, Calendar.DECEMBER, 15).getTime();
        date2 = new GregorianCalendar(2020, Calendar.DECEMBER, 13).getTime();
        date3 = new GregorianCalendar(2020, Calendar.DECEMBER, 17).getTime();
        date4 = new GregorianCalendar(2020, Calendar.DECEMBER, 20).getTime();
    }

    @Test
    public void addObserverTest() {
        URLConnection connection = Mockito.mock(URLConnection.class);

        URLInfo urlInfo = new URLInfo(connection);
        URLObserver observer = new URLObserver("observer");

        urlInfo.addObserver(observer);

        assertEquals(1, urlInfo.getUrlObservers().size());
    }

    @Test
    public void lastModifiedTest() {
        URLConnection connection = Mockito.mock(URLConnection.class);
        URLInfo urlInfo = new URLInfo(connection, date1);

        when(connection.getLastModified()).thenReturn(date1.getTime());

        assertEquals(date1, urlInfo.fetchLastModified());
        assertEquals(date1, urlInfo.getLastModified());
    }

    @Test
    public void processFileTest() {
        URLConnection connection = Mockito.mock(URLConnection.class);

        URLInfo urlInfo = new URLInfo(connection, date1);
        URLObserver observer = new URLObserver("observer");
        MonitorState state = new MonitorState();
        FileProcessor processor = new FileProcessor();

        urlInfo.addObserver(observer);
        state.setUrlInfo("test", urlInfo);
        processor.writeToFile(state);

        MonitorState readState = processor.readFromFile();

        assertEquals(date1, readState.getUrlInfo("test").getLastModified());
        assertNull(readState.getUrlInfo("test").getConnection());
        assertEquals(1, readState.getUrlInfo("test").getUrlObservers().size());
    }

    @Test
    public void createConnectionFromFactoryTest() {
        ConnectionFactory connectionFactory = Mockito.mock(ConnectionFactory.class);
        URLConnection connection = Mockito.mock(URLConnection.class);

        when(connection.getLastModified()).thenReturn(date2.getTime());
        when(connectionFactory.createConnection("test")).thenReturn(connection);

        assertEquals(date2.getTime(), connectionFactory.createConnection("test").getLastModified());
    }

    @Test
    public void runOnceTest() {
        ConnectionFactory connectionFactory = Mockito.mock(ConnectionFactory.class);
        URLConnection connection = Mockito.mock(URLConnection.class);

        URLMonitor monitor = new URLMonitor(connectionFactory, 100);
        URLObserver observer = new URLObserver("observer");

        when(connectionFactory.createConnection("test")).thenReturn(connection);
        when(connection.getLastModified()).thenReturn(date2.getTime());

        monitor.registerObserver("test", observer);
        monitor.runOnce();

        // Desired output in console:
        // UrlObserver name: observer URL: test Last modification: Sun Dec 13 00:00:00 CET 2020
    }

    @Test
    public void runTest() throws Exception {
        ConnectionFactory connectionFactory = Mockito.mock(ConnectionFactory.class);
        URLConnection connection1 = Mockito.mock(URLConnection.class);
        URLConnection connection2 = Mockito.mock(URLConnection.class);

        URLMonitor urlMonitor = new URLMonitor(connectionFactory, 100);
        URLObserver urlObserver1 = new URLObserver("urlObserver 1");
        URLObserver urlObserver2 = new URLObserver("urlObserver 2");

        when(connectionFactory.createConnection("test 1")).thenReturn(connection1);
        when(connectionFactory.createConnection("test 2")).thenReturn(connection2);

        when(connectionFactory.createConnection("test 1")).thenReturn(connection1);
        when(connection1.getLastModified()).thenReturn(date2.getTime());

        urlMonitor.registerObserver("test 1", urlObserver1);
        urlMonitor.registerObserver("test 2", urlObserver2);

        when(connectionFactory.createConnection("test 2")).thenReturn(connection2);
        when(connection2.getLastModified()).thenReturn(date1.getTime());

        Thread thread = new Thread(urlMonitor);
        thread.start();
        Thread.sleep(300);

        when(connection1.getLastModified()).thenReturn(date3.getTime());
        when(connection2.getLastModified()).thenReturn(date4.getTime());
        Thread.sleep(600);

        //  Desired output in console:
        //  UrlObserver name: urlObserver 2 URL: test 2 Last modification: Tue Dec 15 00:00:00 CET 2020
        //  UrlObserver name: urlObserver 1 URL: test 1 Last modification: Sun Dec 13 00:00:00 CET 2020
        //  UrlObserver name: urlObserver 2 URL: test 2 Last modification: Sun Dec 20 00:00:00 CET 2020
        //  UrlObserver name: urlObserver 1 URL: test 1 Last modification: Thu Dec 17 00:00:00 CET 2020
    }

    @Test
    public void runFromFileStateTest() throws Exception {
        // Save to file
        URLConnection connection = Mockito.mock(URLConnection.class);
        ConnectionFactory connectionFactory = new ConnectionFactory(connection);
        URLMonitor urlMonitor = new URLMonitor(connectionFactory, 100);
        URLObserver urlObserver = new URLObserver("urlObserver 1");

        urlMonitor.registerObserver("test", urlObserver);
        urlMonitor.saveState();

        // Restore from file
        ConnectionFactory connectionFactory1 = Mockito.mock(ConnectionFactory.class);
        URLConnection connection1 = Mockito.mock(URLConnection.class);
        URLMonitor urlMonitor1 = new URLMonitor(connectionFactory1, 100);

        when(connectionFactory1.createConnection("test")).thenReturn(connection1);

        urlMonitor1.restoreState();

        when(connection1.getLastModified()).thenReturn(date2.getTime());
        Thread thread = new Thread(urlMonitor1);
        thread.start();
        Thread.sleep(300);

        when(connection1.getLastModified()).thenReturn(date1.getTime());
        Thread.sleep(600);

        // Desired output in console:
        // UrlObserver name: urlObserver 1 URL: test Last modification: Sun Dec 13 00:00:00 CET 2020
        // UrlObserver name: urlObserver 1 URL: test Last modification: Tue Dec 15 00:00:00 CET 2020
    }
}