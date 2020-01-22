package fun;

public class Wrapper {
    public static String wrap(String words, int columnLength) {
        String result = "";

        if (words.length() <= columnLength)
            return result = words;
        else if (words.charAt(columnLength - 1) == ' ')
            return result = words.substring(0, columnLength - 1) + "\n" + wrap(words.substring(columnLength), columnLength);
        else
            return result = words.substring(0, columnLength) + "\n" + wrap(words.substring(columnLength), columnLength);
    }
}