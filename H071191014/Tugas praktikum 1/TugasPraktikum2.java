import java.util.Scanner;

class TugasPraktikum2 {
    public static void main(String args[]){
        System.out.println("   MENGOVERSI DETIK KE JAM, MENIT, DAN DETIK   ");
        Scanner qal = new Scanner(System.in);
        System.out.print("input nilai : ");
        int x = qal.nextInt();

        int jam, menit, detik;
        jam= x/3600;
        x= x-(jam*3600);
        menit= x/60;
        detik= x-menit*60;

        System.out.println(jam+ ":"+menit+":"+detik);
    }
}