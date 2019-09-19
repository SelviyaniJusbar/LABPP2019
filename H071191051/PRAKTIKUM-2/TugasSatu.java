//Nama : Muhammad Fajri Rasid
//NIM  : H071191051
import java.util.Scanner;

public class TugasSatu{
    public static void main(String []args){
        Scanner userInput = new  Scanner(System.in);
        System.out.print("x = ");
        int x = userInput.nextInt();
        System.out.print("y = ");
        int y = userInput.nextInt();
        double jariJari1 = (Math.sqrt(25));
        double jariJari2 = (Math.sqrt(144));
        double jariJari3 = (Math.sqrt(400));
        double lingkaran = (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
        userInput.close();
        
        if(lingkaran <= jariJari1){
            System.out.printf("Jari-jari lingkaran A = %.0f \n",jariJari1);
            System.out.println("Titik (x,y) terletak di lingkaran A");   
        }else if(lingkaran <= jariJari2){
            System.out.printf("Jari-jari lingkaran B = %.0f \n",jariJari2);
            System.out.println("Titik (x,y) terletak di lingkaran B");
        }else if(lingkaran <= jariJari3){
            System.out.printf("Jari-jari lingkaran C = %.0f \n",jariJari3);
            System.out.println("Titik (x,y) terletak di lingkaran C"); 
        }
        System.out.printf("jarak = %f cm dari pusat lingkaran \n",lingkaran);
    }
}