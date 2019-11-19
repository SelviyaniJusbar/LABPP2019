import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;
class Tambahan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input nilai awal : ");
        int awal = sc.nextInt();
        System.out.print("Input nilai akhir : ");
        int akhir = sc.nextInt();
        if(awal < akhir){
            for (int i = awal ; i <= akhir ; i++) {
                if (bagi(i) && i != 0) {
                System.out.print(i + " ");
                }
            }
        } else {
            for (int i = awal; i >= akhir; i--) {
                if (bagi(i) && i != 0) {
                System.out.print(i + " ");
                }
            }
        }
        sc.close();
    }
    static boolean bagi(int inputan){
        Iterator<Integer> iterator = giba(inputan).iterator();
        try{
            while(iterator.hasNext()){
                if(inputan % iterator.next()==0){
                    continue;
                } else {
                    return false;
                }
            }
        } catch(ArithmeticException e){
            return false;
        }
        return true;
    }
    static List<Integer> giba(int inputan){
        List<Integer> giba = new ArrayList<Integer>();
        while (inputan > 0 || inputan < 0) {
            giba.add(inputan % 10);
            inputan = inputan / 10;
        }
        return(giba);
    }
}