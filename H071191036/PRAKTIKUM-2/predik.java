import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * prediksi
 */
public class predik {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);    
      try{
        int a = key.nextInt();
        int b = key.nextInt();
        int c = key.nextInt();
        int d = key.nextInt();
        int e = key.nextInt();
      
        int  genap =0,ganjil = 0,positif = 0,negatif = 0;
 
      genap = (a%2==0 ? 1 : 0) + (b%2==0 ? 1 : 0) + (c%2==0 ? 1 : 0) + (d%2==0 ? 1 : 0) + (e%2==0 ? 1 : 0) ;
      ganjil =  (a%2==1 ? 1 : 0) + (b%2==1 ? 1 : 0) + (c%2==1 ? 1 : 0) + (d%2==1 ? 1 : 0) + (e%2==1 ? 1 : 0);
      positif = (a > 0 ? 1 :0 ) + (b > 0 ? 1 :0 ) + (c > 0 ? 1 :0 ) + (d > 0 ? 1 :0 ) + (e > 0 ? 1 :0 ) ;
      negatif = (a < 0 ? 1 :0 ) + (b < 0 ? 1 :0 ) + (c < 0 ? 1 :0 ) + (d < 0 ? 1 :0 ) + (e < 0 ? 1 :0 ) ;
      
      System.out.println(genap+" angka genap");
      System.out.println(ganjil+" angka ganjil");
      System.out.println(positif+" angka positif");
      System.out.println(negatif+" angka negatif");
    }catch (InputMismatchException ime){
        System.out.println("inputan tidak valid");
      }
        


        

    }
}