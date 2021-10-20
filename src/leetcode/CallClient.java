package leetcode;
import com.fasterxml.jackson.databind.*;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class CallClient {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://api-v3.mbta.com/predictions?page%5Blimit%5D=10&sort=departure_time&include=route&filter%5Bstop%5D=place-pktrm");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("accept","application/vnd.api+json");
        InputStream responseStream = connection.getInputStream();
        ObjectMapper mapper = new ObjectMapper();

    }
}
