import java.util.Scanner;

class TugasPraktikum1 {
    public static void main(String args[]){
        System.out.println("   MENGHITUNG JUMLAH BENSIN YANG DIGUNAKAN   ");
        Scanner az = new Scanner(System.in);
        System.out.print("input waktu : ");
        int waktu = az.nextInt();
        System.out.print("input kecepatan : ");
        int kec = az.nextInt();
        az.close();
        
        double z = 14;
        double x = waktu*kec;
        double y = x/z;
        System.out.printf("Total bensin yang digunakan : %.3f L", y);
    }
}