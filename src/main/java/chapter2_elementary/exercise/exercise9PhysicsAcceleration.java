package chapter2_elementary.exercise;
import java.util.Scanner;

public class exercise9PhysicsAcceleration {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t : ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double a = (v1 - v0) / t;

        System.out.print("The Average acceleration is " + a);

    }
}
