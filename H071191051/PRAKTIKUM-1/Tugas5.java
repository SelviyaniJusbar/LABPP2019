//NAMA : MUHAMMAD FAJRI RASID
// NIM : H071191051

import java.util.Scanner;

public class Tugas5{
    public static void main(String[] args) {
        System.out.println(" >>>>> SOAL PRAKTIKUM 5 <<<<< ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean hasil = ( b % a == 0);

        System.out.printf("Apakah %d merupakan kelipatan %d ? %s \n",a,b,hasil);
    }
}