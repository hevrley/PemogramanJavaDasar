package chapter2_elementary.exercise;
import java.util.Scanner;

public class exercise10ScienceCalculatingEnergy {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" Enter the amount of water in kilograms : ");
        double m = input.nextDouble();

        System.out.print(" Enter the initial temperatures : ");
        double initialtempe = input.nextDouble();

        System.out.print(" Enter the final temperatur : ");
        double finaltempe = input.nextDouble();

        double energy = m * (finaltempe - initialtempe) * 4184;

        System.out.print(" The energy needed is : " + energy );
    }
}
