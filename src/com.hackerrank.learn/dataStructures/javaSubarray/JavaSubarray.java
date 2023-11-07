package dataStructures.javaSubarray;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        long result = IntStream.range(0, n)
                .flatMap(from -> IntStream.rangeClosed(from + 1, n)
                        .map(to -> Arrays.stream(arr, from, to).sum()))
                .filter(sum -> sum < 0).count();
        System.out.println(result);
    }

}
