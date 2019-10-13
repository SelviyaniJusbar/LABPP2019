import java.util.Scanner;
class AngkaXY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); //horizontal
        int y = sc.nextInt(); //vertikal
        int i = 0;

        while (i<y) { //batas akhir
            if (i %x==0) {
                System.out.println();
            }
            i++;
            System.out.printf("%d " , i);
        }
        sc.close();
    }
}