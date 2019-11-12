import java.util.Scanner;

class latihan1{
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        int n = yuk.nextInt();
        int[] arr = new int[n];
        double sum = 0;
        System.out.println("_______");
        System.out.println("| No | Data | Error |");
        System.out.println("_______");

        for(int i = 1; i < n; i++){
            arr[i] = i;
            sum += arr[i];
        }
        for(int i = 1; i < n; i++){
            arr[i] = i;
            double rata = sum / n;
            double error1 = rata - arr[i];
            double error = Math.sqrt(Math.pow(error1, 2));
            System.out.println("| "+ i +"  | "+ arr[i] +"   | "+ error +"   |");
        }
    }
}