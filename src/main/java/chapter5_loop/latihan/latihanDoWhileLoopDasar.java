package chapter5_loop.latihan;

public class latihanDoWhileLoopDasar {
    public static void main(String[] args) {

        // do while loop (dasar)

        System.out.println("Awal program");

        int a = 0;
        boolean kondisi = true;

        do {
            a++;
            System.out.println("do while ke-" + a);
            if (a == 10){
                kondisi = false;
            }
        }while (kondisi); // jika true dia tidak bisa membaca dibawahnya tetapi bisa menghitung
        // jika false dia akan membaca yang ada dibawahnya tetapi tidak bisa menghitung
        System.out.println("ini adalah akhir program");
    }
}

