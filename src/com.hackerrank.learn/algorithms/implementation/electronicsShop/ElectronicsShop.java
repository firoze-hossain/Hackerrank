package algorithms.implementation.electronicsShop;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ElectronicsShop {
    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                sum = keyboards[i] + drives[j];
                if (sum >= max && sum <= b) {
                    max = sum;
                }
            }
        }
        if (max == 0) {
            return -1;
        } else {
            return max;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("C:\\Users\\firoze.hossain\\Documents\\path\\file.txt"));

        String[] bnm = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int b = Integer.parseInt(bnm[0]);

        int n = Integer.parseInt(bnm[1]);

        int m = Integer.parseInt(bnm[2]);

        int[] keyboards = new int[n];

        String[] keyboardsItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        int[] drives = new int[m];

        String[] drivesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        }

        int moneySpent = getMoneySpent(keyboards, drives, b);

        bufferedWriter.write(String.valueOf(moneySpent));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
