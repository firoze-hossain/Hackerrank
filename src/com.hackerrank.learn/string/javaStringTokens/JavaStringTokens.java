package string.javaStringTokens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your code here.
        if (!scan.hasNext()) {
            System.out.println(0);
        } else {
            String s = scan.nextLine();
            String[] stringArr = s.trim().split("[ !,?._'@]+");
            //List<String>asList=new ArrayList<>(Arrays.asList(stringArr));
            System.out.println(stringArr.length);
            for (String token : stringArr) {
                System.out.println(token);
            }
        }
        scan.close();
    }
}
