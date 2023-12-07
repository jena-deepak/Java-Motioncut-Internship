import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class LinkShortener {
    private static final String BASE_URL = "http://short.en/";
    private Map<String, String> shortToLongMap = new HashMap<>();
    private Map<String, String> longToShortMap = new HashMap<>();

    private String generateShortKey() {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder shortKey = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            shortKey.append(characters.charAt(random.nextInt(characters.length())));
        }

        return shortKey.toString();
    }

    public String shorten(String longUrl) {
        if (longToShortMap.containsKey(longUrl)) {
            return BASE_URL + longToShortMap.get(longUrl);
        }

        String shortKey = generateShortKey();
        String shortUrl = BASE_URL + shortKey;

        shortToLongMap.put(shortKey, longUrl);
        longToShortMap.put(longUrl, shortKey);

        return shortUrl;
    }

    public String expand(String shortUrl) {
        String shortKey = shortUrl.substring(BASE_URL.length());

        if (shortToLongMap.containsKey(shortKey)) {
            return shortToLongMap.get(shortKey);
        } else {
            return "Invalid short URL";
        }
    }
}

public class LinkShortenerApp {
    public static void main(String[] args) {
        LinkShortener linkShortener = new LinkShortener();

        String longUrl = "https://www.example.com";
        String shortUrl = linkShortener.shorten(longUrl);
        System.out.println("Shortened URL: " + shortUrl);

        String expandedUrl = linkShortener.expand(shortUrl);
        System.out.println("Expanded URL: " + expandedUrl);
    }
}
