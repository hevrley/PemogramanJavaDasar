package chapter4_math.exercise;

import java.util.Scanner;


public class exercise2GreatCircleDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double RADIUS = 6371.01; // Nilai konstan

        // Perintahkan pengguna untuk memasukkan lintang dan bujur
        // dari dua titik di bumi dalam derajat
        System.out.print("Enter point 1 (latituide and longitude) in degrees: ");
        String xy1 = input.nextLine();
        System.out.print("Enter point 2 (latituide and longitude) in degrees: ");
        String xy2 = input.nextLine();

        // Ekstrak nilai x dan y dari string
        int k = xy1.indexOf(',');
        double x1 = Double.parseDouble(xy1.substring(0, k - 1));
        double y1 = Double.parseDouble(xy1.substring(k + 2));
        k = xy2.indexOf(',');
        double x2 = Double.parseDouble(xy2.substring(0, k - 1));
        double y2 = Double.parseDouble(xy2.substring(k + 2));

        // Mengkonversi derajat ke radian
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        // Hitung jarak lingkaran besarnya
        double distance =
                RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        // Tampilkan hasil
        System.out.println("The distance between the two points is " + distance);
    }
}
