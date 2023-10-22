package string.javaStringReverse;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String str = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            str += A.charAt(i);
        }
        if (str.equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
