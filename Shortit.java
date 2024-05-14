import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.io.*;

public class Shortit {
    private Map<String, String> urlMap; //Hashmap to store the mappings between original and shortened strings
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; //chars allowed in short url
    private static final int SHORT_URL_LENGTH = 6; // Length of the shortened URL

    public Shortit() {
        this.urlMap = new HashMap<>();
    }

    // Shorten a given URL
    public String shortenURL(String originalURL) {
        String shortURL = generateShortURL();
        urlMap.put(shortURL, originalURL);
        return shortURL;
    }

    // Expand a given short URL
    public String expandURL(String shortURL) {
        return urlMap.get(shortURL);
    }

    // Generate a random short URL
    private String generateShortURL() {
        StringBuilder shortURL = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < SHORT_URL_LENGTH; i++) {
            shortURL.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return shortURL.toString();
    }

public static void main(String[] args)
throws IOException
 {
        BufferedReader bfn = new BufferedReader(
            new InputStreamReader(System.in));
        System.out.println("Enter your String that needs shortening: ");
        String originalURL = bfn.readLine();

        Shortit shortener = new Shortit();
        String shortURL = shortener.shortenURL(originalURL);
        System.out.println("Shortened String: " + shortURL);

        String expandedURL = shortener.expandURL(shortURL);
        System.out.println("Original String: " + expandedURL);
}
}
