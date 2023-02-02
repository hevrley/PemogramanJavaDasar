package chapter2_elementary.ujian;
import java.util.Scanner ;
public class ujian2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("masukan nilai rupiah : ");

        double rupiah = input.nextDouble();

        double dolar = rupiah / 15665.5;

        System.out.print( (int)rupiah + " rupiah adalah ");
        System.out.printf("%.2f", dolar);
        System.out.print(" dolar ");

    }
}

