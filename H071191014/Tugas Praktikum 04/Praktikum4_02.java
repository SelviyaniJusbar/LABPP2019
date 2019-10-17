import java.util.Arrays;
class Praktikum4_02{
    public static void main(String[] args) {
        char[] a = {'a','n','d','i'};
        char[] b = {'q','a','l','b','i'};
        char c;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.print("A <-> B\n");

        for (int i = 0; i < (a.length < b.length ? a.length:b.length); i++) {
            c = a[i];
            a[i] = b[i];
            b[i] = c;
        }
    }
}
