package com.company;

public class twodimesnsional2 {
    public static void main(String[] args) {
    //Declare a two dimensional array of 5 by 3, find average of each COLUMN
    int arr[][] = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12},
            {13,14,15},
    };

        for (int j=0; j<arr[j].length; j++){
        int sum = 0,avg = 0;
        for(int i=0; i<arr.length;i++){
            sum = sum + arr[i][j];
        }
        avg = sum/arr.length;
        System.out.println("the average of column " + j + " is " + avg);

    }
}
}

