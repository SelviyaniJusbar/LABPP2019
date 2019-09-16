import java.util.Scanner;

class TP3 { 
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        
    int a = key.nextInt();
    int b = key.nextInt();
    boolean c = (a%b == 0 || b%a == 0) && (a != 0 && b != 0);
    System.out.printf(" apakah %d keliptan %d ? %b" ,a,b,c);

    }
}