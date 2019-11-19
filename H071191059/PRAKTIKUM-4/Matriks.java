import java.util.Scanner;
class Matriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int a[][] = new int [i][j];
        int b[][] = new int [j][k];

        System.out.println("Input nilai matriks A");
        for (int x = 0 ; x < i ; x++) {
            for (int y = 0 ; y < j ; y++) {
                a[x][y] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Input nilai matriks B");
        for (int x = 0 ; x < j ; x++) {
            for (int y = 0 ; y < k ; y++) {
                b[x][y] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Matriks A");
        for (int x = 0 ; x < i ; x++) {
            for (int y = 0 ; y < j ; y++) {
                System.out.print(a[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matriks B");
        for (int x = 0 ; x < j ; x++) {
            for (int y = 0 ; y < k ; y++) {
                System.out.print(b[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Hasil perkalian");
        for (int x = 0 ; x < i ; x++){
            for (int y = 0 ; y < k ; y++) {
                int sum = 0;
                for (int z = 0 ; z < j ; z++) {
                    sum += a[x][z] * b[z][y];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}