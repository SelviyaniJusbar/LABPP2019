//Nama : Muhammad Fajri Rasid
//NIM  : H071191051
import java.util.Scanner;

public class TugasEnam{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        String nama1 = userInput.next(), element1 = userInput.next();
        System.out.println("VS");
        String nama2 = userInput.next(), element2 = userInput.next();
        userInput.close();
        if ((element1.equalsIgnoreCase("fire") == element2.equalsIgnoreCase("fire")) || (element1.equalsIgnoreCase("electric") == element2.equalsIgnoreCase("electric")) || (element1.equalsIgnoreCase("ice") == element2.equalsIgnoreCase("ice")) || (element1.equalsIgnoreCase("water") == element2.equalsIgnoreCase("water"))|| (element1.equalsIgnoreCase("ground") == element2.equalsIgnoreCase("ground"))){
                System.out.println("Draw");
        }else if (element1.equalsIgnoreCase("fire")){
            if (element2.equalsIgnoreCase("ice") || element2.equalsIgnoreCase("electric")){
                System.out.println("The winner is " + nama1);
            }else if (element2.equalsIgnoreCase("water") || element2.equalsIgnoreCase("ground")){
                System.out.println("The Winner is " + nama2);
            }
        }else if (element2.equalsIgnoreCase("fire")){
            if (element1.equalsIgnoreCase("ice") || element1.equalsIgnoreCase("electric")){
                System.out.println("The winner is " + nama2);
            }else if (element1.equalsIgnoreCase("water") || element1.equalsIgnoreCase("ground")){
                System.out.println("The Winner is " + nama1);
            }
        }else if (element1.equalsIgnoreCase("ice")){
            if (element2.equalsIgnoreCase("water") || element2.equalsIgnoreCase("ground")){
                System.out.println("The winner is " + nama1);
            }else if (element2.equalsIgnoreCase("electric")){
                System.out.println("The winner is " + nama2);
            }
        }else if (element2.equalsIgnoreCase("ice")){
            if (element1.equalsIgnoreCase("water") || element1.equalsIgnoreCase("ground")){
                System.out.println("The winner is " + nama2);
            }else if (element1.equalsIgnoreCase("electric")){
                System.out.println("The winner is " + nama1);
            }
        }else if (element1.equalsIgnoreCase("electric")){
            if (element2.equalsIgnoreCase("water")){
                System.out.println("The winner is " + nama1);
            }else if (element2.equalsIgnoreCase("ground")){
                System.out.println("The winner is " + nama2);
            }
        }else if (element2.equalsIgnoreCase("electric")){
            if (element1.equalsIgnoreCase("water")){
                System.out.println("The winner is " + nama2);
            }else if (element1.equalsIgnoreCase("ground")){
                System.out.println("The winner is " + nama1);
            }
        }else if (element1.equalsIgnoreCase("water")){
            if (element2.equalsIgnoreCase("ground")){
                System.out.println("The winner is " + nama1);
            }
        }else if (element2.equalsIgnoreCase("water")){
            if (element1.equalsIgnoreCase("ground")){
                System.out.println("The winner is " + nama2); 
            }
        }
    }
}

