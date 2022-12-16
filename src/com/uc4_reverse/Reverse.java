package com.uc4_reverse;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt()
        int rem = 0, rev = 0;
        while (n != 0)
        {
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        System.out.println("The reverse is "+rev);
    }
}
