package com.uc12_to_binary;

import java.util.Scanner;

public class ToBinary {
    public static void main(String[] args) {
        System.out.println("Enter a number whose binary you want to find");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String bin = "";
        System.out.println("Binary of "+n+" is ");
        while (n > 0)
        {
            bin = n % 2 + bin;
            n = n / 2;
        }
        System.out.println(bin);
    }
}
