package bigNumber.javaBigDecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        Arrays.sort(s, 0, n, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal bigDecimal1 = new BigDecimal((String) o1);
                BigDecimal bigDecimal2 = new BigDecimal((String) o2);
                return bigDecimal2.compareTo(bigDecimal1);
            }
        });
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
