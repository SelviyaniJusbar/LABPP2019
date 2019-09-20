import java.util.Scanner;

public class TugasTujuh{
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        int jam1 = userInput.nextInt(), menit1 = userInput.nextInt(), jam2 = userInput.nextInt(), menit2 = userInput.nextInt();
        int durasiJam, durasiMenit;
        userInput.close();
        if(jam1<=jam2){
           if (menit1<=menit2){
               durasiJam = (jam2-jam1);
               durasiMenit = (menit2-menit1);
           }else{
               durasiJam = (jam2-jam1)-1;
               durasiMenit = 60 - menit1+menit2;
           }
        }else{
            if (menit1<=menit2){
                durasiJam = 24 - jam1+jam2;
                durasiMenit = (menit2-menit1);
            }else{
                durasiJam = 24 - jam1+jam2-1;
                durasiMenit = 60 - menit1+menit2;
            }
        }
        System.out.printf("%02d:%02d \n",durasiJam,durasiMenit);
    }
}