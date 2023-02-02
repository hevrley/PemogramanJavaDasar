package chapter2_elementary.ujian;

import java.util.Scanner ;
public class ujian3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number 1000 and 9999 : ");
        int masukan = input.nextInt();

        int satuan =  (masukan  % 10);
        int counterpuluhan = masukan  / 10;
        int puluhan = (counterpuluhan  % 10) ;
        int counterratusan = counterpuluhan / 10 ;
        int ratusan = (counterratusan % 10) ;
        int counterribuan = counterratusan / 10;
        int ribuan = (counterribuan  % 10);

        double u = satuan + puluhan + ratusan + ribuan;
        System.out.print( satuan + " : " + puluhan + " : " + ratusan + " : " + ribuan);
        System.out.print(" hasil dari konversisasi : "+(int) u);


    }
}
