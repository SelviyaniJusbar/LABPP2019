import java.util.Scanner;
class Praktikum6_03{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String kalimat = scan.nextLine();


    int matrix[][] = new int[4][4];
    char[] kalimatToChar = kalimat.toCharArray();

    String kata = "";

    for(int i = 0; i < kalimatToChar.length; i ++){
      if(i % 2 != 0){
         int charToInt = (int) kalimatToChar[i];
         kata += charToInt;
      }
      else{
        kata += kalimatToChar[i];
      }
    }
    //System.out.println(kataGanjil);
    char[] kataToChar = kata.toCharArray();
    int jumlahKata = (int) Math.ceil(kataToChar.length / 16.0);
    int banyakSpasi = 0;

    for(int i = 0; i < jumlahKata * 16; i++){
      if (i < kataToChar.length)
        System.out.print(kataToChar[i]);
      else
        System.out.print('?');
      if((i+1) % jumlahKata == 0){
        if(banyakSpasi >= 3){
          System.out.println();
          banyakSpasi = 0;
        }
        else{
          System.out.print(" ");
          banyakSpasi++;
        }

      }
    }
  }
}
