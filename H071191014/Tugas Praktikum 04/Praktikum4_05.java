import java.util.Arrays;
import java.util.Scanner;
public class Praktikum4_05{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int o = scan.nextInt();
        int arr [][] = new int[m][n];
        int arr2 [][] = new int[n][o];
        System.out.println("Masukkan nilai matriks = ");
        for (int i=0 ; i<m ; i++){
            for (int j=0 ; j<n ; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<o ; j++){
                arr2[i][j] = scan.nextInt();
            }
        }
        printHasil(arr);
        System.out.println("dikali");
        printHasil(arr2);
        int baris1 = arr.length;
        int kolom1 = arr[0].length;
        int baris2 = arr2.length;
        int kolom2 = arr2[0].length;
        int[][] hasilKali = new int[baris1][kolom2];
        int sum;
        for(int i=0 ; i<baris1 ; i++){
            for(int j=0 ; j<kolom2 ; j++){
                sum=0;
                for(int k=0 ; k<kolom1 ; k++){
                    sum += arr[i][k] * arr2[k][j];
                }
                hasilKali[i][j] = sum;
            }
        }
        System.out.println("Hasil kali");
        printHasil(hasilKali);
    }
    private static void printHasil(int[][] dataArray){
        int baris = dataArray.length;
        int kolom = dataArray[0].length;
        for(int i=0 ; i<baris ; i++){
            System.out.print("[");
            for(int j=0 ; j<kolom ; j++){
                System.out.print(dataArray[i][j]);
                if(j<kolom-1){
                    System.out.print(", ");
                }else{
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
    }
}
