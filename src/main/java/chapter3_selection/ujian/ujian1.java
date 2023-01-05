package chapter3_selection.ujian;
import java.util.Objects;
import java.util.Scanner;

public class ujian1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input jenis kelamin anda : ");
        String jk = input.next();

        double berat_ideal = 0;

        System.out.print("Masukan tinggi badan : ");
        double tinggi = input.nextDouble();

        System.out.print("Masukan berat badan : ");
        double berat = input.nextDouble();

        // Rumus bocha
        if(Objects.equals(jk, "L")){
            jk = "laki-laki";
            berat_ideal = (tinggi - 100) - (0.1 *(tinggi - 100));
        }else if (Objects.equals(jk, "P")){
            jk = "perempuan";
            berat_ideal = (tinggi - 100) - (0.15 *(tinggi - 100));
        }else{
            System.out.print("Mohon maaf masukan jenis kelamin dengan L/P");
        }

        // BMI
        double tinggiDalamM = tinggi / 100;
        double bmi = berat / (tinggiDalamM * tinggiDalamM);

        String keterangan;
        if (bmi<18.5){
            keterangan = " Anda termasuk Kurus";
        }else if(bmi >= 18.5 && bmi< 24.9){
            keterangan = " Selamat Berat badan anda termasuk normal";
        }else if(bmi >= 24.9 && bmi< 29.9){
            keterangan = " Anda Kelebihan Berat Badan";
        }else{
            keterangan = "Waduhl anda obesitas";
        }

        System.out.println("Jenis kelamin anda adalah " + jk + " maka berat badan ideal anda adalah : " + berat_ideal + " kg ");
        System.out.println("Nilai bmi tubuh anda adalah : " + String.format("%.2f" ,bmi) + " maka berat badan anda termasuk kategori " + keterangan);
    }
}
