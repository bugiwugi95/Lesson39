package Task1;

public class MyClassTask implements Decoder {
    //1.Сделайте интерфейс Decoder. В нем два метода String encode(String source) и String decode(String encoded).
    // Реализуйте этот интерфейс: пусть класс меняет русские символы на цифры и латиницу
    // (ш на w, г на r и так далее), и наоборот
    @Override
    public String encode(String source) {
        return source.replace('w', 'ш')
                .replace('r', 'г')
                .replace('t', 'е')
                .replace('y', 'н')
                .replace('u', 'щ')
                .replace('i', 'з')
                .replace('o', 'х')
                .replace('z', '1')
                .replace('x', '2')
                .replace('a', '3')
                .replace('s', '4')
                .replace('d', '5')
                .replace('b', '6')
                ;
    }


    @Override
    public String decode(String encoded) {
        return encoded.replace('w', 'ш')
                .replace('г', 'r')
                .replace('е', 't')
                .replace('н', 'y')
                .replace('щ', 'u')
                .replace('з', 'i')
                .replace('х', 'o')
                .replace('я', '1')
                .replace('ч', '2')
                .replace('ф', '3')
                .replace('ы', '4')
                .replace('в', '5')
                .replace('е', '6')
                ;
    }
    // 2.Сделайте ещё одну реализацию Decoder: он будет шифровать и дешифровать азбуку морзе

    @Override
    public String encrypt(String source) {
        return source.replaceAll("а", "._")
                .replace("б", "_...")
                .replace("в", ".__")
                .replace("г", "__.")
                .replace("д", "_..")
                .replace("е", ".")
                .replace("ж", "..._")
                .replace("з", "__..");
    }

    @Override
    public String decrypt(String encoded) {
        return encoded.replaceAll("._", "а")
                .replace("_...", "б")
                .replace(".__", "в")
                .replace("__.", "г")
                .replace("_..", "д")
                .replace(".", "е")
                .replace("..._", "ж")
                .replace("__..", "з");
    }

    //bgb3.Еще одну реализацию: он будет менять символ на код символа ( который можно получить как (int)str.charAt )

    @Override
    public String characterCode(String c) {
        String res = "";
        for (int i = 0; i < c.length(); i++) {
            char ch = c.charAt(i);
            res += "Символ: " + ch + " - Код символа: " + (int) ch + "\n";

        }
        return res;
    }
}
