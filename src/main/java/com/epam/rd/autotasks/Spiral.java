package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {

        int[][] matrix = new int[rows][columns];

        int rowBeggin = 0;
        int rowEnd = rows - 1;
        int columnsBeggin = 0;
        int columnsEnd = columns - 1;

        int counter = 1;

        while (rowBeggin <= rowEnd && columnsBeggin <= columnsEnd) {
//left to right
            for (int column = columnsBeggin; column <= columnsEnd; column++) {
                matrix[rowBeggin][column] = counter++;
            }//
            //right ot down
            for (int row = rowBeggin + 1; row <= rowEnd; row++) {
                matrix[row][columnsEnd] = counter++;
            }//
            //down to left
            if (rowBeggin < rowEnd && columnsBeggin < columnsEnd) {

                for (int column = columnsEnd - 1; column > columnsBeggin; column--) {
                    matrix[rowEnd][column] = counter++;
                }
                //
                //left to up
                for (int row = rowEnd; row > rowBeggin; row--) {
                    matrix[row][columnsBeggin] = counter++;
                }
            }

            rowBeggin++;
            rowEnd--;
            columnsBeggin++;
            columnsEnd--;


        }

        return matrix;
    }






















    public static void main(String[] args) {

         int[][] matrix = Spiral.spiral(2, 2);


            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(String.format("%4s", matrix[i][j]));
                }

          }


    }
}
