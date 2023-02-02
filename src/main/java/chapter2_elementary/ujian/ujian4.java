package chapter2_elementary.ujian;

import java.util.Objects ;
import java.util.Scanner ;

public class ujian4 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Masukan Berat badan : ");
        double berat = input.nextDouble();

        System.out.println(" Masukan Tinggi badan ");
        double tinggi = input.nextDouble();

        System.out.println("Masukan jenis kelamin anda(L/P)");
        String jk = input.next();

        double berat_ideal = 0;

        // Rumus Bocha
        if(Objects.equals(jk, "L")){
            berat_ideal = (tinggi - 100) - (0.1 *(tinggi - 100));
        }else if (Objects.equals(jk, "P")){
            berat_ideal = (tinggi - 100) - (0.15 *(tinggi - 100));
        }else{
            System.out.println("Mohon maaf masukan jenis kelamin dengan L/P");
        }

        // bmi
        double tinggiDalamM = tinggi / 100;
        double bmi = berat / (tinggiDalamM * tinggiDalamM) ;

        String keterangan;
        if(bmi<18.5){
            keterangan = " Anda Termasuk Kurus";
        }else if(bmi >= 18.5 && bmi< 24.9){
            keterangan = " Selamat Berat badan anda termasuk normal";
        }else if(bmi >= 24.9 && bmi< 29.9){
            keterangan = " Anda Kelebihan Berat Badan";
        }else{
            keterangan =" Warning Anda sudah Obesitas";
        }


        System.out.println(" Berat badan ideal anda menurut bocha adalah : " + berat_ideal + " kg ");
        System.out.println(" Nilai bmi tubuh anda adalah : " + String.format("%.2f",bmi) + " Menurut BMI anda termasuk : " + keterangan);

    }
}
