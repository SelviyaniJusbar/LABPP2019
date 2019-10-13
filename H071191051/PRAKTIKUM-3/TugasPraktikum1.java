//Nama : Muhammad Fajri Rasid
//NIM  : H071191051
import java.util.Scanner;

public class TugasPraktikum1{
    public static void main(String[] args){

    Scanner userInput = new Scanner (System.in);
    System.out.print("Masukkan Angka = ");
    int angka = userInput.nextInt();
    userInput.close();
    
    int jumlah = 0;
    boolean kondisi;

    for (int a=2 ; a<=angka ; a++){
        kondisi = true;
        for (int b=2 ; b<=(a/2) ; b++){
            if (a%b==0){
                kondisi = false;
                break;
            }
        }
        if (kondisi){
            System.out.print(a + " ");
            jumlah++;
        }
    }
    System.out.println("\nJumlah = " + jumlah);
    }
}