package com.company;
import java.util.Scanner;

import static java.lang.Math.PI;

public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double inputNumber = input.nextFloat();
        double a = 2*PI*inputNumber;
        double b = PI*(inputNumber*inputNumber);
        System.out.println("Perimeter ="+a);
        System.out.println("Area ="+b);
    }
}