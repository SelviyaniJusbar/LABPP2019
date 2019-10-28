import java.util.Scanner;

public class TugasLatihan_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris = sc.nextInt();
        int kolom = sc.nextInt();
        int [][] arr = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                arr [i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}