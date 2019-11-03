import java.util.Scanner;
class Matriks4x4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata = sc.nextLine();
        char []k = kata.toCharArray();
        
        String hasil = "";
        //int k;

        for (int i = 0 ; i < kata.length() ; i++) {
            if (i % 2 == 0) {
                hasil += k[i];
            } else {
                hasil += Character.codePointAt(k, i);
            }
        }

        int panjang = hasil.length();
        double jumlah = Math.ceil(panjang/16.0);
        int b = 0;

        for (int i = 0 ; i < 16 ; i++) {
            for (int j = 0 ; j < jumlah ; j++) {
                if (b < panjang) {
                    System.out.print(hasil.charAt(b++));
                } else {
                    System.out.print("?");
                }
            }
            if (i % 4 == 3) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }

        // for (int i = 0 ; i < a.length; i++) {
        //     if (i % 2 != 0) {
        //         k = (int)a[i];
        //         hasil = hasil + Integer.toString(k);
        //     } else {
        //         hasil = hasil + String.valueOf(a[i]); // ubah int ke string
        //     }
        // }
        // char [] b = hasil.toCharArray();
        // for (int i = 0 ; i < 32 ; i++) {
        //     if (i % 8 == 0 && i != 0) {
        //         System.out.println();
        //     }
        //     if (i % 2 == 0 && i % 8 != 0) {
        //         System.out.print(" ");
        //     }
        //     if (i < b.length) {
        //         System.out.print(b[i]);
        //     } else {
        //         System.out.print("?");
        //     }
        // }
    }
}