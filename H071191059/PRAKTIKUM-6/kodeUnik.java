import java.util.Scanner;
class kodeUnik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputan = sc.nextLine(); // kalimat inputan
        String kataBaru1 = inputan.replaceAll(" ", ""); // menghapus spasi dalam inputan kalimat
        String kataBaru2 = kataBaru1.toUpperCase(); // mengubah kataBaru1 menjadi huruf kapital
        int panjang = kataBaru2.length(); // mencari panjang kata
        int akhir = panjang/2;
        String kata3 = kataBaru2.substring(0, akhir); // 
        int kata4 = inputan.length();

        for(int i = kata3.length()-2 ; i >= 0 ; i--) {
            kata3 += kata3.charAt(i);
        }
        String hex = String.format("%x", kata4*kata4);
        String oct = String.format("%o", kata4);
        String startCheck = hex.charAt(0) >= 'A' && hex.charAt(0) <= 'z' ? "?" : "!";

        System.out.println("#" + hex + kata3 + oct + startCheck);
    }
}