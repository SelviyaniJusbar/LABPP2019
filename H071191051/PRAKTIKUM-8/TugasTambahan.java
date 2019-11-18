import java.util.Scanner;
import java.io.*;

public class TugasTambahan{
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        boolean kondisi = true;
        while (kondisi){
            System.out.println(">>> File Manageku <<<");
            System.out.print("1. Buat file\n2. Baca file\n3. Edit file\n4. Duplikat file\n5. Hapus File\n>");
            
            FileWriter file = null;
            PrintWriter writer = null;
            BufferedWriter buffer = null;
            FileReader reader = null;
            BufferedReader reader_2 = null;

            int number = userInput.nextInt();
            if(number == 1){
                createFile(file, writer, number);
            }else if(number == 2){
                readFile(reader, reader_2, number);
            }else if(number == 3){
                editFile(reader, reader_2, file, writer, number);
            }else if(number == 4){
                duplicateFile(reader, file, number);
            }else if(number == 5){
                deleteFile(number);
            }else if(number > 5 || number < 1){
                System.out.println("Invalid input");
            }
            System.out.println("Do you want to continue? Y/N");
            String quit = userInput.next();
            if(quit.equalsIgnoreCase("n")){
                System.out.println("Thank you :)");
                kondisi = false;
            }
        }
    }
    static void createFile(FileWriter file, PrintWriter writer, int number) {
        try{
            System.out.println("Masukkan nama file : ");
            String fileName = userInput.next()+".txt";
            file = new FileWriter(fileName);

            writer = new PrintWriter(file);
            System.out.println("Masukkan isi file : ");
            userInput.nextLine();
            String s = userInput.nextLine();
            writer.print(s);
            System.out.print("\n");
            System.out.println("Berhasil menambahkan file");
        }catch(IOException ioe){
            System.out.println("Gagal menambahkan file");
        }finally{
            try{
                if(writer != null){
                    writer.close();
                }if(file != null){
                    file.close();
                }
            }catch (IOException ioe){
                System.out.println("Gagal menambahkan file");
            }
        }
    }
    static void readFile(FileReader file, BufferedReader reader, int number) {
        try{
            System.out.println("Masukkan nama file yang ingin di baca : ");
            String fileName = userInput.next()+".txt";
            file = new FileReader(fileName);

            reader = new BufferedReader(file);
            reader.mark(200);
            int dataLength = reader.read();
            System.out.println("isi file :");
            while (dataLength != -1){
                System.out.print((char)dataLength);
                dataLength = reader.read();
            }
            System.out.println("\n");
            reader.reset();
        }catch (IOException ioe){
            System.out.println("Gagal membaca file");
        }finally{
            try{
                if(reader != null){
                    reader.close();
                }if(file != null){
                    file.close();
                }
            }catch(IOException ioe){
                System.out.println("Gagal membaca file");
            }
        }
    }
    static void editFile(FileReader file, BufferedReader reader, FileWriter writer, PrintWriter print, int number) {
        try{
            System.out.println("Masukkan nama file yang ingin di edit : ");
            String fileName = userInput.next()+".txt";
            System.out.println("how many line sentence you want to write ?");
            int line = userInput.nextInt();
            file = new FileReader(fileName);
            reader = new BufferedReader(file);

            int dataLength = reader.read();
            String data = "";
            while (dataLength != -1){
                data += ((char)dataLength);
                dataLength = reader.read();
            }
            System.out.print(data + "\n");
            
            writer = new FileWriter(fileName);
            print = new PrintWriter(writer);
            String[] totalLine = new String[line+1];
            print.print(data);
            for(int i = 0 ; i <= line ; i++){
                totalLine[i] = userInput.nextLine();
            }
            for(int i = 0 ; i <= line ; i++){
                if (i == line) { print.print(totalLine[i]); }
                else{ print.println(totalLine[i]); }
            }
            System.out.print("\n");
            System.out.println("Berhasil mengedit file");

        }catch (IOException ioe){
            System.out.println("Gagal mengedit file");
        }finally{
            try{
                if(reader != null){
                    reader.close();
                }if(file != null){
                    file.close();
                }if(writer != null){
                    writer.close();
                }if(print != null){
                    print.close();
                }
            }catch(IOException ioe){
                System.out.println("Gagal mengedit file");
            }
        }
    }
    static void duplicateFile(FileReader reader, FileWriter writer, int number) {
        try{
            System.out.println("Masukkan nama file yang ingin di copy :");
            String fileName = userInput.next() + ".txt";
            reader = new FileReader(fileName);
    
            System.out.println("Masukkan nama file baru :");
            String newFile = userInput.next() + ".txt";
            writer = new FileWriter(newFile);

            int dataLength = reader.read();
            while(dataLength != -1){
                writer.write(dataLength);
                dataLength = reader.read();
            }
            System.out.print("\n");
            System.out.println("Berhasil copy file");
        }catch(IOException ioe){
            System.out.println("File not found");
            }finally{
            try{
                if(writer != null){
                    writer.close();
                }if(reader != null){
                    reader.close();
                }
            }catch (IOException ioe){
                System.out.println("File not found");
            }
        }
    }
    static void deleteFile(int number){
        System.out.println("Masukkan nama file yang ingin di hapus : ");
        String fileName = userInput.next() + ".txt";
        File file = new File(fileName);

        if(file.delete()){
            System.out.println("Berhasil menghapus file \n");
        }else{
            System.out.println("Gagal menghapus file \n");
        }
    }
}
