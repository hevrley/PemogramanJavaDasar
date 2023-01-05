package chapter4_math.exercise;

import java.util.Scanner;

public class exercise1AreaOfPentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // meminta pengguna untuk memasukkan panjang dari
        // pusat segi lima ke titik puncak
        System.out.println("Enter the leght from the center to a vertex: ");
        double r = input.nextDouble();

        double s = (2 * r) * Math.sin(Math.PI / 5); // Panjang sisi
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

        // hasil tampilan
        System.out.printf("The area of the pentagon is %5.2f\n", area);

    }
}
