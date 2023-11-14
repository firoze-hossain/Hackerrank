package dataStructures.leftRotation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeftRotation {
    public static List<Integer> leftRotate(int n, List<Integer> list) {
        for (int i = 0; i < n; i++) {
            int first = list.get(0);
            list.remove(0);
            list.add(first);
        }
        return list;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/firoze/Documents/hello.txt"));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = leftRotate(d, arr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(" "))
                        + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}
