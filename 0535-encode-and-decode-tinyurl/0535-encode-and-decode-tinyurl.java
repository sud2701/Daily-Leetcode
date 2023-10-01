public class Codec {
    HashMap<String, String> urlMap;
    static int count = 1;
    char[] codes = new char[] {'A', 'B', 'C', 'D', 'E', 'F'};
    Codec() {
        urlMap = new HashMap<String, String>();
    }

    public String hexCode(int num) {
        StringBuilder hex = new StringBuilder();
        while(num > 0){
            if(num % 16 > 9){
                hex.append(String.valueOf(codes[num % 16 - 10]));
            }
            else {
                hex.append(String.valueOf(num % 16));
            }
            num = num / 16;
        }
        return hex.toString();
    }
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String hashval = hexCode(Codec.count);
        Codec.count += 1;
        urlMap.put(hashval, longUrl);
        return hashval;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return urlMap.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));