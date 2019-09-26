import java.util.Scanner;
class Tugas06{
  public static void main(String args[]){
    Scanner noob = new Scanner(System.in);
    System.out.print("input nilai : ");
    float corner = noob.nextInt();
    float HH, MM, SS, sum;
    noob.close();

    while(true){
      if(0<=corner && corner<=360){
        sum = corner*240;//1 derajat = 240 detik
        HH = (sum/3600)+6;
        if(HH>24){
          HH-=24;
        }
        sum %=3600;
        MM = sum/60;
        sum %=60;
        SS = sum;
        
        int HH1 = (int) HH;
        int MM1 = (int) MM;
        int SS1 = (int) SS;

        System.out.printf("%02d : %02d : %02d\n", HH1, MM1, SS1);
        break;
      }
    }
  }
}
