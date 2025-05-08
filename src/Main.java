import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {
        URLFetcherThread threadFirst = new URLFetcherThread("https://www.lipsum.com/");
        URLFetcherThread threadSecond = new URLFetcherThread("https://www.igihe.com/");
        Thread thread1 = new Thread(threadFirst , "URLFetcherThread1");
        Thread thread2 = new Thread(threadSecond , "URLFetcherThread2");
        thread1.start();
        thread2.start();


    }
}
