package com.text.practic.count_words;

import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import static java.nio.file.Files.readAllLines;
import static org.junit.Assert.assertEquals;

public class WordsTest {

    @Test
    public void countWords() throws IOException {
        final String result = readPathToString(Paths.get("src/test/resources/DSResult.txt"));

        final List<String> lines = Stream.concat(
                Files.lines(Paths.get("src", "test", "resources", "DS1.txt"), StandardCharsets.UTF_8),
                Files.lines(Paths.get("src", "test", "resources", "DS2.txt"), StandardCharsets.UTF_8)
        ).toList();

        assertEquals(result, new Words().countWords(lines));
    }


    private String readPathToString(final Path path) {
        try {
            return String.join("\n", readAllLines(path, StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}