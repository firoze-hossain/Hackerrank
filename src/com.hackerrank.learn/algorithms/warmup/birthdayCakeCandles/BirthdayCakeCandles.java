package algorithms.warmup.birthdayCakeCandles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirthdayCakeCandles {
    public static int countCandles(List<Integer> candles) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) > max) {
                max = candles.get(i);
                count = 1;
            } else if (candles.get(i) == max) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("C:\\Users\\firoze.hossain\\Documents\\path\\file.txt"));
        int countCandles = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> candles = Stream.of(bufferedReader.readLine()
                .replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int result = countCandles(candles);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
