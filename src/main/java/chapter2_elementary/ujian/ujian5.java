package chapter2_elementary.ujian;

import java.util.Scanner;
public class ujian5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Jarak Perjalanan : ");
        double jarak = input.nextDouble();

        System.out.print("Masukan konsumsi bahan bakar : ");
        double bahanBakar = input.nextDouble();

        System.out.print("Masukan Harga bahan bakar dalam 1 liter : ");
        double harga = input.nextDouble();

        double totalBiaya = jarak / bahanBakar * harga;

        System.out.println("Maka total biaya perjalanan anda dalam " +(int) jarak + " km adalah Rp. " +(int) totalBiaya);
    }
}
