package algorithms.warmup.staircase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staircase {
    public static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j < n - i ? " " : "#");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bufferedReader.readLine().trim());
        staircase(n);
        bufferedReader.close();
    }

}
