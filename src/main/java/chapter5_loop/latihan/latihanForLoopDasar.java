package chapter5_loop.latihan;

public class latihanForLoopDasar {
    public static void main(String[] args) {

        // for Loop dasar

        System.out.println("Ini adalah awal dari program ");

        System.out.println("program pertama");

        for (int nilai = 0 ; nilai <= 10 ; nilai++){

            System.out.println("for luop ke-" + nilai);

        }
        System.out.println("program kedua ");

        for (int nilai = 0 ; nilai < 10 ; nilai++){

            System.out.println("for luop ke-" + nilai);

        }

        System.out.println("program ketiga ");

        for (int nilai = 10 ; nilai >= 5 ; nilai--){

            System.out.println("for luop ke-" + nilai);

        }

        System.out.println("program keempat ");

        int nilai = 0;

        for (; nilai < 10 ;){

            System.out.println("for luop ke-" + nilai);
            nilai++;
        }

        System.out.println("ini adalah akhir program");
    }
}

