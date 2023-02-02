package chapter1_Intro.exercise;

public class exercise12AverageSpeedInKilometers {
    public static void main(String[] agrs) {
        System.out.println("Miles / (hour + (minutes / 60) + (seconds / 3600)) * 1.6");
        System.out.println("24    / (1    + (40      / 60) + (35      / 3600))  * 1.6");
        System.out.println((24 / (1 + (40 / 60.0) + (35 / 3600.0))) * 1.6);
    }
}
