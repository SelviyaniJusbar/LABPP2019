import java.util.Scanner;
class Himpunan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long n1 = 0; //n
        long n2 = 1; //n1
        long hasil = 0; //n2

        for (int i = 1; i<=n ; i++) {
            n1 = n2;
            n2 = hasil;
            System.out.print(hasil + " ");
            hasil = n1+n2;
        }
        if (n<=0) {
                System.out.println("inputan tidak boleh kurang dari 1");
            }

        sc.close();
    }
}