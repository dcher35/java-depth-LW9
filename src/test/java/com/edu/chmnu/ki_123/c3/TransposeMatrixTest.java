package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TransposeMatrixTest {
    //Тест для перевірки транспонування матриці 4х3
    @Test
    public void testTransposeMatrix4x3() {
        double[][] input = {
                {9.2, 2.5, 12.9},
                {4.4, 11.1, 6.0},
                {10.9, 8.1, 1.9},
                {5.2, 7.9, 3.0}
        };

        double[][] expected = {
                {9.2, 4.4, 10.9, 5.2},
                {2.5, 11.1, 8.1, 7.9},
                {12.9, 6.0, 1.9, 3.0}
        };

        double[][] result = TransposeMatrix.transpose(input);

        assertArrayEquals(expected, result);
    }

    //Тест для перевірки транспотування матриці 3х4
    @Test
    public void testTransposeMatrix3x4() {
        double[][] input = {
                {9.2, 2.5, 12.9, 4.4},
                {11.1, 6.0, 10.9, 8.1},
                {1.9, 5.2, 7.9, 3.0},
        };

        double[][] expected = {
                {9.2, 11.1, 1.9},
                {2.5, 6.0, 5.2},
                {12.9, 10.9, 7.9},
                {4.4, 8.1, 3.0}
        };

        double[][] result = TransposeMatrix.transpose(input);

        assertArrayEquals(expected, result);
    }

    //Тест для перевірки порожньої матриці
    @Test
    public void testTransposeMatrixEmpty() {

        double[][] input = {};
        double[][] expected = {};
        double[][] result = TransposeMatrix.transpose(input);

        assertArrayEquals(expected, result);
    }
}
