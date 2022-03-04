package com.company;

public class stringreverse {
    public static void main(String[] args) {

        String name = "rupinder";
        char[] chars = name.toCharArray();

        char[] reverseArr = new char[name.length()];

        int length = chars.length;
        int lastindex = length - 1;
        for (int i = 0; i < length; i++) {
            reverseArr[lastindex - i] = chars[i];
        }
        System.out.println(reverseArr);

    }

}
