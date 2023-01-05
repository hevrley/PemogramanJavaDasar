package chapter5_loop.latihan;

public class latihanWhileLoopDasar {
    public static void main(String[] args) {


        // while loop (dasar)

        int a = 0;
        boolean kondisi = true;
        System.out.println("Awal program");

        while (kondisi){ // kondisi/true

            System.out.println("while loop ke-" + a);

            // jika a++ diatas = 1 - 9

            if (a == 10){
                kondisi = false;
            }
            a++; // Jika a++ di bawah = 1 - 10
        }
        System.out.println("akhir dari program");
    }
}
