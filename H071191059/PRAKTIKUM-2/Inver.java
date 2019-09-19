import java.util.Scanner;
class Inver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String input3 = sc.nextLine();
        
        if (input1.equals("vertebrado")) {
            if (input2.equals("ave")) {
                if (input3.equals("carnivoro")) {
                    System.out.print("agula");
                } else if (input3.equals("onivoro")) {
                    System.out.println("pomba");
                }
            }else if (input2.equals("mamifero")) {
                if (input3.equals("onivoro")) {
                    System.out.println("homem");
                } else if (input3.equals("herbovoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (input1.equals("invertebrado")) {
            if (input2.equals("inseto")) {
                if (input3.equals("hemmatofago")) {
                    System.out.println("pulga");
                } else if (input3.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (input2.equals("anelido")) {
                if (input3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (input3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }  
        } else { 
            System.out.println("Invalid input");
            System.out.println("Objek error");
        }
        sc.close();
    } 
}