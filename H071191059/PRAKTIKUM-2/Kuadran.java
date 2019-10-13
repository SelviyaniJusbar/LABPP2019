import java.util.Scanner;
class Kuadran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x==0 && y==0) {
            System.out.println("Koordinat berada di titik pusat");
        } else if (x<0 && y>0) {
            if (x+y<0) {
                System.out.println("Koordinat berada pada kuadran 1");
            } else if (x+y>0) {
                System.out.println("Koordinat berada pada kuadran 2");
            } else {
                System.out.println("Koordinat berada pada berada pada garis -x = y");
            }
        } else if (x>0 && y>0) {
            if (x+y<0) {
                System.out.println("Koordinat berada pada kuadran 3");
            } else if (x-y>0) {
                System.out.println("Koordinat berada pada kuadran 4");
            } else {
                System.out.println("Koordinat berada pada berada pada garis x = y");
            }
        } else if (x>0 && y<0) {
            if (x+y<0) {
                System.out.println("Koordinat berada pada kuadran 5");
            } else if (x+y>0) {
                System.out.println("Koordinat berada pada kuadran 6");
            } else {
                System.out.println("Koordinat berada pada berada pada garis x = -y");
            }
        } else if (x<0 && y<0) {
            if (x+y>0) {
                System.out.println("Koordinat berada pada kuadran 7");
            } else if (x-y>0) {
                System.out.println("Koordinat berada pada kuadran 8");
            } else {
                System.out.println("Koordinat berada pada berada pada garis -x = -y");
            }
        } else if (x==0 && y>0) {
            System.out.println("Koordinat berada pada garis +y");
        } else if (x==0 && y<0) {
            System.out.println("Koordinat berada pada garis -y");
        } else if (x>0 && y==0) {
            System.out.println("Koordinat berada pada garis +x");
        } else if (x<0 && y==0) {
            System.out.println("Koordinat berada pada garis -x");
        }
        sc.close();
    } 
}
