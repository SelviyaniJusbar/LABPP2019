import java.util.Scanner;

public class TugasLatihanNo2{
	public static void main(String[] args ){
		Scanner code = new Scanner(System.in);
		
		//int a = code.nextInt();
		//int b = code.nextInt();
		
		int b,a ;
		
		a = code.nextInt();
		b =  code.nextInt();
		
		code.close();
		
		boolean c = a % b == 0 || b % a == 0;
		
		System.out.println("apakah " + a + "kelipatan dari" +b+ "?" +c );
		System.out.printfln("apakah %d kelipatan dari %d ? %b" , a , b ,( a % b == 0 || b % a == 0 ));
		
	}
}	