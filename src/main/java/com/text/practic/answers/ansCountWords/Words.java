package com.text.practic.answers.ansCountWords;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Words {

    public static final String REPLACE_REGEX = "\\pP";
    public static final String SPLITER = " ";
    public static final int MIN_LENGTH_SIZE = 3;
    public static final int MIN_FREQUENCY = 10;
    public static final String OUTPUT_FORMAT = "%s - %d";

    public String countWords(List<String> target) {
        return output(getFrequency(getWordsFromLines(target)));
    }

    private List<String> getWordsFromLines(List<String> lines) {
        return lines.stream()
                .map(x -> x.replaceAll(REPLACE_REGEX, SPLITER).split(SPLITER))
                .map(x -> Arrays.stream(x).filter(y -> y.length() > MIN_LENGTH_SIZE)
                        .toList())
                .flatMap(Collection::stream)
                .map(String::toLowerCase)
                .toList();
    }

    private Map<String, Long> getFrequency(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
    }

    private String output(Map<String, Long> words) {
        return words.entrySet().stream()
                .filter(x -> x.getValue() > MIN_FREQUENCY)
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .map(x -> String.format(OUTPUT_FORMAT, x.getKey(), x.getValue()))
                .collect(Collectors.joining());
    }
}
