package chapter3_selection.ujian;
import java.util.Objects;
import java.util.Scanner;

public class ujian4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Apakah pelanggan termasuk member? (ya/tidak) : ");
        String pelanggan = input.next();

        System.out.println("Masukan total belanja : ");
        int shop = input.nextInt();
        int diskon = 0;
        int hasil = 0;
        int jumlah = 0;

        if (Objects.equals(pelanggan, "ya")) {
            pelanggan = "member";
            if (shop > 500000) {
                diskon = (shop * 3 / 100);
                jumlah = shop - diskon;
            }else if(shop < 500000){
                diskon = (shop * 2 / 100);
                jumlah = shop - diskon;
            }
        } else if (Objects.equals(pelanggan, "tidak")) {
            pelanggan = "pelanggan biasa";
            jumlah = shop;
            if (shop < 500000) {
                diskon = shop;
            }else if (shop > 500000) {
                diskon = (shop * 2 / 100);
                jumlah = shop - diskon;
            }
        } else {
            System.out.print("Masukan member (ya/tidak)");
        }

        System.out.println("anda merupakan :" + pelanggan );
        System.out.println("total belanja anda : " + shop );
        if (diskon < shop){
            System.out.println("selamat anda mendapatkan potongan harga " + diskon );
        }else if (diskon > shop){
            System.out.println(" ");
        }



        System.out.println("total bayar : " + jumlah );


        System.out.println(" ");
        System.out.println("********** CASH SYSTEM **********");

        System.out.println("Total case : ");
        hasil = input.nextInt();

        if (jumlah <= hasil) {
            jumlah = hasil - jumlah;
            System.out.println("kembalian anda : " + jumlah);
        } else if (jumlah >= hasil){
            System.out.println("Maaf jumlah yang anda bayarkan kurang ");
        }else{
            System.out.println("TERIMAKASI");
        }
    }
}
