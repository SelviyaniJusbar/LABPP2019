import java.util.Scanner;
class P3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("masukkan angka ");
        int angka = sc.nextInt();
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka%i == 0){
                System.out.println(angka + " bukan bilangan prima");
                System.exit(0);
            }
        }
        System.out.println(angka + " bilangan prima");
    }
}