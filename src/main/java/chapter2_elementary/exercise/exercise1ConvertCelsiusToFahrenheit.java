package chapter2_elementary.exercise;
import java.util.Scanner;

public class exercise1ConvertCelsiusToFahrenheit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter  a degree in celcius : ");
        double celcius = input.nextDouble();

        double fahrenheit = (9.0 / 5.0) * celcius + 32;

        System.out.println(celcius + " celcius is " + fahrenheit + " fahrenheit ");
    }
}


