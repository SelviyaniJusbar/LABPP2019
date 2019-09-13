import java.util.Scanner;
public class tugas6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("uang = Rp. ");
        int uang = sc.nextInt();
       
        System.out.println("jumlah uang Rp.100.000 = "+uang/100000);
        System.out.println("jumlah uang Rp.50.000 = "+uang/50000);
        System.out.println("jumlah uang Rp.20.000 = "+uang/20000);
        System.out.println("jumlah uang Rp.10.000 = "+uang/10000);
        System.out.println("jumlah uang Rp.5000 = "+uang/5000);
        System.out.println("jumlah uang Rp.2000 = "+uang/2000);
        System.out.println("jumlah uang Rp.1000 = "+uang/1000);



    }
}