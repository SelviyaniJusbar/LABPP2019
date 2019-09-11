import java.util.Scanner;
public class tugas5 {

    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);

        int a=key.nextInt();
        int b=key.nextInt();

        boolean c=a%b == 0;
        boolean d=b%a == 0;
        boolean e=c || d;

        System.out.println("apakah "+a+" kelipatan dari "+b+" ? = "+e);
    }
}