import java.util.Scanner;
public class tugas1 {

    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int t=key.nextInt();
        int v=key.nextInt();
        double efisiensi=14;
        double bensin=t*v/efisiensi;

        System.out.printf("bensin yang digunakan =  %.3f L \n ",bensin);

    }
}