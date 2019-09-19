import java.util.Scanner;
class Pokemon {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
    
        String pokemon1 = sc.next();
        String a = sc.next();
        System.out.println("VS");
        String pokemon2 = sc.next();
        String b = sc.next();

        if (a.equals(b)) {
            System.out.println("draw");
        } else if (a.equals("fire")) {
            if (b.equals("ice")) {
            System.out.println(pokemon1);
            } else if (b.equals("ground")) {
                System.out.println(pokemon2);
            } else if (b.equals("electric")) {
                System.out.println(pokemon1);
            } else if (b.equals("water")) {
                System.out.println(pokemon2);
            }
        } else if (a.equals("ice")) {
            if (b.equals("fire")) {
                System.out.println(pokemon2);
            } else if (b.equals("ground")) {
                System.out.println(pokemon1);
            } else if (b.equals("electric")) {
                System.out.println(pokemon2);
            } else if (b.equals("water")) {
                System.out.println(pokemon1);
            }
        } else if (a.equals("ground")) {
            if (b.equals("fire")) {
                System.out.println(pokemon1);
            } else if (b.equals("ice")) {
                System.out.println(pokemon2);
            } else if (b.equals("electric")) {
                System.out.println(pokemon1);
            } else if (b.equals("water")) {
                System.out.println(pokemon2);
            }
        } else if (a.equals("electric")) {
            if (b.equals("fire")) {
                System.out.println(pokemon2);
            } else if (b.equals("ice")) {
                System.out.println(pokemon1);
            } else if (b.equals("ground")) {
                System.out.println(pokemon2);
            } else if (b.equals("water")) {
                System.out.println(pokemon1);
            }
        } else if (a.equals("water")) {
            if (b.equals("fire")) {
                System.out.println(pokemon1);
            } else if (b.equals("ice")) {
                System.out.println(pokemon2);
            } else if (b.equals("ground")) {
                System.out.println(pokemon1);
            } else if (b.equals("electric")) {
                System.out.println(pokemon2);
            }
        }
        sc.close();
    }
}