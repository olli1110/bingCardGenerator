package com.company;
import java.lang.Math;
import java.util.Arrays;

public class randomBingoCard {

    public static void main(String[] args) {
        int max1, max2, max3, max4, max5, min1, min2, min3, min4, min5, range1, range2, range3, range4, range5,
                rand1, rand2, rand3, rand4, rand5, rand11, rand12, rand13, rand14, rand21, rand22, rand23, rand24,
        rand31, rand33, rand34, rand41, rand42, rand43, rand44, rand51, rand52, rand53, rand54;
        int[][] array = new int[5][5];
        String space = " ";
        max1 = 15;
        min1 = 1;
        max2 = 30;
        min2 = 16;
        max3 = 45;
        min3 = 31;
        max4 = 60;
        min4 = 46;
        max5 = 75;
        min5 = 61;
        range1 = max1 - min1 + 1;
        range2 = max2 - min2 + 1;
        range3 = max3 - min3 + 1;
        range4 = max4 - min4 + 1;
        range5 = max5 - min5 + 1;

        //random numbers column1
        for (int i = 0; i < array[0].length; i++) {
            rand1 = (int) (Math.random() * range1) + min1;
            array[0][0]=rand1;
            rand11 = (int) (Math.random() * range1) + min1;
            array[0][1]=rand11;
            rand12 = (int) (Math.random() * range1) + min1;
            array[0][2]=rand12;
            rand13 = (int) (Math.random() * range1) + min1;
            array[0][3]=rand13;
            rand14 = (int) (Math.random() * range1) + min1;
            array[0][4]=rand14;

        for (int j = 0; j < array[0].length; j++) {
            }
        }
        //random numbers column2
        for (int i = 0; i < array[1].length; i++) {
            rand2 = (int) (Math.random() * range2) + min2;
            array[1][0]=rand2;
            rand21 = (int) (Math.random() * range2) + min2;
            array[1][1]=rand21;
            rand22 = (int) (Math.random() * range2) + min2;
            array[1][2]=rand22;
            rand23 = (int) (Math.random() * range2) + min2;
            array[1][3]=rand23;
            rand24 = (int) (Math.random() * range2) + min2;
            array[1][4]=rand24;

            for (int j = 0; j < array[1].length; j++) {
            }
        }
        //random numbers column3
        for (int i = 0; i < array[2].length; i++) {
            rand3 = (int) (Math.random() * range3) + min3;
            array[2][0]=rand3;
            rand31 = (int) (Math.random() * range3) + min3;
            array[2][1]=rand31;

            rand33 = (int) (Math.random() * range3) + min3;
            array[2][3]=rand33;
            rand34 = (int) (Math.random() * range3) + min3;
            array[2][4]=rand34;

            for (int j = 0; j < array[2].length; j++) {
            }
        }
        //random numbers column4
        for (int i = 0; i < array[3].length; i++) {
            rand4 = (int) (Math.random() * range4) + min4;
            array[3][0]=rand4;
            rand41 = (int) (Math.random() * range4) + min4;
            array[3][1]=rand41;
            rand42 = (int) (Math.random() * range4) + min4;
            array[3][2]=rand42;
            rand43 = (int) (Math.random() * range4) + min4;
            array[3][3]=rand43;
            rand44 = (int) (Math.random() * range4) + min4;
            array[3][4]=rand44;

            for (int j = 0; j < array[3].length; j++) {
            }
        }
        //random numbers column5
        for (int i = 0; i < array[4].length; i++) {
            rand5 = (int) (Math.random() * range5) + min5;
            array[4][0]=rand5;
            rand51 = (int) (Math.random() * range5) + min5;
            array[4][1]=rand51;
            rand52 = (int) (Math.random() * range5) + min5;
            array[4][2]=rand52;
            rand53 = (int) (Math.random() * range5) + min5;
            array[4][3]=rand53;
            rand54 = (int) (Math.random() * range5) + min5;
            array[4][4]=rand54;

            for (int j = 0; j < array[4].length; j++) {
            }
        }
        //array output
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {

                if(array[j][i] == array[2][2]) {
                    System.out.print("   ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }

            System.out.println();

        }
    }
}
