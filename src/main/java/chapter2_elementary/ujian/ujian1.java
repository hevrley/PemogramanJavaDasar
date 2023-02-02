package chapter2_elementary.ujian;
import java.util.Scanner ;
public class ujian1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tinggi alas segitiga siku siku adalah : ");
        double as = input.nextDouble();

        System.out.print("Alas segitiga siku siku adalah : ");
        double ts = input.nextDouble();

        System.out.print("tinggi prisma segitiga siku siku adalah : ");
        double tp = input.nextDouble();

        double a = (Math.pow((as/2),2));
        double b = (Math.pow(ts,2));
        double c = (a + b);
        double d = (Math.pow(c, 0.5));
        double ks = ((2 * d) + as);

        double volume = (as * ts * 1/2) * tp;
        double luasPermukaan = (2 * 1/2 * as * ts) + (ks * tp);


        System.out.println("the ks is "+  ks + " cm \nand Luas permukaanya is "+ luasPermukaan +" cm " );
        System.out.println("the volume is " + volume);
    }
}

