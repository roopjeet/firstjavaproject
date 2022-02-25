package com.company;


import java.util.Scanner;

public class forLoop2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc1.nextInt();
        printFactorial(num);

        //PRINT FIBONACCI SERIES

        int a = 0;
        int b = 1;
        for (int i = 0; i < 7; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
        //SWAPPING NUMBERS WITHOUT THIRD VARIABLE

        int i = 5;
        int j = 10;
        i = i * j;
        j = i / j;
        i = i / j;
        System.out.println("After swapping i : " + i + "\n j: " + j);
        // OR
        i = i + j;
        j = i - j;
        i = i - j;
        System.out.println("After swapping i : " + i + "\n j: " + j);


        //NUMBER GUESSING GAME

        Scanner sc = new Scanner(System.in);
        int compNum = (int) (Math.random() * 100);
        System.out.println(compNum);
        while (true) {
            System.out.println("Guess the number");
            int input = sc.nextInt();
            if (input == compNum) {
                System.out.println("You guessed the number");
                break;
            }
            System.out.println("Try Again");
            if (input > compNum) {
                System.out.println("Hint:The actual number is less than your number");
            } else {
                System.out.println("Hint: The actual number is more than your number");
            }
        }

        for (int c = 1; c <= 5; c++) {
            for (int d = 1; d <= 5; d++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //FACTORIAL OF NUMBER
        public static void printFactorial(int num) {
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of " + num + " is : " + fact);
    }
    }





