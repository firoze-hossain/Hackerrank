package dataStructures.arraysDS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysDS {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("C:\\\\Users\\\\firoze.hossain\\\\Documents\\\\path\\\\file.txt"));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> res = Result.reverseArray(arr);

        bufferedWriter.write(
                res.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(" "))
                        + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result {

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> arr = new ArrayList<>(a.size());
        for (int i = a.size() - 1; i >= 0; i--) {
            arr.add(a.get(i));
        }
        return arr;
    }

}