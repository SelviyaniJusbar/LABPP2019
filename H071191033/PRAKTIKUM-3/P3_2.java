import java.util.Scanner;
public class P3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Masukkan Nilai X : ");
        int x = sc.nextInt();
        System.out.println(" Masukkan Nilai Y : ");
        int y = sc.nextInt();

        for (int i = 1; i <= y; i++) {
            System.out.print(i + " ");
            
            if (i%x == 0) {
                System.out.println("\n");
            }
        }
    }
}