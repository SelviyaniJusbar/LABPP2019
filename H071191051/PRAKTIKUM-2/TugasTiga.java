//Nama : Muhammad Fajri Rasid
//NIM  : H071191051
import java.util.Scanner;

public class TugasTiga{
    public static void main(String []args){
        System.out.println("** Menu **\n1. Mencari Luas Bangun Datar \n2. Mencari Volume Bangun Ruang");
        Scanner userInput = new Scanner(System.in);
        int list = userInput.nextInt();
            switch (list){
                case 1:
                    System.out.println("** Pilih bangun datar **\n1. Persegi \n2. Persegi panjang \n3. Segitiga \n4. Lingkaran \n5. Jajar genjang \n6. Trapesium \n7. Belah ketupat \n8. Layang-layang");
                        int list2 = userInput.nextInt();
                        double hasil;
                        if (list2 == 1 ){
                            System.out.print("Input sisi = ");
                            double sisi = userInput.nextDouble();
                            hasil = (sisi*sisi);
                            System.out.println("Luas Persegi = " + hasil);
                        }else if (list2 == 2){
                             System.out.print("Input panjang = ");
                            double panjang = userInput.nextDouble();
                            System.out.print("Input Lebar = ");
                            double lebar = userInput.nextDouble();
                            hasil = (panjang*lebar);
                            System.out.println("Luas Persegi panjang = " + hasil);
                        }else if (list2 == 3){
                            System.out.print("Input alas = ");
                            double alas = userInput.nextDouble();
                            System.out.print("Input tinggi = ");
                            double tinggi = userInput.nextDouble();
                            hasil = ((alas*tinggi)*0.5);
                            System.out.println("Luas Segitiga = " + hasil);
                        }else if (list2 == 4){
                            System.out.print("Input jari-jari = ");
                            double jariJari = userInput.nextDouble();
                            hasil = (Math.PI*Math.pow(jariJari, 2));
                            System.out.printf("Luas lingkaran = %.1f \n",hasil);
                        }else if (list2 == 5){
                            System.out.print("Input panjang = ");
                            double panjang = userInput.nextDouble();
                            System.out.print("Input tinggi = ");
                            double tinggi = userInput.nextDouble();
                            hasil = (panjang*tinggi);
                            System.out.println("Luas jajar genjang = " + hasil);
                        }else if (list2 == 6){
                            System.out.print("Input sisi bawah = ");
                            double sisiBawah = userInput.nextDouble();
                            System.out.print("Input sisi atas = ");
                            double sisiAtas = userInput.nextDouble();
                            System.out.print("Input tinggi = ");
                            double tinggi = userInput.nextDouble();
                            hasil = (0.5*tinggi*(sisiAtas+sisiBawah));
                            System.out.println("Luas trapesium = " + hasil);
                        }else if (list2 == 7){
                            System.out.print("Input diagonal 1 = ");
                            double diagonal1 = userInput.nextDouble();
                            System.out.print("Input diagonal 2 = ");
                            double diagonal2 = userInput.nextDouble();
                            hasil = (0.5*diagonal1*diagonal2);
                            System.out.println("Luas belah ketupat = " + hasil);
                        }else if (list2 == 8){
                            System.out.print("Input diagonal 1 = ");
                            double diagonal1 = userInput.nextDouble();
                            System.out.print("Input diagonal 2 = ");
                            double diagonal2 = userInput.nextDouble();
                            hasil = (0.5*diagonal1*diagonal2);
                            System.out.println("Luas layang-layang = " + hasil);
                        }break;
                case 2:
                    System.out.println("** Pilih bangun ruang **\n1. Kubus \n2. Balok \n3. Limas Segiempat \n4. Prisma Segitiga \n5. Limas Segitiga \n6. Tabung \n7. Kerucut \n8. Bola");
                        int list3 = userInput.nextInt();
                        double hasil2;
                        if (list3 == 1 ){
                            System.out.print("Input rusuk = ");
                            double rusuk = userInput.nextDouble();
                            hasil2 = (Math.pow(rusuk,3));
                            System.out.println("Volume kubus = " + hasil2);
                        }else if (list3 == 2){
                            System.out.print("Input panjang = ");
                            double panjang = userInput.nextDouble();
                            System.out.print("Input Lebar = ");
                            double lebar = userInput.nextDouble();
                            System.out.print("Input tinggi = ");
                            double tinggi = userInput.nextDouble();
                            hasil2 = (panjang*lebar*tinggi);
                            System.out.println("Volume balok = " + hasil2);
                        }else if (list3 == 3){
                            System.out.print("Input sisi alas = ");
                            double sisiAlas = userInput.nextDouble();
                            System.out.print("Input Tinggi limas = ");
                            double tinggi = userInput.nextDouble();
                            hasil2 = ((Math.pow(sisiAlas,2)*tinggi)/3);
                            System.out.printf("Volume limas segiempat = %.1f \n",hasil2);
                        }else if (list3 == 4){
                            System.out.print("Input sisi alas = ");
                            double sisiAlas = userInput.nextDouble();
                            System.out.print("Input tinggi alas = ");
                            double tinggiAlas = userInput.nextDouble();
                            System.out.print("Input tinggi prisma = ");
                            double tinggiPrisma = userInput.nextDouble();
                            hasil2 = ((sisiAlas*tinggiAlas*0.5)*tinggiPrisma);
                            System.out.printf("Volume prisma segitiga = %.1f \n",hasil2);
                        }else if (list3 == 5){
                            System.out.print("Input sisi alas = ");
                            double sisiAlas = userInput.nextDouble();
                            System.out.print("Input tinggi alas = ");
                            double tinggiAlas = userInput.nextDouble();
                            System.out.print("Input tinggi limas = ");
                            double tinggiLimas = userInput.nextDouble();
                            hasil2 = ((sisiAlas*tinggiAlas*tinggiLimas)/6);
                            System.out.printf("Volume limas segitiga = %.1f \n",hasil2);
                        }else if (list3 == 6){
                            System.out.print("Masukkan jari-jari = ");
                            double jarijari = userInput.nextDouble();
                            System.out.print("Masukkan tinggi = ");
                            double tinggi = userInput.nextDouble();
                            hasil2 = (Math.PI*tinggi*Math.pow(jarijari,2));
                            System.out.printf("Hasil = %.1f \n",hasil2);
                        }else if (list3 == 7){
                            System.out.print("Masukkan jari-jari = ");
                            double jarijari = userInput.nextDouble();
                            System.out.print("Masukkan tinggi = ");
                            double tinggi = userInput.nextDouble();
                            hasil2 = ((Math.PI*tinggi*Math.pow(jarijari,2))/3);
                            System.out.printf("Hasil = %.1f \n",hasil2);
                        }else if (list3 == 8){
                            System.out.print("Input jari-jari = ");
                            double jarijari = userInput.nextDouble();
                            hasil2 = ((4*Math.PI*Math.pow(jarijari,3))/3);
                            System.out.printf("Hasil = %.1f \n",hasil2);
                            userInput.close();
                        }break;
        }
    }
}