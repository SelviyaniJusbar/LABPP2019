//Nama : Muhammad Fajri Rasid
//NIM  : H071191051
import java.util.Scanner;

public class TugasEmpat{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        String a = userInput.next(), b = userInput.next(), c = userInput.next();
        userInput.close();
        if (a.equals("vertebrado")){
            if (b.equals("ave")){
                if (c.equals("carnivoro")){
                    System.out.println("Agula");
                }else if (c.equals("onivoro")){
                    System.out.println("Pomba");
                }else{
                    System.out.println("Invalid input");
                }
            }else if (b.equals("mamifero")){
                if (c.equals("onivoro")){
                    System.out.println("Homem");
                }else if (c.equals("herbivoro")){
                    System.out.println("Vaca");
                }else{
                    System.out.println("Invalid input");
                }
            }else {
                System.out.println("Invalid input");
            }
        }else if (a.equals("invertebrado")){
            if (b.equals("inseto")){
                if (c.equals("hematofago")){
                    System.out.println("Pulga");
                }else if (c.equals("herbivoro")){
                    System.out.println("Lagarta");
                }else{
                    System.out.println("Invalid input");
                }
            }else if (b.equals("anelideo")){
                if (c.equals("hematofago")){
                    System.out.println("Sanguessuga");
                }else if (c.equals("onivoro")){
                    System.out.println("Minhoca");
                }else{
                    System.out.println("Invalid input");
                }
            }else{
                System.out.println("Invalid input");
            }
        }else{
            System.out.println("Invalid Input");
        }
    }
}    