import java.util.Scanner;
public class tugas3 {

    public static void main(String[] args) {
       // h = ketinggian
       // a = sudut elevasi pengamat terhadap ujung kapal
       // b = sudut elevasi pengamat terhadap ujung belakang kapal 

       Scanner key=new Scanner(System.in);

       float h = key.nextFloat();
       float a = key.nextFloat();
       float b = key.nextFloat();
       
       double sudut = Math.tan(Math.toRadians(a));
       double alas = sudut*h;
       double sudut2 = Math.tan(Math.toRadians(b));
       double alas2 =sudut2*h;
       double panjang = alas-alas2;
       System.out.printf("panjang kapal = %.2f ", panjang);
    }
}