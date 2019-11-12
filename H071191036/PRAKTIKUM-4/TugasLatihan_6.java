import java.util.Scanner;

public class TugasLatihan_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int total1 = sc.nextInt();
        int [] arr1 = new int [total1];
        int totalarr1 = 0;
        
        for (int i = 0; i < arr1.length; i++){
            arr1 [i] = sc.nextInt();
            totalarr1 += arr1[i];
        }
        
        int total2 = sc.nextInt();
        int [] arr2 = new int [total2];
        int totalarr2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
            totalarr2 += arr2[i];
        }
       int hasil = totalarr1+totalarr2;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1 [i] == arr2 [j]){
                    hasil -= arr2[j];
                }
            }
        }

    
        System.out.println(hasil);
        
        


    }
}