
public class TextCleaner {

    public static String clean(String text) {
        return text.toLowerCase().replaceAll("[^a-zA-Z ]", "");
    }
}
