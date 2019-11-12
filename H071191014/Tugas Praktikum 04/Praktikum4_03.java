import java.util.Arrays;
class Praktikum4_03{
    public static void main(String[] args) {
        int[] a = {'a','n','d','i'};
        int[] b = {'q','a','l','b','i'};

        System.out.print("A = {");
        for (int i = 0; i < a.length;i++ ) {
            System.out.printf("%s%s",(char)a[i],i < a.length - 1 ? ",":"");
        }
        System.out.print("}\n");
        System.out.print("B = {");
        for (int i = 0; i < b.length;i++ ) {
            System.out.printf("%s%s",(char)b[i],i < b.length - 1 ? ",":"");
        }
        System.out.print("}\n");
        System.out.print("A <-> B\n");

        for (int i = 0; i < (a.length < b.length ? a.length : b.length); i++) {
            a[i] = a[i] + b[i];
            b[i] = a[i] - b[i];
            a[i] = a[i] - b[i];
        }
        System.out.print("A = {");
        for (int i = 0; i < a.length;i++ ) {
            System.out.printf("%s%s",(char)a[i],i < a.length - 1 ? ",":"");
        }
        System.out.print("}\n");
        System.out.print("B = {");
        for (int i = 0; i < b.length;i++ ) {
            System.out.printf("%s%s",(char)b[i],i < b.length - 1 ? ",":"");
        }
        System.out.print("}");
    }
}
