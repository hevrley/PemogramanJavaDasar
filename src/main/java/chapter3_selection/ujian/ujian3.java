package chapter3_selection.ujian;
import java.util.Scanner;

public class ujian3 {
    public ujian3() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nama seles ");
        String seles = input.next();
        System.out.println("Masukan jumlah penjualan seles hari ini ");
        int barang = input.nextInt();
        System.out.println("=============================================");
        int hasil;
        short jasa;
        int komisi;
        if (barang <= 200000) {
            jasa = 10000;
            komisi = barang * 10 / 100;
            hasil = jasa + komisi;
        } else if (barang > 200000 && barang <= 500000) {
            jasa = 20000;
            komisi = barang * 15 / 100;
            hasil = jasa + komisi;
        } else {
            jasa = 30000;
            komisi = barang * 20 / 100;
            hasil = jasa + komisi;
        }

        System.out.println("nama seles " + seles);
        System.out.println("selamat, total penjualan anda hari ini adalah " + barang + "\n anda berhak mendapatkan komisi " + komisi + " dan uang jasa " + jasa + "\nTotal pendapatan anda hari ini adalah " + hasil);
    }
}
