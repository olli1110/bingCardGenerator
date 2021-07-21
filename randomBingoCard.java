package com.company;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

public class randomBingoCard {

    public static void main(String[] args) {
        //2d array which displays the bingo card
        int[][] card = new int[5][5];
        int number;
        int index = 0;
        int col = 0;
        int increment = 1;
        boolean space = false;
        //arraylist to pick unique random numbers from
        ArrayList<Integer> list = new ArrayList<>();

        //while loop to pick random numbers until the card is full
        while (col < card.length) {
            //generate a random number within the provided range
            while (list.size() < 5) {
                number = (int) (Math.random() * 15) + increment;
                //check if the number generated is already in the list
                if (!list.contains(number))
                    list.add(number);
            }
            //jump to the next row until the max index is reached
            for (int i : list)
                card[index++][col] = i;
            //jump back to index 0
            index = 0;
            //increment the random numbers by 15 for the next column
            increment += 15;
            //clear the list with the old numbers
            list.clear();
            //jump to the next column
            col++;
            card[2][2] = 0;
        }

            System.out.println(Arrays.deepToString(card).replace("], ", "\n").replace(", ", "  ").replace("[", "").replace("]]", "").replace(" 0", "  "));


    }
}
