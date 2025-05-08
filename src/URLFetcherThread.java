
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
            BufferedReader reading = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = reading.readLine()) != null) {
                System.out.println("Thread [" + Thread.currentThread().getName() + "]: Line from "+ urlLink +" : " + line);
            }

        } catch (MalformedURLException e) {
            System.out.println("Thread [" + Thread.currentThread().getName() + "]: invalid URL - " + urlLink);
        } catch (IOException e) {
            System.out.println("Error in reading from URL - " + urlLink);
        }


    }
}
