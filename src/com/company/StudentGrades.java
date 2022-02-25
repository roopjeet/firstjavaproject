package com.company;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in first subject");
        int s1 = sc.nextInt();
        System.out.println("Enter the marks in second subject");
        int s2 = sc.nextInt();
        System.out.println("Enter the marks in third subject");
        int s3 = sc.nextInt();
        System.out.println("Enter the marks in fourth subject");
        int s4 = sc.nextInt();
        System.out.println("Enter the marks in fifth subject");
        int s5 = sc.nextInt();
        studentGrades(s1,s2,s3,s4,s5);
    }

    public static void studentGrades(int s1, int s2, int s3, int s4, int s5) {
        int studentMarks = s1 + s2 + s3 + s4 + s5;
        float a = (studentMarks * 100 / 500);
        System.out.println("You scored"+" "+ a + "%");
        if(a>=80){
            System.out.println("Grade A");}
        else if (a>=70 && a<80){
            System.out.println("Grade B");}
        else if (a>=60 && a<70){
            System.out.println("Grade C");}
        else if(a<60){
            System.out.println("Grade D");}
    }
}
