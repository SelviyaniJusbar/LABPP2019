//Nama : Muhammad Fajri Rasid
//NIM  : H071191051
import java.util.Scanner;

public class TugasPraktikum7{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        float derajat = userInput.nextFloat();
        userInput.close();
        int second = Math.round((derajat/360)*(24*3600));
        int minute = 0, hour = 0, x = 0, y = 0;

        for (x=second ; x>=3600 ; x-=3600){
            hour++;
        }
        for (y=x ; y>=60 ; y-=60){
            minute++;
        }
        hour = (hour+6)%24;
        if (hour >= 6 && hour < 12){
            System.out.print("\nSelamat Pagi :)");
        }else if (hour >=12 && hour < 15){
            System.out.print("\nSelamat Siang :)");
        }else if (hour >=15 && hour < 18){
            System.out.print("\nSelamat Sore :(");
        }else{
            System.out.print("\nSelamat Malam :v");
        }
        System.out.printf("\n%02d:%02d:%02d\n",hour,minute,y);
    }
}