import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

class Film {
    static Scanner sc = new Scanner(System.in);
    static HashMap <Integer, ArrayList<String>> movies = new HashMap<>();
    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            list();
            System.out.println("(d)Detail (s)Search (a)Add (r)Remove (e)Exit\n>");
            String input = sc.nextLine();

            if (input.equals("d")) {
                System.out.print("Detail film ke - ");
                int d = sc.nextInt();
                detail(d);
            } else if (input.equals("s")) {
                String s = sc.nextLine();
                System.out.printf("Hasil Pencarian %s = " , s);
                search(s);
            } else if (input.equals("a")) {
                System.out.print("Urutan film ke - ");
                int a = sc.nextInt();
                sc.nextLine();
                add(a);
            } else if (input.equals("r")) {
                System.out.print("Hapus film ke - ");
                int r = sc.nextInt();
                remove(r);
            } else if (input.equals("e")) {
                run = false;
            }   
        }
    }
    static void judul (int j) {
        System.out.println(movies.get(j).get(0));
    }
    static void list () {
        movies.forEach((key, value) -> {
            System.out.println(key + " . " + value.get(0));
        });
    }
    static void detail (int d) {
        System.out.println("Judul\t = " + movies.get(d).get(0));
        System.out.println("Rilis\t = " + movies.get(d).get(1));
        System.out.println("Durasi\t = " + movies.get(d).get(2));
        System.out.println("Genre\t = " + movies.get(d).get(3));
        System.out.println("Sinopsis = " + movies.get(d).get(4));
        System.out.println("Cast\t = " + movies.get(d).get(5));
    }
    static void search (String s) {
        HashMap <Integer, String> judul = new HashMap<>();
        try {
            for (int i = 1 ; i <= judul.size() ; i++) {
                if (judul.get(i).contains(s)) {
                    System.out.print(judul.keySet().toArray()[i - 1] + " ");
                    System.out.println(judul.get(judul.keySet().toArray()[i - 1]));
                } 
            }
            System.out.println();
        } catch (IndexOutOfBoundsException e) {
            System.out.printf("Inputan tidak valid %s\n" , judul);
        }
    }
    static void remove (int r) {
        movies.remove(r);
    }
    static void add (int a) {
        ArrayList<String> detailFilm = new ArrayList<>();
        System.out.print("Judul\t = ");
        String judul = sc.nextLine();
        System.out.print("Rilis\t = ");
        String rilis = sc.nextLine();
        System.out.print("Durasi\t = ");
        String durasi = sc.nextLine();
        System.out.print("Genre\t = ");
        String genre = sc.nextLine();
        System.out.print("Sinopsis = ");
        String sinopsis = sc.nextLine();
        System.out.print("Cast\t = ");
        String cast = sc.nextLine();

        detailFilm.add(judul);
        detailFilm.add(rilis);
        detailFilm.add(durasi);
        detailFilm.add(genre);
        detailFilm.add(sinopsis);
        detailFilm.add(cast);
        movies.put(a, detailFilm);
    }
}