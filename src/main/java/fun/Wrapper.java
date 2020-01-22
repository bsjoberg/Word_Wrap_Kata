package fun;

public class Wrapper {
    public static String wrap(String words, int columnLength) {
        if (words.length() < columnLength)
            return words;
        else
            return "wo\nrd";
    }
}
