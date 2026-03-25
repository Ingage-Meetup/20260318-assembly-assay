import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainTest {
    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) throws IOException {
        List<String> inputLines = readLines("../../input.csv");
        List<String> expectedLines = readLines("../../expected-output.csv");

        assertEquals("line count", inputLines.size(), expectedLines.size());

        for (int i = 0; i < inputLines.size(); i++) {
            String actual = Main.sortChars(inputLines.get(i));
            assertEquals("line " + (i + 1), expectedLines.get(i), actual);
        }

        System.out.println("Results: " + passed + " passed, " + failed + " failed.");
        if (failed > 0) System.exit(1);
    }

    private static List<String> readLines(String path) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) lines.add(line);
            }
        }
        return lines;
    }

    private static void assertEquals(String label, Object expected, Object actual) {
        if (expected == null ? actual == null : expected.equals(actual)) {
            System.out.println("PASS: " + label);
            passed++;
        } else {
            System.out.println("FAIL: " + label);
            System.out.println("  expected: " + expected);
            System.out.println("  actual:   " + actual);
            failed++;
        }
    }
}
