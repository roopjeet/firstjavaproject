package com.company;

public class forLoop {

    public static void main(String[] args) {
        printascendingnums();
        printadescendingnums();
        printEvennumbers();
        printOddnumbers();
        skip2numbers();

        }


        public static void printascendingnums() {
            System.out.println("Numbers from 1-100 in Ascending Order");
            for (int i = 1; i <= 100; i++){
                System.out.println(i);
            }
        }

    public static void printadescendingnums() {
        System.out.println("Numbers from 100-1 in Descending Order");
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void printEvennumbers() {
        System.out.println("Even Numbers in 1-100");
        for (int i = 1; i <= 100; i++){
            if(i%2 == 0){
                System.out.println(i);}
        }
        }

    public static void printOddnumbers() {
        System.out.println("Odd Numbers in 1-100");
        for (int i = 1; i <= 100; i++){
            if(i%2!=0){
                System.out.println(i);}
        }
    }

    public static void skip2numbers() {
        System.out.println("Print Numbers after skipping 2 numbers from 1-100");
        for (int i = 1; i <= 100; i=i+2){
            System.out.println(i);
        }
    }

    }


