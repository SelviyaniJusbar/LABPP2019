import java.util.Scanner;

public class TugasPraktikumNo2 {
	public static void main(String[] args){
		
		Scanner ac = new Scanner(System.in);
		System.out.printf (" Input Nilai :");
		int x = ac.nextInt();
		
		int jam, menit, detik;
		jam = x/3600;
		x = x - (jam*3600);
		menit = x/60 ;
		detik = x - menit*60;
		
		System.out.println(jam+ ":" +menit+ ":" +detik);
	}
}