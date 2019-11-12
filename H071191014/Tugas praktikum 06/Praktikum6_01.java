import java.util.Scanner;
class Praktikum6_01{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String data1 = scan.next();
    String data2 = data1.toLowerCase();
    char[] data3 = data2.toCharArray();

    for(int i=0; i<data3.length;i++){
      if(data3[i]=='b'){
        System.out.print("fizz");
      }else if(data3[i]=='f'){
        System.out.print("buzz");
      }
    }
  }
}
