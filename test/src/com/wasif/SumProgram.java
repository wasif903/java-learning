package com.wasif;

import java.util.Scanner;

public class SumProgram {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter First Number: ");
        float sum1 = input.nextFloat();
        System.out.print("Please Enter Second Number: ");
        float sum2 = input.nextFloat();

        float result = sum1 + sum2;
        System.out.print("The Sum Of Your Given Number Is: " + result);
    }
}
