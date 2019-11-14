import java.util.HashMap;
import java.util.Scanner;

class Morse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gunakan tanda // untuk menghasilkan spasi");
        String morse = sc.nextLine();
        String []sp = morse.split(" ");

        HashMap <String, Character> morseCode = new HashMap<>();
        morseCode.put("//", ' ');
        morseCode.put(".-", 'A');
        morseCode.put("-...", 'B');
        morseCode.put("-.-.", 'C');
        morseCode.put("-..", 'D');
        morseCode.put(".", 'E');
        morseCode.put("..-.", 'F');
        morseCode.put("--." , 'G');
        morseCode.put("....", 'H');
        morseCode.put("..", 'I');
        morseCode.put(".---", 'J');
        morseCode.put("-.-", 'K');
        morseCode.put(".-..", 'L');
        morseCode.put("--", 'M');
        morseCode.put("-.", 'N');
        morseCode.put("---", 'O');
        morseCode.put(".--.", 'P');
        morseCode.put("--.-", 'Q');
        morseCode.put(".-.", 'R');
        morseCode.put("...", 'S');
        morseCode.put("-", 'T');
        morseCode.put("--.", 'U');
        morseCode.put("...-", 'V');
        morseCode.put(".--", 'W');
        morseCode.put("-..-", 'X');
        morseCode.put("-.--", 'Y');
        morseCode.put("--..", 'Z');
        

        for (String tes : sp) {
            morseCode.get(tes);
            System.out.print(morseCode.get(tes));
        }

        // for (String key : morseCode.keySet()){
        //     // morse = morse.replace(key, morseCode.keySet());
        //     System.out.println(morseCode.keySet());
        // }

        // for (String value : morseCode.values()){
        //     str = str.replace(value,morseCode.));
        // }

        // static String getKey (HashMap<String,String> morseCode, String value) {
        //     for (String key : morseCode.keySet()){
        //         str = str.replace(key, morseCode.keySet());
        //     }
        // }
        // str = str.replace("//", "");
        sc.close();
    }
}