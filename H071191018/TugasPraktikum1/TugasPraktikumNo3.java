import java.util.Scanner;

public class TugasPraktikumNo3 {
	public static void main(String[] args ){
		Scanner cuk = new Scanner (System.in);
		
		System.out.print("Masukkan Ketinggian Menara\t : ");
		int h = cuk.nextInt();
		
		System.out.print("Masukkan Nilai sudut elevasi depan kapal\t : ");
		int a =  cuk.nextInt();
		
		System.out.print("Masukkan Nilai sudut elevasi belakang kapal\t : ");
		int  b = cuk.nextInt();
		
		cuk.close();
		
		// double sudut = (Math.tan(Math.toRadians(a) ))*h;
		// double sudut2 + (Math.tan(Math.toRadians(b) ))*h;
		
		double panjangkapal = ((Math.tan(Math.toRadians(a))) *h ) - ((Math.tan(Math.toRadians(b)))*h);
		
		System.out.printf("Panjang Kapal adalah  : %.1f M" , panjangkapal);
		
	}
}		