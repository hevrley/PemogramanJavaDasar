package chapter2_elementary.latihan;

import java.util.Scanner;

public class listing8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales taz is $" + (int)(tax * 100) / 100.0);
    }
}
