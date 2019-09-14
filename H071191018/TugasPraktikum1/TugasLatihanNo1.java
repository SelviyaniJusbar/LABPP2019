import java.util.Scanner;

public class TugasLatihanNo1 {
	public static void main(String[] args ) {
		Scanner code = new Scanner(System.in);
		
		System.out.println("masukkan nama\t :");
		String nama = code.nextLine();
		
		System.out.println("masukkan tinggi\t :");
		int tinggiBadan = code.nextInt();
		
		System.out.println("masukkan berat\t :");
		int beratBadan = code.nextInt();
		
		System.out.println("masukkan persentase\t : ...%");
		float persentase  = code.nextFloat() / 100;
		code.close();
		
		float ideal1 = (tinggiBadan-100);
		float ideal2 = ideal1- (persentase/100*ideal1);
		float ideal3 = ideal2 - beratBadan ;
		System.out.println("Informasi") ;
		System.out.println("Nama : " + nama ) ;
		System.out.println("Tinggi Badan : " + tinggiBadan ) ;
		System.out.println("Berat Badan : " + beratBadan ) ;
		System.out.println("Berat Badan Ideal Anda : " ) ;
		System.out.printf("Target Berat Badan Ideal Anda : %.1f " ,ideal3) ; 
		
	}
}