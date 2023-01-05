package chapter3_selection.ujian;
import java.util.Scanner;
public class ujian5{
    public static void main (String[] args){


        final double kehadiran , tugas , uts , uas , p_akhir , n_akhir;

        Scanner input = new Scanner (System.in);

        System.out.println("===== Menghitung Nilai Mahasiswa=====\n");

        System.out.print("Masukan kehadiran : ");

        kehadiran = input.nextInt();

        System.out.print("Masukan nilai tugas : ");

        tugas = input.nextInt();

        System.out.print("masukan nilai uts : ");

        uts = input.nextInt();

        System.out.print("masukan Nilai uas : ");

        uas = input.nextInt();

        System.out.print("masukan Nilai projek akhir : ");

        p_akhir = input.nextInt();

        System.out.println("");


        n_akhir = (0.05 * kehadiran + 0.20 * tugas + 0.30 * p_akhir + 0.20 * uts + 0.25 * uas);

        if (n_akhir >= 90){
            System.out.println("Selamat Anda Lulus dengan nilai A");
        }else if (n_akhir >= 85){
            System.out.println("Selamat Anda Lulus dengan nilai B+");
        } else if (n_akhir >= 80) {
            System.out.println("Selamat Anda Lulus dengan nilai B");
        }else if (n_akhir >= 75) {
            System.out.println("Selamat Anda Lulus dengan nilai B-");
        }else if (n_akhir >= 70) {
            System.out.println("Selamat Anda Lulus dengan nilai C+");
        }else if (n_akhir >= 65) {
            System.out.println("Selamat Anda Lulus dengan nilai C");
        }else if (n_akhir >= 60) {
            System.out.println("Selamat Anda Lulus dengan nilai C-");
        }else if (n_akhir > 50) {
            System.out.println("Nilai anda D dinyatakan tidak lulus \nAnda harus mengulang natakuliah ini");
        }else if (n_akhir < 50) {
            System.out.println("Nilai anda E dinyatakan tidak lulus \nAnda harus mengulang matakuliah ini");
        }

    }

}