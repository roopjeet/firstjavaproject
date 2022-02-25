package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        System.out.println(--i);
        System.out.println(i);
        int s = sum(2, 3);
        System.out.println("Show the value of the sum is " + s);
        System.out.println(sum(2, 3));
        getFullname("Rupinder", "Jit");
        square(6);
        areaofrectangle(4, 5);
        areaofcircle(6);

    }


    public static int sum(int a, int b) {

        return a + b;
    }

    public static void getFullname(String firstname, String lastname) {
        System.out.println("My full name is " + firstname + " " + lastname);
    }

    public static void square(int a) {
        System.out.println("The square of number is " + a * a);
    }

    public static void areaofrectangle(int l, int b) {
        System.out.println("The area of rectangle is" + l * b);
    }

    public static void areaofcircle(float r) {
        System.out.println("The area of circle is " + 3.14 * r * r);
    }

}
