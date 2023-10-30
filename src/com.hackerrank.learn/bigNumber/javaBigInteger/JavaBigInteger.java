package bigNumber.javaBigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        BigInteger bigIntA = new BigInteger(a);
        BigInteger bigIntB = new BigInteger(b);
        System.out.println(bigIntA.add(bigIntB) + "\n" + bigIntA.multiply(bigIntB));


    }
}
