//NAMA : MUHAMMAD FAJRI RASID
// NIM : H071191051

import java.util.Scanner;

public class Tugas4{
    public static void main(String[] args) {
        System.out.println(" >>>>> SOAL PRAKTIKUM 4 <<<<< ");
        Scanner sc = new Scanner(System.in);
        System.out.print(" NAMA = ");
        String nama = sc.nextLine();
        System.out.print(" TINGGI BADAN = ");
        double tinggi = sc.nextDouble();
        System.out.print(" BERAT BADAN = ");
        double berat = sc.nextDouble();
        System.out.print(" PERSENTASI = 10 % atau 15% ? ");
        double persentasi = sc.nextDouble()/100;

        double beratIdeal1 = (tinggi - 100);
        double beratIdeal2 = (beratIdeal1 * persentasi);
        double beratIdeal3 = (beratIdeal1 - beratIdeal2);
        double target = (beratIdeal3 - berat);

	    System.out.printf(" Berat Badan Anda = %.1f Kg \n",berat);
        System.out.printf(" Berat badan ideal anda = %.2f Kg\n",beratIdeal3);
        System.out.printf(" Target berat badan ideal anda = %.1f Kg \n",target);


    }
}