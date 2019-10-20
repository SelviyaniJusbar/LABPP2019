package com.methods;

import java.util.Scanner;

public class Method_1{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int x = userInput.nextInt(), y = userInput.nextInt();
        int hasil = cariFpb(x, y);
        if(x==0 && y==0){
            System.out.println("FPB dari " + x + " dan " + y + " = " + "Undefined");
        }else{
            System.out.println("FPB dari " + x + " dan " + y + " = " + hasil);
        }
    }
    private static int cariFpb(int x, int y){
        int fpb = 1;
        if(x>0){
            if(y>0){
                for(int i=1 ; i<=Math.min(x, y) ; i++){     //FPB untuk x dan y > 0
                    if(x%i==0 && y%i==0){
                        fpb=i;
                    }
                }
            }else if(y==0){
                fpb=Math.max(x, y);                         //FPB untuk x > 0 dan y = 0
            }else{
                for(int i=1 ; i<=(Math.min(x, y)-Math.min(x, y))-Math.min(x, y) ; i++){ //FPB untuk x > 0 dan y < 0
                    if(x%i==0 && y%i==0){
                        fpb=i;
                    }
                }
            }
        }else if(x<0){                                      
            if(y<0){
                for(int i=1 ; i<=(Math.max(x, y)-Math.max(x, y))-Math.max(x, y) ; i++){ //FPB untuk x dan y < 0
                    if(x%i==0 && y%i==0){
                        fpb=i;
                    }
                }
            }else if(y==0){
                fpb = Math.max(x, y)-Math.min(x, y);        //FPB untuk x < 0 dan y = 0
            }else{
                for(int i=1 ; i<=(Math.min(x, y)-Math.min(x, y))-Math.min(x, y) ; i++){ //FPB untuk x < 0 dan y > 0
                    if(x%i==0 && y%i==0){
                        fpb=i;
                    }
                }
            }
        }
        else if(x==0){
            if(y>0){
                fpb=Math.max(x, y);                         //FPB untuk x = 0 dan y > 0
            }else if(y<0){
                fpb = Math.max(x, y)-Math.min(x, y);        //FPB untuk x = 0 dan y < 0
            }
        }
        return fpb;
    }
}