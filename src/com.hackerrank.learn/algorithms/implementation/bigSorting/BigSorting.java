package algorithms.implementation.bigSorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BigSorting {
    public static List<String> bigSorting(List<String> unsorted) {
        Collections.sort(unsorted, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.length() == b.length()) {
                    return a.compareTo(b);
                }
                return a.length() - b.length();
            }
        });
        return unsorted;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("C:\\Users\\firoze.hossain\\Documents\\path\\file.txt"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> unsorted = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(Collectors.toList());

        List<String> result = bigSorting(unsorted);

        bufferedWriter.write(
                result.stream()
                        .collect(Collectors.joining("\n"))
                        + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}
