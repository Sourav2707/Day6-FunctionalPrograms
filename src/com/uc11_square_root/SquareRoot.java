package com.uc11_square_root;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println("Enter a non negative integer whose square root you want to find");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double t = n;
        double epsilon = 1e-15;
        while (Math.abs(t - n / t) > epsilon * t) {
            t = (t + (n / t)) / 2;
            System.out.println("Square root of " + n + " is " + t);
        }
    }
}
