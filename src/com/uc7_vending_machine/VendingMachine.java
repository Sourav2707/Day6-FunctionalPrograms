package com.uc7_vending_machine;
import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) {
        System.out.println("Available notes are 1000, 500, 100, 50, 10, 5, 2, 1");
        System.out.println("Enter the amount to be withdrawn");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] notes = new int[] { 1000, 500, 100, 50, 10, 5, 2, 1 };
        int[] num = new int[8];
        for (int i = 0; i < 8; i++)
        {
            if (n >= notes[i])
            {
                num[i] = n / notes[i];
                n -= num[i] * notes[i];
            }
        }
        System.out.println("Minimum Notes required");
        for (int i = 0; i < 8; i++)
        {
            if (num[i] != 0)
            {
                System.out.println(notes[i]+" RS note x "+num[i]+" numbers");
            }
        }
    }
}
