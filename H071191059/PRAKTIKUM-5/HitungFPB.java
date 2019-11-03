import java.util.Scanner;
class HitungFPB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1, input2;
        input1 = sc.nextInt();
        input2 = sc.nextInt();
        nilaiFPB (input1, input2);
        sc.close();
    }
    static void nilaiFPB(int input1, int input2) {
        System.out.printf("FPB dari " + input1 + " dan " + input2 + " = %d " , cariFPB(input1 ,input2));
    }
    
    static int cariFPB (int input1, int input2) {
        int fpb = 0;
        for (int i = 1 ; i <= Math.max(input1, input2); i++) {
            if (input1 % i == 0 && input2 % i == 0) {
                fpb = i;
            }
        }
        return fpb;
    }
}