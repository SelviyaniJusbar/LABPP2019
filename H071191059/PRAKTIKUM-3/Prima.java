import java.util.Scanner;
class Prima {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int angka = sc.nextInt();
    int a=0;
    int b=0;
    
    for (a = 2; a*a<=angka ; a++) {
        if (angka%a==0) {
            System.out.println(angka + " Bukan prima");
            b=1;
            return;
        }   
            if (b==0 && angka != 1 && angka != 0 && angka>0) {
                System.out.println(angka + " Prima");
                return;
            } else {
                System.out.println(angka + " Bukan prima");
            }
        } 
    }
}