package com.methods;

import java.util.Scanner;

import java.util.Random;

public class Method_2{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        int m = userInput.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
    }
    public static String generateSerial(int x, int y){
        Random randomNumber = new Random();
        String str = "";    
        for(int i=0 ; i<x ; i++){                   //perulangan untuk tanda "-"
            for(int j=0 ; j<y ; j++){               //perulangan untuk angka
                str += randomNumber.nextInt(9);     
            }
            if(i<(x-1)){
                str += "-";
            }
        }
        return str;
    }
}