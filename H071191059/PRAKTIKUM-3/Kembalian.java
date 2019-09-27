//uang kembalian (MODUL 3, nomor 4)

import java.util.Scanner;
class Kembalian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Harga barang\t = Rp ");
        int hargaBarang = sc.nextInt();
        System.out.print("Jumlah uang\t = Rp ");
        int uang = sc.nextInt();
        int kembalian = uang-hargaBarang;
        System.out.println("Uang kembalian\t = Rp " + kembalian);

        for (int i = 0; i<=kembalian ; i++) {
            switch (i) {
                case 1 :
                    int a = (kembalian/100000);
                    kembalian = (kembalian - (100000*a));
                    System.out.println(a + " uang Rp 100.000");
                case 2 :
                    int b = (kembalian/50000);
                    kembalian = (kembalian - (50000*b));
                    System.out.println(b + " uang Rp 50.000");
                case 3 :
                    int c = (kembalian/20000);
                    kembalian = (kembalian - (20000*c));
                    System.out.println(c + " uang Rp 20.000");
                case 4 : 
                    int d = (kembalian/10000);
                    kembalian = (kembalian - (10000*d));
                    System.out.println(d + " uang Rp 10.000");
                case 5 :
                    int e = (kembalian/5000);
                    kembalian = (kembalian - (5000*e));
                    System.out.println(e + " uang Rp 5.000");
                case 6 :
                    int f = (kembalian/2000);
                    kembalian = (kembalian - (2000*f));
                    System.out.println(f + " uang Rp 2.000");
                case 7 :
                    int g = (kembalian/1000);
                    kembalian = (kembalian - (1000*g));
                    System.out.println(g + " uang Rp 1.000");
                    break;
            }
        }
        sc.close();
    }
}