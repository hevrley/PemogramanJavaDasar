package chapter2_elementary.exercise;

public class exercise8CurrentTime {
    public static void main(String[] args) {
        // BUAT TOTAL MILI SECONDS
        long totalMilliseconds = System.currentTimeMillis();
        // BUAT TOTAL SECONDS
        long totalSeconds = totalMilliseconds / 1000;
        // BUAT TOTAL CURRENT SECONDS
        long currentSecond = totalSeconds % 60;

        long totalMinute = totalSeconds / 60;

        long currentMinute = totalMinute % 60;

        long totalHours = totalMinute / 60;

        long currentHours = totalHours % 24 + 7;

        System.out.println("current time is " + currentHours  + ":" + currentMinute + ":" + currentSecond + " WIB ");


    }
}
