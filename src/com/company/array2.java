package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class array2 {

    public static void main(String[] args) {

        //Given string s , and index i and Index j, create function to swap character present at index i and index j
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string :");
        String s = sc.nextLine();
        System.out.println("Enter the value of index i : ");
        int i = sc.nextInt();
        System.out.println("Enter the value of index j :");
        int j = sc.nextInt();
        swapChar(s,i,j);
    }
    public static void swapChar(String s, int i,int j){
        char[] chars = s.toCharArray();
        System.out.println("The Entered String is  :\n"+ Arrays.toString(chars));
        char temp;
        temp=chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
        String s1 = Arrays.toString(chars);
        System.out.println("String after swapping is :\n "+s1);
        System.out.println(noted);
    }
}

