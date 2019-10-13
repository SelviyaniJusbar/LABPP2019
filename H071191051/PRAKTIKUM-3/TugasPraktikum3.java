//Nama : Muhammad Fajri Rasid
//NIM  : H071191051
import java.util.Scanner;

public class TugasPraktikum3{
    public static void main(String []args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan Angka = ");
        int x = userInput.nextInt();
        int y = userInput.nextInt();
        userInput.close();
        if (x<y){
            for (int a = x ; a<=y ; a++){
                if (a%2!=0 && a<0){
                    System.out.print("\n" + a + " Ganjil Negatif");
                }else if (a%2==0 && a<0){
                    System.out.print("\n" + a + " Genap Negatif");
                }
                if (a%2==1 && a>0){
                    System.out.print("\n" + a + " Ganjil Positif");
                }else if (a%2==0 && a>0){
                    System.out.print("\n" + a + " Genap Positif");
                }
                if (a==0){
                    System.out.print("\n" + a + " nol");
                }
            }
        }
        if (x>y){
            for (int a = y ; a<=x ; a++){
                if (a%2!=0 && a<0){
                    System.out.print("\n" + a + " Ganjil Negatif");
                }else if (a%2==0 && a<0){
                    System.out.print("\n" + a + " Genap Negatif");
                }
                if (a%2==1 && a>0){
                    System.out.print("\n" + a + " Ganjil Positif");
                }else if (a%2==0 && a>0){
                    System.out.print("\n" + a + " Genap Positif");
                }
                if (a==0){
                    System.out.print("\n" + a + " nol");
                } 
            }
        }
    }
}
        
