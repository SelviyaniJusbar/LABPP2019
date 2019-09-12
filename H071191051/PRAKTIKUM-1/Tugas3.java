//NAMA : MUHAMMAD FAJRI RASID
// NIM : H071191051

import java.util.Scanner;

public class Tugas3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" >>>>> SOAL PRAKTIKUM 3 <<<<< ");
        double h, a, b, x1, x3, panjangKapal;

        System.out.print(" h = ");
        h = sc.nextDouble();
        System.out.print(" a = ");
        a = sc.nextDouble();
        System.out.print(" b = ");
        b = sc.nextDouble();

        x1 = (Math.tan(Math.toRadians(b))*h);
        x3 = (Math.tan(Math.toRadians(a))*h);
        panjangKapal = (x3 - x1);
        System.out.printf("Panjang kapal = %.1f Meter \n",panjangKapal);

    }
}