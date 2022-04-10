public class KeyDataPair {
    private final String KEY;
    private final String VALUE;

    public KeyDataPair(String key, String value){
        this.KEY = key;
        this.VALUE = value;
    }

    public String getKey() {
        return this.KEY;
    }

    public String getValue() {
        return this.VALUE;
    }
}
