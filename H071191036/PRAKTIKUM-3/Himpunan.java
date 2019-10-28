import java.util.Scanner;
public class Himpunan {

    public static void main(String[] args) {
        Scanner bay=new Scanner(System.in);
        long n = bay.nextInt();
        long n1 = 0;
        long n2 = 1;
        long hasil = 0;
    

        for (int i = 1; i < n; i++) {
            System.out.print(hasil + " ");
            n1 = n2;
            n2 = hasil;
            hasil = n1+n2;
        }
        
        if (n <=0){
            System.out.println("tidak boleh < 1");
        }
    }
}