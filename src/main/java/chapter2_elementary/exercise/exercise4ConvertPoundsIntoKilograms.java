package chapter2_elementary.exercise;
import java.util.Scanner;

public class exercise4ConvertPoundsIntoKilograms {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds : ");
        double pounds = input.nextDouble();

        double kilogram = pounds * 0.454;

        System.out.println(pounds + " pounds is " + kilogram + " kilograms ");

    }
}
