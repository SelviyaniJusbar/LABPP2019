import java.util.Scanner;
/**
 * Barang
 */
public class Barang {

    public static void main(String[] args) {
        Scanner bay = new Scanner(System.in);
        System.out.println("harga barang = ");
        int harga = bay.nextInt();
        System.out.println("uang = ");
        int uang = bay.nextInt();
        int kembalian = uang - harga;
        System.out.println("kembalian = "+kembalian);
        for (int i = 0; i <= kembalian; i++) {
            switch(i){
                case 1 :
                int a = (kembalian/100000);
                kembalian = (kembalian-(100000*a));
                System.out.println(a + " uang Rp 100.000");
                break;
                case 2 :
                int b = (kembalian/50000);
                kembalian = (kembalian-(50000*b));
                System.out.println(b + " uang Rp 50.000");
                break;
                 case 3 :
                int c = (kembalian/20000);
                kembalian = (kembalian-(20000*c));
                System.out.println(c + " uang Rp 20.000");
                break;
                 case 4 :
                int d = (kembalian/10000);
                kembalian = (kembalian-(10000*d));
                System.out.println(d + " uang Rp 10.000");
                break;
                 case 5 :
                int e = (kembalian/5000);
                kembalian = (kembalian-(5000*e));
                System.out.println(e + " uang Rp 5.000");
                break;
                 case 6 :
                int f = (kembalian/2000);
                kembalian = (kembalian-(2000*f));
                System.out.println(f + " uang Rp 2.000");
                break;
                 case 7 :
                int g = (kembalian/1000);
                kembalian = (kembalian-(1000*g));
                System.out.println(g + " uang Rp 1.000");
                break;
            }
        }
    }
}