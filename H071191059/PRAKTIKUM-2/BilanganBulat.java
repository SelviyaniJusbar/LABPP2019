import java.util.InputMismatchException;
import java.util.Scanner;
class BilanganBulat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int genap = 0, ganjil = 0, positif = 0, negatif = 0;

        try {
            genap = (a %2==0 ? 1 : 0) + (b %2==0 ? 1 : 0) + (c %2==0 ? 1 : 0) + (d %2==0 ? 1 : 0) + (e %2==0 ? 1 : 0);
            ganjil =  (a %2==1 ? 1 : 0) + (b %2==1 ? 1 : 0) + (c %2==1 ? 1 : 0) + (d %2==1 ? 1 : 0) + (e %2==1 ? 1 : 0);
            positif = (a > 0 ? 1 : 0) + (b > 0 ? 1 : 0) +  (c > 0 ? 1 : 0) + (d > 0 ? 1 : 0) + (e > 0 ? 1 : 0);
            negatif = (a < 0 ? 1 : 0) + (b < 0 ? 1 : 0) + (c < 0 ? 1 : 0) + (d < 0 ? 1 : 0) + (e < 0 ? 1 : 0);    
            
            System.out.println(genap + " angka genap");
            System.out.println(ganjil + " angka ganjil");
            System.out.println(positif + " angka positif");
            System.out.println(negatif + " angka negatif");
        
        } catch (InputMismatchException ime) {
            System.out.println("Invalid input");
        } 
        sc.close();
    } 
}