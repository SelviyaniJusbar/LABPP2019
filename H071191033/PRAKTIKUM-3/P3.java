import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Masukkan Nilai Awal");
        int x = sc.nextInt();
        System.out.println(" Masukkan Nilai Akhir");
        int y = sc.nextInt();

        if (x > y) {
            int t = x; x = y; y = t;
        }
        for (int i = x; i <= y; i++) {
            if (x==0) {
                System.out.println(" 0 ");
            }
            else {
                System.out.print(i);
                System.out.print(i%2 == 0? " Genap " : " Ganjil ");
                System.out.println(i<0? " Negatif " : " Positif ");
            }
        }
        sc.close(); 
        
    }
}