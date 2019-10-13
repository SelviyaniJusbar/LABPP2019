import java.util.Scanner;
class Derajat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float M = sc.nextFloat(); // M = derajat
        
        int hari = 86400; //24 jam x 3600 detik
        int ss = (int) ((M*hari)/360);
        int hh = 6, mm = 0;

        while (ss >= 3600) {
            ss-=3600;
            hh++;
        } 
        while (ss >= 60) {
            ss-=60;
            mm++;
        }
        hh%=24;
        if (hh >= 5 && hh < 12) {
            System.out.println("Selamat Pagi");
        } else if (hh >= 12 && hh <= 14) {
            System.out.println("Selamat Siang");
        } else if (hh >= 15 && hh <= 18) {
            System.out.println("Selamat Sore");
        } else {
            System.out.println("Selamat Malam");
        }
        System.out.printf("%02d : %02d : %02d" , hh , mm, ss);

        sc.close();
    }
}