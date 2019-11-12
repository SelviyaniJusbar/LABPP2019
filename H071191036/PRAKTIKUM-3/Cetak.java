import java.util.Scanner;
public class Cetak {

    public static void main(String[] args) {
        Scanner bay = new Scanner(System.in);
        int x = bay.nextInt();
        int y = bay.nextInt();
        int i = 0;
        while (i < y){
            if (i % x == 0){
                System.out.println();
            }
            i++;
            System.out.printf("%d ",i);
        }
    }
}