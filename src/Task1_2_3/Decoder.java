package Task1;

public interface Decoder {
    String encode(String source);
    String decode(String encoded);

    String encrypt(String source);
    String decrypt(String encoded);

    String characterCode(String c);

}
