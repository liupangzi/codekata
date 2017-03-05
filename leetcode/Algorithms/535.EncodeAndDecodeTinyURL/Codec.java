import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Codec {
    public String encode(String longUrl) {
        return Base64.getUrlEncoder().encodeToString(longUrl.getBytes(StandardCharsets.UTF_8));
    }

    public String decode(String shortUrl) {
        return new String(Base64.getUrlDecoder().decode(shortUrl));
    }
}
