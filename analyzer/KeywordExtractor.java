import java.util.*;

public class KeywordExtractor {

    private static final Set<String> stopWords = new HashSet<>(
            Arrays.asList("the", "is", "and", "in", "on", "at", "a", "an", "to", "for")
    );

    public static Set<String> extract(String text) {
        Set<String> keywords = new HashSet<>();
        String[] words = text.split("\\s+");

        for (String word : words) {
            if (!stopWords.contains(word) && word.length() > 2) {
                keywords.add(word);
            }
        }
        return keywords;
    }
}
