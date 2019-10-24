import java.util.Scanner;
class Prima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        
        if(angka < 1) {
            System.out.println("Inputan Anda tidak valid");
            return;
        }
        
        for (int a = 2 ; a*a <= angka ; a++) {
            if (angka % a == 0) {
                System.out.println(angka + " Bukan prima");
                return;
            }
        }
        System.out.println(angka + " Prima");
    }
}
