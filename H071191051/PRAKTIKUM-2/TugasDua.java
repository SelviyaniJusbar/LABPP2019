//Nama : Muhammad Fajri Rasid
//NIM  : H071191051
import java.util.InputMismatchException;
import java.util.Scanner;

public class TugasDua{
    public static void main(String []args){
       Scanner userInput = new Scanner(System.in);
       try{
        int a = userInput.nextInt(), b = userInput.nextInt(), c = userInput.nextInt(), d = userInput.nextInt(), e = userInput.nextInt();
        userInput.close();
        int genap = 0, ganjil = 0, positif = 0, negatif = 0;
        
        genap = (a%2==0 ? 1 : 0) + (b%2==0 ? 1 : 0) + (c%2==0 ? 1 : 0) + (d%2==0 ? 1 : 0) + (e%2==0 ? 1 : 0);
        ganjil = (a%2!=0 ? 1 : 0) + (b%2!=0 ? 1 : 0) + (c%2!=0 ? 1 : 0) + (d%2!=0 ? 1 : 0) + (e%2!=0 ? 1 : 0);
        positif= (a>0 ? 1 : 0) + (b>0 ? 1 : 0) + (c>0 ? 1 : 0) + (d>0 ? 1 : 0) + (e>0 ? 1 : 0);
        negatif = (a<0 ? 1 : 0) + (b<0 ? 1 : 0) + (c<0 ? 1 : 0) + (d<0 ? 1 : 0) + (e<0 ? 1 : 0);
        
        System.out.println("Angka genap ada " + genap);
        System.out.println("Angka ganjil ada " + ganjil);
        System.out.println("Angka positif ada " + positif);
        System.out.println("Angka negatif ada " + negatif);
       }catch (InputMismatchException ime){
           System.out.println("Inputan tidak valid");
       }
    }
}