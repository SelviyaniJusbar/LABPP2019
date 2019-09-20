import java.util.Scanner;

class TugasPraktikum01 {
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        System.out.println("input nilai : ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        if(r < 25){
            System.out.println("titik terletak di dalam lingkaran A");
        }else if(r == 25){
            System.out.println("titik terletak pada lingkaran A");
        }else if(r > 25 && r < 144 ){
            System.out.println("titik terletak di dalam lingkaran B");
        }else if(r == 144){
            System.out.println("titik terletak pada lingkaran B");
        }else if( r > 144 && r < 400){
            System.out.println("titik terletak di dalam lingkaran C");
        }else if(r == 400){
            System.out.println("titik terletak pada lingkaran C");
        }else{
            System.out.println("titik terletak di luar linkaran A,B, dan C");
        }
    }
}
        // Nama    :  Andi Nurul Qalbi
        // NIM     :  H071191014
