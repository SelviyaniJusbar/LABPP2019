import java.util.Scanner;
class RelatifPrima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int [n];

        for (int i = 0 ; i < array.length ; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0 ; i < array.length ; i++) {
            for (int j = (i + 1) ; j < array.length ; j++) {
                int a = array[i]; // 2 dibandingkan
                int b = array[j]; // 7
                int fpb = 0;
                for (int k = 1 ; k <= Math.min(a, b) ; k++) { // batasnya diambil yg terkecil
                    if (a % k == 0 && b % k == 0) {
                        fpb += k;
                    }
                }
                if (fpb == 1) {
                    System.out.println(a + " " + b);
                }
            }
        }
        sc.close();
    }
}