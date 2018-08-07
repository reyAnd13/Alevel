package com.alevel.hometask.transposematrix;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {

        int heght = 3;
        int width = 3;
        int[][] matA = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };

        System.out.println(Arrays.deepToString(matA));

        int[][] matB = new int[heght][width];
        for (int i = 0; i < heght; ++i) {
            for (int j = 0; j < width; ++j) {
                matB[i][j] = matA[j][i];
            }
        }

    }

}
