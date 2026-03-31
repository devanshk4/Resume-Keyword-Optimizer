import analyzer.ATSMatcher;
import analyzer.KeywordExtractor;
import model.AnalysisResult;
import utils.TextCleaner;
import utils.FileHandler;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String resume = FileHandler.readFile("data/resume.txt");
        String job = FileHandler.readFile("data/job.txt");

        resume = TextCleaner.clean(resume);
        job = TextCleaner.clean(job);

        Set<String> resumeKeywords = KeywordExtractor.extract(resume);
        Set<String> jobKeywords = KeywordExtractor.extract(job);

        AnalysisResult result = ATSMatcher.match(resumeKeywords, jobKeywords);

        result.display();
    }
}
