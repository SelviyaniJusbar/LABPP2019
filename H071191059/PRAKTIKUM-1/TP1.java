//jumlah liter bensin yang digunakan untuk perjalanan

import java.util.Scanner;
class TP1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int efisiensi = 14;
        
        System.out.print("Input waktu tempuh\t :");
        double waktu_tempuh = sc.nextDouble();
        
        System.out.print("Input kecepatan rata\t :");
        double kecepatan_rata = sc.nextDouble(); 
        
        double hasil = (waktu_tempuh*kecepatan_rata)/efisiensi;
        System.out.printf("Bensin yang digunakan sebanyak %.3f L" , hasil);
        
        sc.close();
    }
}