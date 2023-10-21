package string.javaSubstringComparisons;

import java.util.Scanner;

public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String currentSubString = s.substring(0, k);
        String smallest = currentSubString;
        String largest = currentSubString;

        for (int i = k; i < s.length(); i++) {
            currentSubString = currentSubString.substring(1, k) + s.charAt(i);
            if (largest.compareTo(currentSubString) < 0) {
                largest = currentSubString;
            }
            if (smallest.compareTo(currentSubString) > 0) {
                smallest = currentSubString;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
