//NAMA : MUHAMMAD FAJRI RASID
// NIM : H071191051

import java.util.Scanner;

public class Tugas2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" >>>>> SOAL PRAKTIKUM 2 <<<<< ");
        int detik = sc.nextInt();
        
        int jam = (detik / 3600);
        int sisa = (detik % 3600);
        int menit = (sisa / 60);

        sisa = (sisa % 60);
        
        System.out.printf("%02d:%02d:%02d \n",jam,menit,sisa);
    }
}