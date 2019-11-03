import java.util.Scanner;
class Usia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        myDay(days);   
        sc.close(); 
    }
    static void myDay (int days) {
        System.out.println(tahun(days) + " tahun");
        System.out.println(bulan(days) + " bulan");
        System.out.println(hari(days) + " hari");
    }
    static int tahun (int days) {
        int tahun = days / 365;
        return tahun;
    }
    static int bulan (int days) {
        int bulan = (days % 365)/30;
        return bulan;
    }
    static int hari (int days) {
        int hari = (days % 365)%30;
        return hari;
    }
}