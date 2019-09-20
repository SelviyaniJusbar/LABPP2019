import java.util.Scanner;

class TugasPraktikum03{
public static void main(String args[]){
  Scanner qal = new Scanner(System.in);
  System.out.println("masukkan nilai : ");

  try{
  int positif = 0;
  int negatif = 0;
  int genap = 0;
  int ganjil = 0;
  int a,b,c,d,e;

  a = qal.nextInt();
  a = a%2 == 0 ? genap++ : ganjil++ ;
  a = a%2 == -1 ? positif++ : negatif++ ;

  b = qal.nextInt();
  b = b%2 == 0 ? genap++ : ganjil++ ;
  b = b%2 == -1 ? positif++ : negatif++ ;

  c = qal.nextInt();
  c = c%2 == 0 ? genap++ : ganjil++ ;
  c = c%2 == -1 ? positif++ : negatif++ ;

  d = qal.nextInt();
  d = d%2 == 0 ? genap++ : ganjil++ ;
  d = d%2 == -1 ? positif++ : negatif++ ;

  e = qal.nextInt();
  e = e%2 == 0 ? genap++ : ganjil++ ;
  e = e%2 == -1 ? positif++ : negatif++ ;

  System.out.println("ada "+genap+" bilangan genap");
  System.out.println("ada "+ganjil+" bilangan ganjil");
  System.out.println("ada "+positif+" bilangan positif");
  System.out.println("ada "+negatif+" bilangan negatif");

  }catch (Exception salah) {
        System.out.print("Input Salah");
      }
  }
}
