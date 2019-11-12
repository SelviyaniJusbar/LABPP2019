import java.util.Scanner;
/**
 * Tugas02-Final-[MM]
 */
public class Tugas01Final {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data [] = new int [10];
        double error = 0;
        int jumlah = 0;
        for (int i = 0; i < data.length; i++) {
            data[i] = sc.nextInt();
            data[i]=i;
            jumlah += data[i];
            
        }
        System.out.println("================");
        System.out.println("|no|data|error|");
        System.out.println("================");
        double rata2 = jumlah / 10;
        for (int i = 1; i < data.length; i++) {
            error = Math.sqrt(Math.pow((rata2 - data[i]), 2));
            System.out.println("| "+i+" | "+data[i]+" | "+error+" |");
            
        }
       

    }
}