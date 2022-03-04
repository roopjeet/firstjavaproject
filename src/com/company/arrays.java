package com.company;

import java.util.Random;

public class arrays{
    public static void main(String[] args) {
        //sum of decimal numbers
        double marks[] = {5.8,10.6,15.7, 20.9, 25,9};
        double s = 0;
        System.out.println("The sum of all decimal numbers");
        for(double i=0; i<5; i++){
            s = s+ marks[(int)i];
    }
        System.out.println(s);

        //sum of decimal numbers with random
        Random r = new Random();
        int arr[] = new int [5];
        int sum = 0;
        System.out.println("The sum of all decimal numbers");
        for(int j=0; j<5; j++){
            arr[j] = r.nextInt();
            sum = sum+ arr[(int)j];
        }
        System.out.println(sum);

        //Array of char and store first name
        char firstname[] = {'r','u','p','i','n','d','e','r'};
        System.out.println(firstname);
        for(int i=0; i<firstname.length; i++) {
            System.out.print(firstname[i]);
        }



}

        }
