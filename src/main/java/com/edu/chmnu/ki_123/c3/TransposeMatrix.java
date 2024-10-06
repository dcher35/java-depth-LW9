package com.edu.chmnu.ki_123.c3;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        double[][] matrix = {
                {9.2, 2.5, 12.9},
                {4.4,11.1, 6.0},
                {10.9, 8.1, 1.9},
                {5.2, 7.9, 3.0,}
        };

        System.out.println("Original matrix:");
        printMatrix(matrix);

        System.out.println("------------------");

        double[][] transposedMatrix = transpose(matrix);

        System.out.println("Transposed matrix:");
        printMatrix(transposedMatrix);
    }

    public static double[][] transpose(double[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new double[0][0];
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposedMatrix = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}