package chapter2_elementary.exercise;
import java.util.Scanner;

public class exercise5FinancialApplicationCalculateTips {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        // Input data gratuityrate
        System.out.print("Enter a number in pounds : ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextInt();

        double gratuity = subtotal * gratuityRate / 100;
        double total = subtotal + gratuity;

        System.out.println("the gratuity is $" + gratuity + " and total is $" + total );

    }
}
