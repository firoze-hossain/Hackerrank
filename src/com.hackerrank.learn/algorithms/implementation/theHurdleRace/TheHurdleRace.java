package algorithms.implementation.theHurdleRace;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.naming.spi.DirStateFactory.Result;

public class TheHurdleRace {
    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int value = 0;
        Collections.sort(height);
        for (int i = 0; i < height.size(); i++) {
            if (k >= height.get(i)) {
                value = 0;
            } else {
                value = ((height.get(height.size() - 1)) - k);
            }
        }
        return value;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
                "C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\firoze.hossain\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Documents\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\path\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\file.txt"));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> height = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = hurdleRace(k, height);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
