import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;
class AngkaBagiBagi{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Batas Awal : ");
    int awal = scan.nextInt();
    System.out.print("Batas Akhir : ");
    int akhir = scan.nextInt();
    for(int i = awal; i<=akhir;i++){
      if (i == 0){
        continue;
      }
      if(bisaBagiBagi(i)){
        System.out.print(i+" ");
      }
    }
  }
  static boolean bisaBagiBagi(int angka){
    Iterator<Integer> iterator = seperateDigits(angka).iterator();
    try{
      while(iterator.hasNext()){
        if (angka == 0){
          continue;
        }
        if(angka % iterator.next()==0){
          continue;
        }else{
          return false;
        }
      }
    }catch(ArithmeticException e){
      return false;
    }
    return true;
  }
  static List<Integer> seperateDigits(int angka){
    List<Integer> seperatedDigits = new ArrayList<Integer>();
    while (angka != 0) {
      seperatedDigits.add(angka % 10);
      angka = angka / 10;
    }
    return(seperatedDigits);
  }
}
