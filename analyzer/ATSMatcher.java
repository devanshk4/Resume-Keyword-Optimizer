import java.util.*;
import model.AnalysisResult; 

public class ATSMatcher {

    public static AnalysisResult match(Set<String> resume, Set<String> job) {

        Set<String> matched = new HashSet<>(resume);
        matched.retainAll(job);

        Set<String> missing = new HashSet<>(job);
        missing.removeAll(resume);

        double score = (matched.size() * 100.0) / job.size();

        return new AnalysisResult(score, matched, missing);
    }
}
