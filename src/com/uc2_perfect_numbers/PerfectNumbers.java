package com.uc2_perfect_numbers;
import java.util.Scanner;
public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("The divisors for "+n+":");
        for (int i = 1; i <= n / 2; i++)
        {
            if (n % i == 0)
            {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(n+" = "+sum);
        if (n == sum)
        {
            System.out.println(n+" is a perfect number");
        }
        else
        {
            System.out.println(n+" is not a perfect number");
        }
    }
}
