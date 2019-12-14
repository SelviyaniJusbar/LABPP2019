import java.io.*;
import java.util.Scanner;

class TP2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		FileReader sumberFile = null;
		FileWriter salinanFile = null;
		PrintWriter isi = null;
		BufferedReader isiFile = null;

		String file = sc.next() + ".txt";
        String file2 = sc.next() + ".txt";
		try {
			sumberFile = new FileReader(file);
			isiFile = new BufferedReader(sumberFile);
			salinanFile = new FileWriter(file2);
			isi = new PrintWriter(salinanFile);

			String data;
			int max = 0;
			
			while ((data = isiFile.readLine()) != null) {
				max = data.length() > max ? data.length() : max;
			}
			
			sumberFile = new FileReader(file);
			isiFile= new BufferedReader(sumberFile);

			String cek;
			while ((cek = isiFile.readLine()) != null) {
				isi.printf("%"+max+"s %n", cek);
			}

			System.out.println("Berhasil");
	
		} catch(IOException ioe) {
			System.out.print("Gagal");
        
        } finally {
			try {
                if(salinanFile != null) {
                    salinanFile.close();
                }
                if (sumberFile != null) {
                    sumberFile.close();
                }
			} catch(IOException ioe) {
				System.out.print("Gagal");
			}
		}
	}
}