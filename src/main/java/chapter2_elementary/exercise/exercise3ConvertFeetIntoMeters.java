package chapter2_elementary.exercise;
import java.util.Scanner;

public class exercise3ConvertFeetIntoMeters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet : ");
        double feet = input.nextDouble();

        double result = feet * 0.305;

        System.out.println(feet + " feet is " + result + " meters");

    }
}
