//Nama : Muhammad Fajri Rasid
//NIM  : H071191051
import java.util.Scanner;

public class TugasPraktikum6{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Harga Barang = ");
        int harga = userInput.nextInt();
        System.out.print("Jumlah Uang = ");
        int jumlahUang = userInput.nextInt();
        userInput.close();
        int n100 = 0;
        int n50 = 0;
        int n20 = 0;
        int n10 = 0;
        int n5 = 0;
        int n2 = 0;
        int n1 = 0;
        int sisaUang = jumlahUang-harga;
        while(sisaUang>=1000){
            if(sisaUang>=100000){
                sisaUang-=100000;
                n100++;
            }else if(sisaUang>=50000){
                sisaUang-=50000;
                n50++;
            }else if(sisaUang>=20000){
                sisaUang-=20000;
                n20++;
            }else if(sisaUang>=10000){
                sisaUang-=10000;
                n10++;
            }else if(sisaUang>=5000){
                sisaUang-=5000;
                n5++;
            }else if(sisaUang>=2000){
                sisaUang-=2000;
                n2++;
            }else{
                n1++;
            }
        }
        System.out.print(n100 + " uang Rp.100.000\n");
        System.out.printf("%d uang Rp.50.000 \n",n50);
        System.out.printf("%d uang Rp.20.000 \n",n20);
        System.out.printf("%d uang Rp.10.000 \n",n10);
        System.out.printf("%d uang Rp.5.000 \n",n5);
        System.out.printf("%d uang Rp.2.000 \n",n2);
        System.out.printf("%d uang Rp.1.000 \n",n1);
    }
}