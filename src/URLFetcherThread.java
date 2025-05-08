
import java.net.MalformedURLException;
import java.net.URL;


public class URLFetcherThread implements Runnable {
    private final String urlLink;


    public URLFetcherThread(String urlLink) {
        this.urlLink = urlLink;
    }

    @Override
    public void run() {
        try {
            URL url = new URL(urlLink);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


    }
}
