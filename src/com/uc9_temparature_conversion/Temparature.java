package com.uc9_temparature_conversion;
import java.util.Scanner;
public class Temparature {
    public static void main(String[] args) {
        System.out.println("Enter your choice : 1- Celsius to fahrenheit , 2- fahrenheit to Celsius");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice != 1 && choice != 2)
        {
            System.out.println("Wrong input");
        }
        else
        {
            System.out.println("Enter the value you want to convert");
            double convert = sc.nextDouble();
            double converted = 0;
            if(choice == 1)
            {
                converted= (convert* 9 / 5) +32 ;              //deg C to deg F
            }
            else
            {
                converted= (convert -32)*5/9;                  //deg F to deg C
            }
            System.out.println("Converted value is = "+converted);
        }
    }

}
