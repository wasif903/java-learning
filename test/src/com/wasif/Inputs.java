package com.wasif;

import java.util.Scanner;

public class Inputs {
    public static void main() {
        Scanner inputs = new Scanner(System.in);
        System.out.print("Please Enter Your Roll Number: ");
        int rollNo = inputs.nextInt();
        System.out.println(
                "Your Roll Number Is : " + rollNo
        );
    }
}
