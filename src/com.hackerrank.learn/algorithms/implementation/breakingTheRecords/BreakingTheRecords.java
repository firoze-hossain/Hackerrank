package algorithms.implementation.breakingTheRecords;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = scores.get(0);
        int min = scores.get(0);
        int maxCount = 0;
        int minCount = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) > max) {
                max = scores.get(i);
                maxCount++;
            } else if (scores.get(i) < min) {
                min = scores.get(i);
                minCount++;
            }
        }
        list.add(maxCount);
        list.add(minCount);
        return list;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/firoze/Documents/hello.txt"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = breakingRecords(scores);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(" "))
                        + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}
