package com.uc5_coupon;

import java.util.Random;
import java.util.Scanner;
public class Coupon {
    public static void main(String[] args) {
        System.out.println("How many digits should the coupon number have: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random rnd = new Random();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++)             //for storing numbers in an array
        {
            int r = rnd.nextInt(0, n);
            ar[i] = r;
            for (int j = 0; j < i; j++)         //loop from the 0th number to the outer loop index number
            {
                if (ar[i] == ar[j])             //to compare outer loop number with all the previous numbers
                {
                    ar[i] = rnd.nextInt(0, n);              //if finds the number equal, stores a random number in it
                    i--;              //decreases the outer loop index by one and breaks the inner loop,
                    break;            // so that after increment in the outer loop same number is checked again for equality
                }
            }
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print(ar[i] + "  ");
        }
    }
}
