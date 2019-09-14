import java.util.Scanner;

public class PraktikumNo1 {
	public static void main(String[] args){
		
		Scanner cuk = new Scanner (System.in);
		
		double efisiensi = 14 ;
		
		System.out.printf( "Waktu Tempuh\t:");
		int WaktuTempu = cuk.nextInt();
		
		System.out.printf("percepatan\t:");
		int percepatan = cuk.nextInt();
		
		double hasil = (percepatan*WaktuTempu)/efisiensi ;
		
		System.out.printf("Bensin yang digunakan %.3f" , hasil ) ;
		
	}
	
}