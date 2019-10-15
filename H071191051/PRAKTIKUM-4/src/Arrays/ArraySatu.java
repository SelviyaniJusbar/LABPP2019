package Arrays;

public class ArraySatu{
    public static void main(String[] args){
        char[] chars = {'F','A','J','R','I'};
        System.out.print("{");
        for (int i=0 ; i<chars.length ; i++){
            System.out.printf("%d%s",(int) chars[i],i == chars.length-1 ? "" : ",");
        }
        System.out.print("}");
    }
}