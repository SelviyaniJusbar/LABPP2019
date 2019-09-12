//soal kapal dan menara

import java.util.Scanner;
class TP3 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        // h = tinggi menara
        // a = sudut elevasi pengamat terhadap ujung depan kapal
        // b = sudut elevasi pengamat terhadap ujung belakang kapal

        float h = sc.nextFloat();
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        double sudut1 = (Math.tan(Math.toRadians(a))*h);      
        double sudut2 = (Math.tan(Math.toRadians(b))*h);
        double hasil = sudut1-sudut2;

        System.out.printf("Panjang kapal adalah %.1f m" , hasil);
        
        sc.close();
    }
}