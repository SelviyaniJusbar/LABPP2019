import java.util.Scanner;
class GanjilGenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nilai awal = ");
        int x = sc.nextInt();
        System.out.print("Nilai akhir = ");
        int y = sc.nextInt();
            
        if (x > y) {
            int a = y;
            y = x;
            x = a;
        }

		for (int i = x; i <= y; i++) {
            if (i % 2 == 0 && i > 0) {
                System.out.println(i + " genap positif");
            } else if (i % 2 == 0 && i < 0) {
                System.out.println(i + " genap negatif");
            } else if (i % 2 != 0 && i > 0) {
                System.out.println(i + " ganjil positif");
            } else if (i % 2 != 0 && i < 0) {
                System.out.println(i + " ganjil negatif");
            } else {
                System.out.println(i + " nol");
            }
        }
        sc.close();
    }
}
