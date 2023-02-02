package chapter2_elementary.exercise;
import java.util.Scanner;

public class exercise7FindTheNumberOfYears {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("input minute : ");
        int minute = input.nextInt();

        final int MINUTE_IN_HOUR = 60;
        final int HOUR_IN_DAY = 24;
        final int DAY_IN_YEAR = 365;

        int year = minute/MINUTE_IN_HOUR/HOUR_IN_DAY/DAY_IN_YEAR;
        int day = minute/MINUTE_IN_HOUR/HOUR_IN_DAY%DAY_IN_YEAR;

        System.out.println(minute + " minutes is approximately " + year + "  years and " + day);
    }
}

