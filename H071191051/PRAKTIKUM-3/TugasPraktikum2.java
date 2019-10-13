//Nama : Muhammad Fajri Rasid
//NIM  : H071191051
import java.util.Scanner;

public class TugasPraktikum2{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int angka = userInput.nextInt();
        userInput.close();
        System.out.print(angka + " Faktorial = ");

        int jumlah = 1;
        int satu = 1;

        while (2 <= angka){
            jumlah = jumlah*angka;
            System.out.print(angka + " x ");
            angka--;
        }
        System.out.print(satu + " = " + jumlah);
    }
}