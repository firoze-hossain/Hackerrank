package algorithms.implementation.catsAndAMouse;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CatsAndAMouse {
    static String catAndMouse(int x, int y, int z) {
        int catXDis = Math.abs(z - x);
        int catYDis = Math.abs(z - y);
        if (catXDis < catYDis) {
            return "Cat A";
        } else if (catXDis > catYDis) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("C:\\Users\\firoze.hossain\\Documents\\path\\file.txt"));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
