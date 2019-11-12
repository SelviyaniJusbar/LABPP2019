import java.util.Scanner;
/**
 * Modul1
 */
public class Modul1 {

    public static void main(String[] args) {
        Scanner bay = new Scanner(System.in);
        int x = bay.nextInt();
        int arr []=new int [x];
        int multi = x - 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=bay.nextInt();

        }
        for (int i = 0,y = 0; i < multi; i++) {
            y = 0;
            y = i+1;
            for (int j = 0; j < multi; j++) {
                if(arr[i] % arr[y] !=0 && arr[y] % arr[i] !=0 ){
                    System.out.println(arr[i]+ " "+ arr[y]);
                    System.out.println();
                }
                y++;
                
            }
            x--;
        }
    }
}