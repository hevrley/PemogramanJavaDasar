package chapter2_elementary.exercise;
import java.util.Scanner;

public class exercise2ComputeTheVolumeOfACylinder {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("The area is " + String.format("%.4f", area) + "\n" + " The volume is " + String.format("%.1f", volume));

        System.out.println("------------------------------------------------------------------------------------");

        System.out.print("The area is ");
        System.out.printf("%.4f", area);
        System.out.print("\nThe volume is ");
        System.out.printf("%.1f", volume);

    }
}
