package introduction.javaDateAndTime;

import java.io.*;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class JavaDateAndTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        String res = Result.findDay(month, day, year);
        System.out.println(res);
    }

}

class Result {
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        Format f = new SimpleDateFormat("EEEE");
        String str = f.format(cal.getTime());
        return str.toUpperCase();
    }

}