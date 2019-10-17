import java.util.Scanner;
import java.util.Arrays;
public class Praktikum4_04{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int jumlahNilai = userInput.nextInt();
        System.out.println("Masukkan nilai = ");
        int[] arr = new int[jumlahNilai];
        for(int i=0 ; i<jumlahNilai ; i++){
            arr[i] = userInput.nextInt();
        }
        for(int i=0 ; i<arr.length ; i++){
            for(int j=(i+1) ; j<arr.length ; j++){
                int a = arr[i];
                int b = arr[j];
                int fpb = 1;
                for(int k=1 ; k<=Math.min(a, b) ; k++){
                    if(a%k==0 && b%k==0){
                        fpb = k;
                    }
                }
                if(fpb==1){
                    System.out.println(a + " " + b);
                }
               // else if(fpb!=1){
               //     System.out.println("FPBnya bukan 1");
               // }
            }
        }
    }
}
