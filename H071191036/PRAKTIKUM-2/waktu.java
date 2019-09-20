import java.util.Scanner;
/**
 * waktu
 */
public class waktu {

    public static void main(String[] args) {
        Scanner w=new Scanner(System.in);
        int jam1 = w.nextInt(), menit1 = w.nextInt(), jam2=w.nextInt(),menit2 = w.nextInt();
        int djam,dmenit;
        if (jam1<=jam2){
            if (menit1<=menit2){
                djam = (jam2 - jam1 );
                dmenit =  menit2-menit1;
            
            }else {
                djam = 24 -(jam2 - jam1)-1;
                dmenit = 60 - menit1+menit2;
            }
        }else {
            if(menit1<=menit2){
                djam = 24 - jam1+jam2-1;
                dmenit =  60-menit2-menit1;
            }else{
            djam = 24 - jam1+jam2-1;
            dmenit =60 - menit1+menit2;
          }
        }System.out.printf("%02d : %02d \n",djam,dmenit);
       
    }
}