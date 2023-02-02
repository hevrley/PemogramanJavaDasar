package chapter2_elementary.exercise;
import java.util.Scanner;

public class exercise6SumTheDigitsInAnInteger {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number 0 and 1000 : ");
        int masukan = input.nextInt();

        int satuan =  masukan  % 10;
        int puluhan =  (masukan / 10) % 10;
        int ratusan = (masukan / 100) % 10;

        double hasil = satuan + puluhan + ratusan;

        System.out.print("The sum of the digits is : "+(int) hasil);


    }
}
