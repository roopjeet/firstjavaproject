package com.company;

import java.util.Scanner;

public class Switch {
//CALCULATOR USING SWITCH
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers to perform operations on");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        System.out.println("Enter the Operations you want to perform \n 'm' or 'd' or 'a' or 's'");
        char operation = sc.next().charAt(0);

        switch(operation){
            case 'm' :
                System.out.println("Result of your entries is: "+ (num1*num2));
                break;
            case 'd' :
                System.out.println("Result of your entries is: "+ (num1/num2));
                break;
            case 'a' :
                System.out.println("Result of your entries is: "+ (num1+num2));
                break;
            case 's' :
                System.out.println("Result of your entries is: "+ (num1-num2));
                break;
        }

    }
}
