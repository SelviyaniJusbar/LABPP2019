//NAMA : MUHAMMAD FAJRI RASID
// NIM : H071191051

import java.util.Scanner;

public class Tugas6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" >>>>>> SOAL PRAKTIKUM 6 <<<<< ");
        System.out.print( " Masukkan jumlah uang = Rp.");
        int uang = sc.nextInt();

        int jumlahUang = (uang/100000);
        System.out.println(" Jumlah uang Rp.100.000 = " + jumlahUang);
        int sisa = (uang - (100000*jumlahUang));

        int jumlahUang2 = (sisa/50000);
        System.out.println(" Jumlah uang Rp.50.000 = " + jumlahUang2);
        int sisa2 = (sisa - (50000*jumlahUang2));

        int jumlahUang3 = (sisa2/20000);
        System.out.println(" Jumlah uang Rp.20.000 = " + jumlahUang3);
        int sisa3 = (sisa2 - (20000*jumlahUang3));

        int jumlahUang4 = (sisa3/10000);
        System.out.println(" Jumlah uang Rp.10.000 = " + jumlahUang4);
        int sisa4 = (sisa3 - (10000*jumlahUang4));
        
        int jumlahUang5 = (sisa4/5000);
        System.out.println(" Jumlah uang Rp.5000 = " + jumlahUang5);
        int sisa5 = (sisa4 - (5000*jumlahUang5));

        int jumlahUang6 = (sisa5/2000);
        System.out.println(" Jumlah uang Rp.2000 = " + jumlahUang6);
        int sisa6 = (sisa5 - (2000 * jumlahUang6));

        int jumlahUang7 = (sisa6/1000);
        System.out.println(" Jumlah uang Rp.1000 = " + jumlahUang7 );
        int sisa7 = (sisa6 - (1000 * jumlahUang7));

        int jumlahUang8 = (sisa7/500);
        int sisa8 = (sisa7 - (500 * jumlahUang8));
        int sisa9 = (sisa8/100);
        System.out.printf(" Tersisa %d uang Rp.500 dan %d uang Rp.100 \n",jumlahUang8,sisa9);
        
    }
}