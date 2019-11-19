import java.util.Scanner;
class Tambahan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");

        System.out.println("Input sesuai dengan menu yang diinginkan");
        int menu = sc.nextInt();
        int pilihBangunDatar;

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

                System.out.println("Input angka sesuai dengan nomor bangun datar");
                pilihBangunDatar = sc.nextInt();

                switch (pilihBangunDatar) {
                    case 1 :
                        System.out.print("Input sisi = ");
                        double sisiP = sc.nextDouble();
                        luasPersegi(sisiP);
                        break;
                    case 2 :
                        System.out.print("Input panjang = ");
                        double panjangPP = sc.nextDouble();
                        System.out.print("Input lebar = ");
                        double lebarPP = sc.nextDouble();
                        luasPersegiPanjang(panjangPP, lebarPP);
                        break;
                    case 3 :
                        System.out.print("Input alas = ");
                        double alasS = sc.nextDouble();
                        System.out.print("Input tinggi = ");
                        double tinggiS = sc.nextDouble();
                        luasSegitiga(alasS, tinggiS);
                        break;
                    case 4 :
                        System.out.print("Input jari-jari = ");
                        double jariL = sc.nextDouble();
                        luasLingkaran(jariL);
                        break;
                    case 5 :
                        System.out.print("Input alas = ");
                        double alasJG = sc.nextDouble();
                        System.out.print("Input tinggi = ");
                        double tinggiJG = sc.nextDouble();
                        luasJajarGenjang(alasJG, tinggiJG);
                        break;
                    case 6 :
                        System.out.print("Input sisi1 = ");
                        double s1 = sc.nextDouble();
                        System.out.print("Input sisi2 = ");
                        double s2 = sc.nextDouble();
                        System.out.print("Input tinggi = ");
                        double tinggiT = sc.nextDouble();
                        luasTrapesium(s1, s2, tinggiT);
                        break;
                    case 7 :
                        System.out.print("Input diagonal 1\t = ");
                        double d1 = sc.nextDouble();
                        System.out.print("Input diagonal 2\t = ");
                        double d2 = sc.nextDouble();
                        luasBelahKetupat(d1, d2);
                        break;
                    case 8 :
                        System.out.print("Input diagonal 1\t = ");
                        double diagonal1 = sc.nextDouble();
                        System.out.print("Input diagonal 2\t = ");
                        double diagonal2 = sc.nextDouble();
                        luasLayang(diagonal1, diagonal2);
                        break;
                    
                    default:
                    System.out.println("Tidak ada dalam pilihan");
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
                        System.out.print("Input sisi = ");
                        double sisiBalok = sc.nextDouble();
                        volumeKubus(sisiBalok);
                        break;
                    case 2 :
                        System.out.print("Input panjang = ");
                        double pBalok = sc.nextDouble();
                        System.out.print("Input lebar = ");
                        double lBalok = sc.nextDouble();
                        System.out.print("Input tinggi = ");
                        double tBalok = sc.nextDouble();
                        volumeBalok(pBalok, lBalok, tBalok);
                        break;
                    case 3 :
                        System.out.print("Input jari-jari = ");
                        double jariK = sc.nextDouble();
                        System.out.print("Input tinggi = ");
                        double tinggiK = sc.nextDouble();
                        volumeKerucut(jariK, tinggiK);
                        break;
                    case 4 :
                        System.out.print("Input jari-jari");
                        double rBola = sc.nextDouble();
                        volumeBola(rBola);
                        break;
                    case 5 :
                        System.out.print("Input jari-jari = ");
                        double rTabung = sc.nextDouble();
                        System.out.print("Input tinggi = ");
                        double tTabung = sc.nextDouble();
                        volumeTabung(rTabung, tTabung);
                        break;
                    case 6 :
                        System.out.print("Input alas segitiga = ");
                        double aSegitiga = sc.nextDouble();
                        System.out.print("Input tinggi segitiga = ");
                        double tSegitiga = sc.nextDouble();
                        System.out.print("Input tinggi prisma = ");
                        double tPrisma = sc.nextDouble();
                        volumePrismaSegitiga(aSegitiga, tSegitiga, tPrisma);
                        break;
                    case 7 :
                        System.out.print("Input alas segitiga = ");
                        double alas = sc.nextDouble();
                        System.out.print("Input tinggi segitiga = ");
                        double tinggi = sc.nextDouble();
                        double luas = alas*tinggi;
                        System.out.print("Input tinggi limas = ");
                        double tinggi2 = sc.nextDouble();
                        volumeLimasSegitiga(luas, tinggi2);
                        break;
                    case 8 :
                        System.out.println("Mencari luas alas");
                        System.out.print("Input sisi alas1 = ");
                        double s1 = sc.nextDouble();
                        System.out.print("Input sisi alas2 = ");
                        double s2 = sc.nextDouble();
                        double lAlas = s1*s2;
                        System.out.print("Input tinggi limas = ");
                        double tLimas = sc.nextDouble();
                        volumeLimasSegiempat(lAlas, tLimas);
                        break;

                    default:
                    System.out.println("Tidak ada dalam pilihan");
            } break;
            default :
            System.out.println("Menu yang Anda pilih tidak ada");
        }
        sc.close();
    }
    static void luasPersegi (double s) {
        double luasP = s*s;
        System.out.println("Luas Persegi = " + luasP);
    }
    static void luasPersegiPanjang (double p, double l) {
        double luasPP = p*l;
        System.out.println("Luas Persegi Panjang = " + luasPP);
    }
    static void luasSegitiga (double a, double t) {
        double luasS = (a*t)/2;
        System.out.println("Luas Segitiga = " + luasS);
    }
    static void luasLingkaran (double r) {
        double luasL =  Math.PI*Math.pow(r, 2);
        System.out.println("Luas Lingkaran = " + luasL);
    }
    static void luasJajarGenjang (double a, double t) {
        double luasJG = a*t;
        System.out.println("Luas Jajar Genjang = " + luasJG);
    }
    static void luasTrapesium (double s1 , double s2, double t) {
        double luasT = ((s1+s2)*t)/2;
        System.out.println("Luas Trapesium = " + luasT);
    }
    static void luasBelahKetupat (double d1, double d2) {
        double luasBK = (d1*d2)/2;
        System.out.println("Luas Belah Ketupat = " + luasBK);
    }
    static void luasLayang (double d1, double d2) {
        double luasLL = (d1*d2)/2;
        System.out.println("Luas Layang-layang = " + luasLL);
    }
    static void volumeKubus (double s) {
        double volKubus = s*s*s;
        System.out.println("Volume Kubus = " + volKubus);
    }
    static void volumeBalok (double p , double l, double t) {
        double volBalok = p*l*t;
        System.out.println("Volume Balok = " + volBalok);
    }
    static void volumeKerucut (double r , double t) {
        double volKerucut = (Math.PI*r*r*t)/3;
        System.out.println("Volume Kerucut = " + volKerucut);
    }
    static void volumeBola (double r) {
        double volBola = (4*Math.PI*r*r*r)/3;
        System.out.println("Volume Bola = " + volBola);
    }
    static void volumeTabung (double r, double t) {
        double volTabung = Math.PI*r*r*t;
        System.out.println("Volume Tabung = " + volTabung);
    }
    static void volumePrismaSegitiga (double a, double t1, double t2) {
        double volPS = a*t1*t2;
        System.out.println("Volume Prisma Segitiga = " + volPS);
    }
    static void volumeLimasSegitiga (double l, double t2) {
        double volLT = (l*t2)/3;
        System.out.println("Volume Prisma Segitiga = " + volLT);
    }
    static void volumeLimasSegiempat (double l, double t) {
        double volLE = (l*t)/2;
        System.out.println("Volume Limas Segiempat = " + volLE);
    }
}