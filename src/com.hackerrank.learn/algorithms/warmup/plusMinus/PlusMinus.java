package algorithms.warmup.plusMinus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream; 
public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

class Result {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double countPlus = 0;
        double countMinus = 0;
        double countZero = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                countMinus++;
            } else if (arr.get(i) > 0) {
                countPlus++;
            } else {
                countZero++;
            }
        }
        System.out.println(countPlus / (double) arr.size() + "\n" + countMinus / (double) arr.size() + "\n"
                + countZero / (double) arr.size());
    }

}