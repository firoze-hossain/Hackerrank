package algorithms.implementation.migratoryBirds;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> list) {
        int arr[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[list.get(i)]++;
        }
        int max = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = i;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("/home/firoze_hossain/Documents/Hello/hello.txt"));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
