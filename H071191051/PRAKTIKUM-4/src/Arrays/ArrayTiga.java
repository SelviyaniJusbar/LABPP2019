package Arrays;

public class ArrayTiga{
    public static void main(String[] args){
        int [] a = {'M','U','H','A','M','M','A','D'};
        int [] b = {'F','A','J','R','I'};

        System.out.print("A = {");
        for(int i=0 ;i<a.length ; i++){
            System.out.printf("%c%s",(char)a[i],i == a.length-1 ? "" : ",");
        }
        System.out.print("}\n");
        System.out.print("B = {");
        for(int i=0 ; i<b.length ; i++){
            System.out.printf("%c%s",(char)b[i],i == b.length-1 ? "" : ",");
        }
        System.out.print("}\n");
        System.out.println("A <-> B");
        for(int i=0 ; i<(a.length<b.length ? a.length : b.length) ; i++){
            a[i] = a[i] + b[i];
            b[i] = a[i] - b[i];
            a[i] = a[i] - b[i];   
        }
        System.out.print("A = {");
        for(int i=0 ;i<a.length ; i++){
            System.out.printf("%c%s",(char)a[i],i == a.length-1 ? "" : ",");
        }
        System.out.print("}\n");
        System.out.print("B = {");
        for(int i=0 ; i<b.length ; i++){
            System.out.printf("%c%s",(char)b[i],i == b.length-1 ? "" : ",");
        }
        System.out.print("}");
    } 
}