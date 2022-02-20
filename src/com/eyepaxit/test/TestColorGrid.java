package com.eyepaxit.test;

public class TestColorGrid {
    public static void main(String args[])
    {
        // blue => 1
        //red => 2
        //grey => 3

        int input[][] = {{1, 1, 3, 1, 1, 2, 2, 1, 2, 1},
                {1, 2, 2, 2, 3, 2, 2, 2, 3, 1},
                {3, 3, 3, 3, 2, 3, 2, 3, 3, 3},
                {3, 3, 3, 1, 3, 1, 1, 1, 2, 3},
                {1, 1, 1, 2, 3, 2, 1, 2, 3, 2},
                {2, 1, 1, 2, 2, 1, 1, 2, 3, 2},
                {2, 3, 1, 2, 1, 2, 3, 1, 1, 1},
                {1, 3, 2, 2, 2, 2, 1, 1, 2, 2},
                {2, 2, 3, 1, 3, 3, 1, 2, 2, 3},
                {2, 1, 1, 1, 1, 1, 2, 1, 1, 3},
                {1, 2, 1, 1, 2, 1, 1, 1, 2, 2},
                {1, 2, 1, 1, 3, 1, 1, 1, 3, 2}
    };

        // function to compute the largest
        // connected component in the grid
        new PracticalTest().computeLargestConnectedGrid(input);
    }
}
