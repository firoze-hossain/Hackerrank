package algorithms.implementation.findDigits;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FindDigits {
    public static int findDigits(int n) {
        // Write your code here
        int count = 0;
        int num = n;
        List<Integer> list = new ArrayList<>();
        while (num > 0) {
            list.add(num % 10);
            num = num / 10;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0 && n % list.get(i) == 0) {
                count++;
            }
        }
        return count;
    }

     public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\firoze.hossain\\\\\\\\\\\\\\\\Documents\\\\\\\\\\\\\\\\path\\\\\\\\\\\\\\\\file.txt"));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = findDigits(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }

}
