import java.io.*;
import java.util.Scanner;

class TP1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		FileInputStream input = null;
		FileOutputStream output = null;
		
		try {
			System.out.print("Input file yang ingin dicopy : ");
			String sumber = sc.next();
            
            System.out.print("Input nama file baru : ");
			String salinan= sc.next();
				input = new FileInputStream(sumber + ".txt");
				output = new FileOutputStream(salinan + ".txt");
            
                int data;
			while((data = input.read())!= -1){
				output.write(data);
			}
        
        } catch (IOException io){
			System.out.println("Gagal");
        
        } finally {
			try {
				if (input != null) {
					System.out.println("Berhasil");
					input.close();
				}
				if (output!= null) {
					output.close();
				}
			} catch (IOException io) {
				System.out.println("Gagal");
			}
		}
		sc.close();
	}
}