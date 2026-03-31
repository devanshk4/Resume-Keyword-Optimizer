import java.util.*;

public class AnalysisResult {
    double score;
    Set<String> matched;
    Set<String> missing;

    public AnalysisResult(double score, Set<String> matched, Set<String> missing) {
        this.score = score;
        this.matched = matched;
        this.missing = missing;
    }

    public void display() {
        System.out.println("ATS Score: " + score + "%");
        System.out.println("Matched Keywords: " + matched);
        System.out.println("Missing Keywords: " + missing);
    }
}
