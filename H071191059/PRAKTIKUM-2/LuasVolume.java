import java.util.Scanner;
class LuasVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");

        System.out.println("Input sesuai dengan menu yang diinginkan");
        int menu = sc.nextInt();

        switch (menu) {
            case 1 :
                System.out.println("**Pilih Bangun Datar**");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Segitiga");
                System.out.println("4. Lingkaran");
                System.out.println("5. Jajar Genjang");
                System.out.println("6. Trapesium");
                System.out.println("7. Belah Ketupat");
                System.out.println("8. Layang-layang");
            
                System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan");
                int pilihBangunDatar = sc.nextInt();
                switch (pilihBangunDatar) {
                    case 1 :
                        System.out.println("Persegi");
                        System.out.print("Input sisi = ");
                        double sisiPersegi = sc.nextDouble();
                        System.out.print("Luas persegi = " + sisiPersegi*sisiPersegi);
                        break;
                    case 2 :
                        System.out.println("Persegi panjang");
                        System.out.print("Input panjang = ");
                        double panjangPersegiPanjang = sc.nextDouble();
                        System.out.print("Input lebar = ");
                        double lebarPersegiPanjang = sc.nextDouble();
                        System.out.print("Luas persegi panjang = " + panjangPersegiPanjang*lebarPersegiPanjang);
                        break;
                    case 3 :
                        System.out.println("Segitiga");
                        System.out.print("Input alas = ");
                        double alasSegitiga = sc.nextDouble();
                        System.out.print("Input tinggi = ");
                        double tinggisegitiga = sc.nextDouble();
                        System.out.print("Luas segitiga = " + (alasSegitiga*tinggisegitiga)/2);
                        break;
                    case 4 :
                        System.out.println("Lingkaran");
                        System.out.print("Input jari-jari = ");
                        double rLingkaran = sc.nextDouble();
                        System.out.print("Luas lingkaran = " + Math.PI*Math.pow(rLingkaran, 2));
                        break;
                    case 5 :
                        System.out.println("Jajar genjang");
                        System.out.print("Input alas = ");
                        double alasJajarGenjang = sc.nextDouble();
                        System.out.print("Input tinggi = ");
                        double tinggiJajarGenjang = sc.nextDouble();
                        System.out.println("Luas jajar genjang = " + alasJajarGenjang*tinggiJajarGenjang);
                        break;
                    case 6 :
                        System.out.println("Trapesium");
                        System.out.print("Input sisi1 = ");
                        double s1 = sc.nextDouble();
                        System.out.print("Input sisi2 = ");
                        double s2 = sc.nextDouble();
                        System.out.print("Input tinggi = ");
                        double tinggi = sc.nextDouble();
                        System.out.print("Luas jajar genjang = " + (s1+s2)*tinggi/2);
                        break;
                    case 7 :
                        System.out.println("Belah ketupat");
                        System.out.print("Input diagonal 1\t = ");
                        double d1 = sc.nextDouble();
                        System.out.print("Input diagonal 2\t = ");
                        double d2 = sc.nextDouble();
                        System.out.print("Luas belah ketupat = " + (d1*d2)/2);
                        break;
                    case 8 :
                        System.out.println("Layang-layang");
                        System.out.print("Input diagonal 1\t = ");
                        double diagonal1 = sc.nextDouble();
                        System.out.print("Input diagonal 2\t = ");
                        double diagonal2 = sc.nextDouble();
                        System.out.print("Luas layang-layang = " + (diagonal1*diagonal2)/2);
                        break;
            } break;
            case 2 :
                System.out.println("**Pilih Bangun Ruang**");
                System.out.println("1. Kubus");
                System.out.println("2. Balok");
                System.out.println("3. Kerucut");
                System.out.println("4. Bola");
                System.out.println("5. Tabung");
                System.out.println("6. Prisma Segitiga");
                System.out.println("7. Limas Segitiga");
                System.out.println("8. Limas Segiempat");

                System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan");
                int pilihBangunRuang = sc.nextInt();
                switch (pilihBangunRuang) {
                    case 1 :
                        System.out.print("Kubus\nInput sisi = ");
                        double sisiBalok = sc.nextDouble();
                        System.out.print("Volume balok = " + sisiBalok);
                        break;
                    case 2 :
                        System.out.println("Balok");
                        System.out.print("Input panjang = ");
                        double pBalok = sc.nextDouble();
                        System.out.print("Input lebar = ");
                        double lBalok = sc.nextDouble();
                        System.out.print("Input tinggi = ");
                        double tBalok = sc.nextDouble();
                        System.out.print("Volume balok = " + pBalok*lBalok*tBalok);
                        break;
                    case 3 :
                        System.out.println("Kerucut");
                        System.out.print("Input jari-jari = ");
                        double r = sc.nextDouble();
                        System.out.print("Input tinggi = ");
                        double t = sc.nextDouble();
                        System.out.print("Volume kerucut = " + (Math.PI * r * r * t)/3);
                        break;
                    case 4 :
                        System.out.println("Bola");
                        System.out.print("Input jari-jari");
                        double rBola = sc.nextDouble();
                        System.out.print("Volume bola = " + ((4 * Math.PI * rBola * rBola * rBola)/3));
                        break;
                    case 5 :
                        System.out.println("Tabung");
                        System.out.print("Input jari-jari = ");
                        double rTabung = sc.nextDouble();
                        System.out.print("Input tinggi = ");
                        double tTabung = sc.nextDouble();
                        System.out.print("Volume tabung = " + (Math.PI * rTabung * rTabung * tTabung));
                        break;
                    case 6 :
                        System.out.println("Prisma segitiga");
                        System.out.print("Input alas segitiga = ");
                        double aSegitiga = sc.nextDouble();
                        System.out.print("Input tinggi segitiga = ");
                        double tSegitiga = sc.nextDouble();
                        System.out.print("Input tinggi prisma = ");
                        double t2Segitiga = sc.nextDouble();
                        System.out.print("Volume prisma segitiga = " + (aSegitiga*tSegitiga*t2Segitiga)/2);
                        break;
                    case 7 :
                        System.out.println("Limas segitiga");
                        System.out.print("Input alas segitiga = ");
                        double alas = sc.nextDouble();
                        System.out.print("Input tinggi segitiga = ");
                        double tinggi = sc.nextDouble();
                        double luas = alas*tinggi;
                        System.out.print("Input tinggi limas = ");
                        double tinggi2 = sc.nextDouble();
                        System.out.print("Volume limas segitiga = " + (luas*tinggi2)/3);
                        break;
                    case 8 :
                        System.out.println("Limas segiempat");
                        System.out.println("Mencari luas alas");
                        System.out.print("Input sisi alas1 = ");
                        double s1 = sc.nextDouble();
                        System.out.print("Input sisi alas2 = ");
                        double s2 = sc.nextDouble();
                        double lAlas = s1*s2;
                        System.out.print("Input tinggi limas = ");
                        double tLimas = sc.nextDouble();
                        System.out.print("Volume limas segiempat = " + (lAlas*tLimas/2));
                        break;
            }
        }
        sc.close();
    }    
}