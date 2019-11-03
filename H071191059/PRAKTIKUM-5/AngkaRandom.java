import java.util.Scanner;
import java.util.Random;

class AngkaRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
        sc.close();
    }
    public static String generateSerial (int n, int m) {
        String str = "";
        String tes = " - ";
        Random angka = new Random();

        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                int a = angka.nextInt(10);
                str+=a;
            }
            if (i < n-1) {
                str += tes;
            }
        }
        return str;
    }
}