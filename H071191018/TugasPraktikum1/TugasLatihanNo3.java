import java.util.Scanner;

public class TugasLatihanNo3 {
	public static void main(String[] args ){
		Scanner data = new Scanner(System.in);
		
		System.out.printf("Masukkan Nominal Uang : RP. ");
		
		int a = data.nextInt();
		data.close();
		int b = a / 100000;
		int c = a % 100000;
		int d = c / 50000;
		int e = c % 50000;
		int f = e / 20000;
		int g = e % 20000;
		int h = g / 10000;
		int i = g % 10000;
		int j = i / 5000;
		int k = i % 5000;
		int l = k / 2000;
		int m = k % 2000;
		int n = m / 1000;
		
		System.out.println("Jumlah lembaran uang Rp.100.000 = " + b);
		System.out.println("Jumlah lembaran uang Rp.50.000 = " + d) ;
		System.out.println("Jumlah lembaran uang Rp.20.000 = " + f);
		System.out.println("Jumlah lembaran uang Rp.10.000 = " + h);
		System.out.println("Jumlah lembaran uang Rp.5.000 = " + j) ;
		System.out.println("Jumlah lembaran uang Rp.2.000 = " + i) ;
	    System.out.println("Jumlah lembaran uang Rp.1.000 = " + n) ;
		
		
	}
}