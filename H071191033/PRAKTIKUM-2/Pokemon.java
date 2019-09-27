import java.util.Scanner;
class Pokemon {
  public static void main(String[] args)
  {
    Scanner alfnnxx = new Scanner(System.in);
    String nama = alfnnxx.next().toLowerCase();
    String element = alfnnxx.next().toLowerCase();
    String nama2 = alfnnxx.next().toLowerCase();
    String element2 = alfnnxx.next().toLowerCase();

    switch(element) {
      case "api":
      switch(element2){
        case "es":
        System.out.println(nama);
        break;
        case "listrik":
        System.out.println(nama);
        break;
        case "air":
        System.out.println(nama2);
        break;
        case "api":
        System.out.println("draw");
        break;
      }break;
      case "tanah":
      switch(element2){
        case "listrik":
        System.out.println(nama);
        break;
        case "api":
        System.out.println(nama);
        break;
        case "air":
        System.out.println(nama2);
        break;
        case "tanah":
        System.out.println("draw");
        break;
      }
      break;
      case "air":
      switch(element2){
        case "api":
        System.out.println(nama);
        break;
        case "tanah":
        System.out.println(nama);
        break;
        case "listrik":
        System.out.println(nama2);
        break;
        case "es":
        System.out.println(nama2);
        break;
        case "air":
        System.out.println("draw");
        break;

      }
      break;
      case "listrik":
      switch(element2){
        case "es":
        System.out.println(nama);
        break;
        case "air":
        System.out.println(nama);
        break;
        case "api":
        System.out.println(nama2);
        break;
        case "tanah":
        System.out.println(nama2);
        case "listrik":
        System.out.println("draw");
        break;
      }
      break;
      case "es":
      switch(element2){
        case "air":
        System.out.println(nama);
        break;
        case "tanah":
        System.out.println(nama);
        break;
        case "listrik":
        System.out.println(nama2);
        break;
        case "api":
        System.out.println(nama2);
        break;
        case "es":
        System.out.println("draw");
        break;
      }
      break;
    }
  }
}