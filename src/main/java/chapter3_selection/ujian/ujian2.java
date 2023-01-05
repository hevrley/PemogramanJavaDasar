package chapter3_selection.ujian;

import java.util.Scanner;

public class ujian2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nama bulan dalam bahasa Indonesia : ");
        String bulan = input.next();

        System.out.println("Masukan Tahun: ");
        int tahun = input.nextInt();

        boolean kabisat = (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);

        switch (bulan) {
            case "JANUARI":
                System.out.println("Pada bulan Januari tahun " + tahun + " ada" +
                        ((kabisat) ? " 31 hari \ntahun ini merupakan tahun kabisat " : " 31 hari \ntahun ini bukan merupakan tahun kabisat"));
                break;
            case "FEBRUARI":
                System.out.println("Pada bulan Februari tahun " + tahun + " ada" +
                        ((kabisat) ? " 29 hari \ntahun ini merupakan tahun kabisat " : " 28 hari \ntahun ini bukan merupakan tahun kabisat"));
                break;
            case "MARET":
                System.out.println("Pada bulan Maret tahun " + tahun + " ada" +
                        ((kabisat) ? " 31 hari \ntahun ini merupakan tahun kabisat " : " 31 hari \ntahun ini bukan merupakan tahun kabisat"));
                break;
            case "APRIL":
                System.out.println("Pada bulan April tahun " + tahun + " ada" +
                        ((kabisat) ? " 30 hari \ntahun ini merupakan tahun kabisat " : " 30 hari \ntahun ini bukan merupakan tahun kabisat"));
                break;
            case "MEI":
                System.out.println("Pada bulan Mei tahun " + tahun + " ada" +
                        ((kabisat) ? " 31 hari \ntahun ini merupakan tahun kabisat " : " 31 hari \ntahun ini bukan merupakan tahun kabisat"));
                break;
            case "JUNI":
                System.out.println("pada bulan Juni " + tahun + " ada" +
                        ((kabisat) ? " 30 hari \ntahun ini merupakan tahun kabisat " : " 30 hari \ntahun ini bukan merupakan tahun kabisat"));
                break;
            case "JULY":
                System.out.println("pada bulan Juli " + tahun + " ada" +
                        ((kabisat) ? " 31 hari \ntahun ini merupakan tahun kabisat " : " 31 hari \ntahun ini bukan merupakan tahun kabisat"));
                break;
            case "AGUSTUS":
                System.out.println("pada Agustus tahun " + tahun + " ada" +
                        ((kabisat) ? " 31 hari \ntahun ini merupakan tahun kabisat " : " 31 hari \ntahun ini bukan merupakan tahun kabisat"));
                break;
            case "SEPTEMBER":
                System.out.println("pada September tahun " + tahun + " ada" +
                        ((kabisat) ? " 30 hari \ntahun ini merupakan tahun kabisat " : " 30 hari \ntahun ini bukan merupakan tahun kabisat"));
                break;
            case "OKTOBER":
                System.out.println("pada Oktober tahun" + tahun + " ada" +
                        ((kabisat) ? " 31 hari \ntahun ini merupakan tahun kabisat " : " 31 hari \ntahun ini bukan merupakan tahun kabisat"));
                break;
            case "NOVEMBER":
                System.out.println("pada November tahun" + tahun + " ada" +
                        ((kabisat) ? " 30 hari \ntahun ini merupakan tahun kabisat " : " 30 hari \ntahun ini bukan merupakan tahun kabisat"));
                break;
            case "DESEMBER":
                System.out.println("pada December tahun" + tahun + " ada" +
                        ((kabisat) ? " 31 hari \ntahun ini merupakan tahun kabisat " : " 31 hari \ntahun ini bukan merupakan tahun kabisat"));
        }
    }
}

