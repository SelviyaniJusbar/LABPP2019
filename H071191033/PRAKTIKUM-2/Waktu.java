import java.util.Scanner;
class Waktu {

  
    public static void main(String[] args){
    Scanner alfnnxx = new Scanner(System.in);
    
    System.out.printf("Acara Dimulai %n");
    int h1= alfnnxx.nextInt();
    int m1 = alfnnxx.nextInt();
    h1  = 60*h1+m1;
    System.out.printf("Acara berakhir %n");
    int h2 = alfnnxx.nextInt();
    int m2 = alfnnxx.nextInt();
    h2 = 60*h2+m2;
    int time,hour;
    if(h2 >= 0 && h1 >= 0 && m2 >= 0 && m1 >= 0 ){
      if(h2 <= h1){
        time = (h2-h1 == 0)?1440:h2+1440-h1;
      }
      else{
        time = h2 - h1;
      }
      hour = time/60;
      int minute = time%60;
      System.out.printf("%02d:%02d",hour,minute);
    }
    else{
      System.out.println("INPUTAN SALAH");
    }

  }
}