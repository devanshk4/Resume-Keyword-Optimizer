package org.devanshk;

import org.devanshk.analyzer.ATSMatcher;
import org.devanshk.analyzer.KeywordExtractor;
import org.devanshk.model.AnalysisResult;
import org.devanshk.utils.TextCleaner;
import org.devanshk.utils.FileHandler;

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