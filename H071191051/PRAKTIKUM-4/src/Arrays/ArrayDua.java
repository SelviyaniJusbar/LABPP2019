package Arrays;

public class ArrayDua{
    public static void main(String[] args){
        char[] a = {'M','U','H','A','M','M','A','D'};
        char[] b = {'F','A','J','R','I'};
        char c;
        System.out.print("A = {");
        for(int i=0 ;i<a.length ; i++){
            System.out.printf("%c%s",a[i],i == a.length-1 ? "" : ",");
        }
        System.out.print("}\n");
        System.out.print("B = {");
        for(int i=0 ; i<b.length ; i++){
            System.out.printf("%c%s",b[i],i == b.length-1 ? "" : ",");
        }
        System.out.print("}\n");
        System.out.println("A <-> B");
        for(int i=0 ; i<(a.length<b.length ? a.length : b.length) ; i++){
            c = a[i];
            a[i] = b[i];
            b[i] = c;
        }
        System.out.print("A = {");
        for(int i=0 ;i<a.length ; i++){
            System.out.printf("%c%s",a[i],i == a.length-1 ? "" : ",");
        }
        System.out.print("}\n");
        System.out.print("B = {");
        for(int i=0 ; i<b.length ; i++){
            System.out.printf("%c%s",b[i],i == b.length-1 ? "" : ",");
        }
        System.out.print("}");
    } 
}