import java.util.*;

class Praktikum7_01{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String data2[]=scan.nextLine().split(" ");
    HashMap<String, Character> data1=new HashMap<>();
    data1.put(".-",'A'); data1.put("-...",'B'); data1.put("-.-.",'C'); data1.put("-..",'D');
    data1.put(".",'E'); data1.put("..-.",'F'); data1.put("--.",'G'); data1.put("....",'H');
    data1.put("..",'I'); data1.put(".---",'J'); data1.put("-.-",'K'); data1.put(".-..",'L');
    data1.put("--",'M'); data1.put("-.",'N'); data1.put("---",'O'); data1.put(".--.",'P');
    data1.put("--.-",'Q'); data1.put(".-.",'R'); data1.put("...",'S'); data1.put("-",'T');
    data1.put("..-",'U'); data1.put("...-",'V'); data1.put(".--",'W'); data1.put("-..-",'X');
    data1.put("-.--",'Y'); data1.put("--..",'Z');

    for(int i=0;i<data2.length;i++){
      System.out.print(data1.get(data2[i]));
    }
  }
}
