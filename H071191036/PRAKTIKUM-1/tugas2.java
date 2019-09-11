import java.util.Scanner;
public class tugas2{
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int detik=key.nextInt();
        int jam,menit,sisa1,sisa2;
        jam =detik/3600;
        sisa1=detik%3600;

        menit =sisa1/60;
        sisa2=sisa1%60;

        System.out.println(jam+ ":"+menit+":"+sisa2);
    }
}