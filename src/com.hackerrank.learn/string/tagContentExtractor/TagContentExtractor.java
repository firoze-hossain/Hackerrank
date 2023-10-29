package string.tagContentExtractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String s = sc.nextLine();
            Pattern pattern = Pattern.compile("<([^>]+)>([^<]+)</\\1>");
            Matcher matcher = pattern.matcher(s);
            int matches = 0;
            while (matcher.find()) {
                matches++;
                System.out.println(matcher.group(2));
            }
            if (matches == 0) {
                System.out.println("None");
            }
        }

    }
}
