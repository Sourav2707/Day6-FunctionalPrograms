package com.uc10_monthly_pay;

import java.util.Scanner;
import java.util.Scanner;
public class MonthlyPay {
    public static void main(String[] args) {
        System.out.println("Enter the principle amount");
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        System.out.println("Enter for how many years");
        int y = sc.nextInt();
        System.out.println("Enter the rate to be compounded monthly");
        double r = sc.nextDouble();
        double n = 12 * y;
        double rr = r / 1200;
        var result = (p * r / (1 - (Math.pow(((1 + r)), -n))));  //payment to be made monthly
        System.out.println("Payment to be made monthly is "+result);
    }
}
