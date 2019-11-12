import java.util.Scanner;
public class Ganjil {

    public static void main(String[] args) {
        Scanner bay = new Scanner(System.in);
        int x = bay.nextInt();
        int y = bay.nextInt();

        for (int i = (x > y ? y : x); i <=(x > y ? x : y); i++) {
           System.out.print(i + ((i == 0 ) ? "" : (i % 2 == 0 ) ?  "genap " : " ganjil "));
          System.out.println(((i == 0 ) ? " nol " : (i<0) ? "negatif ": "positif ")+ "\n");
        }
    }
}
  