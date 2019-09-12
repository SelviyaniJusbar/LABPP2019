//NAMA : MUHAMMAD FAJRI RASID
// NIM : H071191051

import java.util.Scanner;

public class Tugas1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" >>>>> SOAL PRAKTIKUM 1 <<<<< ");
        int waktu = sc.nextInt();
        int kecRata2 = sc.nextInt();
        
        double Hasil = ((waktu*kecRata2)/14f);
        System.out.printf("Bensin yang dihabiskan = %.3f Liter \n",Hasil);

        
    }
}