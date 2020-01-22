package fun;

public class Wrapper {
    public static String wrap(String words, int columnLength) {
        String result = "";

        if (words.length() <= columnLength)
            return result = words;
        else
            return result = words.substring(0, columnLength) + "\n" + words.substring(columnLength);
    }
}
