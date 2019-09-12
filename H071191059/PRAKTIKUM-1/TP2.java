import java.util.Scanner;
class TP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan detik\t : ");
        int jumlahDetik = sc.nextInt();
        
        // 1 jam = 60 menit = 3600 detik
        
        int jam, menit, detik;
        jam = jumlahDetik/3600;
        menit = (jumlahDetik%3600)/60;
        detik = (jumlahDetik%3600)-menit*60;
        System.out.println(jam + " : " + menit + " : " + detik);
    
        sc.close();
    }
}