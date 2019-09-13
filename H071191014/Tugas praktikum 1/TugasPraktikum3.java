import java.util.Scanner;

class TugasPraktikum3 {
    public static void main(String args[]){
        System.out.println("   MENGHITUNG PANJANG KAPAL   ");
        Scanner qal = new Scanner(System.in);
        System.out.print("ketinggian menara : ");
        double h = qal.nextDouble();

        System.out.print("sudut elevasi terhadap ujung depan kapal : ");
        double a = qal.nextDouble();

        System.out.print("sudut elevasi terhadap ujung belakang kapal : ");
        double b = qal.nextDouble();

        double sudut1, sudut2, alas1, alas2, panjang;
        sudut1 = Math.tan(Math.toRadians(a));
        alas1 = sudut1*h;
        sudut2 = Math.tan(Math.toRadians(b));
        alas2 = sudut2*h;
        panjang = alas1-alas2;
        System.out.printf("panjang kapal adalah : %.1f M", panjang);
    }
}

