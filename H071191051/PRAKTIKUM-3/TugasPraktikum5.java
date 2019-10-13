//Nama : Muhammad Fajri Rasid
//NIM  : H071191051
import java.util.Scanner;

public class TugasPraktikum5{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan angka = ");
        int n = userInput.nextInt();
        userInput.close();

        int fn1, fn2;
        fn2 = 1;
        fn1 = 0;

        for (int i = 1 ; i <= n ; i++){
            System.out.print(fn1 + " ");
            int fn = fn1 + fn2;
            fn1 = fn2;
            fn2 = fn;
        }
    }
}