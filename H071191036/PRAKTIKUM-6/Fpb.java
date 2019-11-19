import java.util.Scanner;

class Fpb {
	// Hitung FPB
	static int calculateGCD(int a, int b) {
		int temp;

		while (b != 0) {
			temp = a % b;
			a = b;
			b = temp;
		}

		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		if (a <= 0) {
			System.out.println("Tidak ada input  (1)");
			return;
        }
        int b = sc.nextInt();
		if (b <= 0) {
			System.out.println("Tidak ada input (2)");
			return;
		}

		System.out.println("FPB dari " + a + " dan " + b + " = " + calculateGCD(a, b));
    }
}