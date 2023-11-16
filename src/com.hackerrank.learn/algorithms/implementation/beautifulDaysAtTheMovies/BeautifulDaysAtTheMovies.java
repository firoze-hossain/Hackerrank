package algorithms.implementation.beautifulDaysAtTheMovies;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeautifulDaysAtTheMovies {
    public static int reverse(int n) {
        int rev = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;

        }
        return rev;
    }

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int count = 0;
        for (int m = i; m <= j; m++) {
            if ((m - reverse(m)) % k == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("C:\\\\\\\\Users\\\\\\\\firoze.hossain\\\\\\\\Documents\\\\\\\\path\\\\\\\\file.txt"));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
