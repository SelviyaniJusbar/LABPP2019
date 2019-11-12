import java.util.Scanner;
/**
 * Modul2
 */
public class Modul2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int arr1 [][] = new int [a][b] ,  arr2 [][] = new int [b][c],  arr3 [][] = new int [a][c];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr1 [i][j] = sc.nextInt();   
            }
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < c; j++) {
                arr2 [i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                arr3 [i][j] = 0;
                for (int k = 0; k < b; k++) {
                    arr3 [i][j] += arr1 [i][k] * arr2 [k][j];
                }
                System.out.println(arr3[i][j] + "\t");
            }
            System.out.println();
        }

    }
}