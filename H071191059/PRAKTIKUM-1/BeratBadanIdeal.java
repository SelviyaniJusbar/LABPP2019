import java.util.Scanner;
class BeratBadanIdeal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nama = scan.nextLine();    
        double tinggiBadan = scan.nextDouble();      
        double beratBadan = scan.nextDouble();
        double persentasi = scan.nextDouble();

        double beratIdeal = (tinggiBadan-100) - ((tinggiBadan-100)*(persentasi/100));
        double targetBeratBadan = beratIdeal-beratBadan;

        System.out.println("Informasi");
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Tinggi badan\t\t: " + tinggiBadan + " cm");
        System.out.println("Berat badan\t\t: " + beratBadan + " kg");
        System.out.println("Berat badan ideal\t: " + beratIdeal + " kg");
        System.out.printf("Target berat badan ideal: %.1f kg" , targetBeratBadan);
       
        scan.close();
    }
}