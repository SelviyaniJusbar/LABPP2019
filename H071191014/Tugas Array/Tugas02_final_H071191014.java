import java.util.Scanner;
class Tugas02_final_H071191014{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nila p = ");
        int p = scan.nextInt();
        System.out.println("nilai q = ");
        int q = scan.nextInt();
        System.out.println("nilai r = ");
        int r = sca.nextInt();
        System.out.println("nilai s");
        int s = scan.nextInt();
        int [][] A = new int [p][q];
        int [][] B = new int [r][s];
        System.out.println("masukkan matriks A");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print("Unsur " + "[" + i + "," + j + "] = ");
                A[i][j] = scan.nextInt();
            }
        }
        System.out.println("masukkan matriks B");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print("Unsur " + "[" + i + "," + j + "] = ");
                B[i][j] = scan.nextInt();
            }
        }
        if ( p == s){
            System.out.println("matriks A * B");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < r; j++) {
                int kew = 0;
                for (int k = 0; k < q; k++) {
                    kew += A[i][k] * B[k][j];
                }
                System.out.print(kew + " ");
            }
            System.out.println();
        }
        System.out.println("matriks B * A");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < q; j++) {
                int kew = 0;
                for (int k = 0; k < s; k++) {
                    kew += B[i][k] * A[k][j];
                }
                System.out.print(kew + " ");
            }
            System.out.println();
        }
        }else {
            System.out.println("tidak bisa di perkalikan");
            System.out.println("syarat bila baris matriks awal tidak sama dengan kolom matriks kedua maka tak bisa dikalikan");
        }
    }
}
