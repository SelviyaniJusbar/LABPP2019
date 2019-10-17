import java.util.Scanner;
class Praktikum5_01{
  public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.println("input a : ");
    int a=scan.nextInt();
    System.out.println("input b : ");
    int b=scan.nextInt();
    scan.close();
    cariFpb(a,b);
  }
  public static int cariFpb(int a, int b){
    int sum=a%b;
    while(sum!=0){
      b=a;
      a=sum;
      sum=b%a;
    }System.out.printf("Fpb : %d",a);
    return sum;
  }
}
