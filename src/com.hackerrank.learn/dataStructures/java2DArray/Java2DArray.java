package dataStructures.java2DArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class Java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> list = new ArrayList<>();
        IntStream.range(0, 6).forEach(i -> {
            try {
                list.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).
                        map(Integer::parseInt).collect(Collectors.toList()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        bufferedReader.close();
        int result = hourglassSum(list);
        System.out.println(result);
    }

    public static int hourglassSum(List<List<Integer>> list) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int currentSum = list.get(i).get(j) + list.get(i).get(j + 1) + list.get(i).get(j + 2) +
                        list.get(i + 1).get(j + 1) + list.get(i + 2).get(j) + list.get(i + 2).get(j + 1) + list.get(i + 2).get(j + 2);
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
}
