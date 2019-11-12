package com.methods;

import java.util.Scanner;

public class Method_3{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int input = userInput.nextInt();
        myDay(input);
    }
    private static void myDay(int days){
        int year = 0;
        int month = 0;
        year = days/365;
        days = days%365;
        month = days/30;
        days = days%30;
        System.out.printf("%d tahun\n%d bulan\n%d hari",year,month,days);
    }
}