import java.util.Scanner;
public class P3_4 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("Harga Barang");
       
        int tunai = sc.nextInt();
        System.out.println("Jumlah Uang Yang Di Bayarkan");
        int harga = sc.nextInt();
        int kembalian = tunai-harga;
        int uang = 0;
        int sisa = 0;

        for (int i = 1; i <= 7; i++) {
            switch (i) {
                case 1 : 
                uang = kembalian /100000;
                System.out.println(uang+ " uang Rp.100.000");
                break;
                case 2 : 
                sisa = kembalian - (uang * 100000);
                uang  = sisa/50000;
                System.out.println(uang+ " uang Rp. 50.000");
                break;
                case 3 :
                sisa = sisa - (uang * 50000);
                uang = sisa / 20000;
                System.out.println(uang+ " uang Rp. 20.000");
                break;
                case 4 :
                sisa = sisa - (uang * 20000);
                uang = sisa/10000; 
                System.out.println(uang + " uang Rp. 10.000");
                break;
                case 5 :
                sisa = sisa - (uang * 10000);
                uang = sisa/5000;
                System.out.println(uang+ " uang Rp. 5.000");
                break;
                case 6 :
                sisa = sisa - (uang * 5000);
                uang = sisa/2000;
                System.out.println(uang+ " uang Rp. 5.000");
                break;
                case 7 :
                sisa = sisa - (uang * 2000);
                uang = sisa/1000;
                System.out.println(uang+ " uang Rp. 1.000");

            }
        }
    }
}