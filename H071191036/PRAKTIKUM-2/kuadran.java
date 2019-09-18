import java.util.Scanner;
/**
 * kuadran
 */
public class kuadran {

    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);
        System.out.print("titik x = ");
        int x = kd.nextInt();
        System.out.print("titik y = ");
        int y = kd.nextInt();

        if (x <0 && y >0){
            if (x+y < 0){
                System.out.println("titik"+"("+x+","+y+")"+ "kuadran 1");
            } 
            else if (x+y >0){
                System.out.println("titik"+"("+x+","+y+")"+ "kuadran 2");
            }
            else {
                System.out.println("terletak pada garis"+"-x=y");
            }
        }
        else if (x>0 && y>0){
            if (y>x){
                System.out.println("titik"+"("+x+","+y+")"+ "kuadran 3");
            }
            else if (x>y){
                System.out.println("titik"+"("+x+","+y+")"+ "kuadran 4");
            }
            else{
                System.out.println("terletak pada garis"+"x=y");
            }
        }
        else if (x>0 && y<0){
            if (x+y>0){
                System.out.println("titik"+"("+x+","+y+")"+ "kuadran 5");
            }
            else if (x+y<0){
                System.out.println("titik"+"("+x+","+y+")"+ "kuadran 6");
            }
            else{
                System.out.println("terletak pada garis"+"x=-y");
            }
        }
        else if (x<0 && y<0){
            if (y<x){
                System.out.println("titik"+"("+x+","+y+")"+ "kuadran 7");
            }
            else if (x<y){
                System.out.println("titik"+"("+x+","+y+")"+ "kuadran 8");
            }
            else {
                System.out.println("terletak pada garis"+"-x=-y");
            }
        }
        else if (x==0 && y >0){
            System.out.println("garis x");
        }
        else if (x>0 && y == 0){
            System.out.println("garis y");
        }
        else if (x==0 && y<0){
            System.out.println("garis x");
        }
        else if (x<0 && y==0){
            System.out.println("garis y");
        }
        else{
            System.out.println("titik 0,0");
        }

    }
}