package string.javaAnagrams;

import java.util.Scanner;

public class JavaAnagrams {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String aToLowerCase = a.toLowerCase();
        String bToLowerCase = b.toLowerCase();
        if (aToLowerCase.length() != bToLowerCase.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            int countA = 0;
            int countB = 0;
            for (int j = 0; j < a.length(); j++) {
                if (aToLowerCase.charAt(i) == aToLowerCase.charAt(j)) {
                    countA++;
                }
                if (aToLowerCase.charAt(i) == bToLowerCase.charAt(j)) {
                    countB++;
                }
            }
            if (countA == countB) {
                continue;
            } else {
                return false;
            }
        }
        return true;

    }
}
