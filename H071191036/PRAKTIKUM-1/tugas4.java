import java.util.Scanner;
public class tugas4 {

    public static void main(String[] args) {
        Scanner key =new Scanner(System.in);

        System.out.println("-----berat badan ideal-----");
        System.out.print("nama = ");
        String nama = key.nextLine();
        System.out.print("tinggi badan = ");
        double tinggi = key.nextDouble();
        System.out.print("berat = ");
        double berat = key.nextDouble();
        System.out.print("persentase L = 10%,P = 15% =   ");
        double jk = key.nextDouble();

        double persen = jk / 100;
        double berat1 = (tinggi-100);
        double berat2 = persen * berat1;
        double ideal = berat1-berat2;
        double hasil = ideal - berat;

        System.out.println("-----informasi------");
        System.out.println("nama = "+nama);
        System.out.println("tinggi badan = "+tinggi);
        System.out.println("berat badan = "+berat+ "kg");
        System.out.println("berat badan ideal = "+ideal+ " kg");
        System.out.println("target ideal = "+hasil+ " kg");



    }
}