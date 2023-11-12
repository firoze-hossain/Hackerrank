package algorithms.warmup.miniMaxSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", " ").split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        minMaxSum(list);
        bufferedReader.close();
    }

    public static void minMaxSum(List<Integer> arr) {
        long minSum = 0;
        long maxSum = 0;
        Collections.sort(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            minSum += arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            maxSum += arr.get(i);
        }
        System.out.println(minSum + " " + maxSum);

    }

}
