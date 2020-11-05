package lesson2;

import java.util.Scanner;

public class extra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк и столбцов:");
        int row = sc.nextInt();
        int column = sc.nextInt();
        try {
          arraySizeTest(row,column);
        } catch (MyArraySizeException e){
          e.printStackTrace();
        }

        int[][] array = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
               array[i][j] = 0;
            }
        }

        int downj = 0;
        int upj = column - 1;
        int li = 0;
        int ri = row - 1;

        int num = 1;

        while ( downj <= upj && li <= ri) {

            for (int downi = 0; downi < row; downi++) {
                if (array[downi][downj] == 0) {
                    array[downi][downj] = num;
                    num++;
                }
            }
            downj++;

            for (int rj = 0; rj < column; rj++) {
                if (array[ri][rj] == 0) {
                    array[ri][rj] = num;
                    num++;
                }
            }
            ri--;

            for (int upi = row - 1; upi >= 0; upi--) {
                if (array[upi][upj] == 0) {
                    array[upi][upj] = num;
                    num++;
                }
            }
            upj--;

            for (int lj = column - 1; lj >= 0; lj--) {
                if (array[li][lj] == 0) {
                    array[li][lj] = num;
                    num++;
                }
            }
            li++;
        }
        printArray(array);
    }

    public static void arraySizeTest(int row, int column)
            throws MyArraySizeException {
        if (row ==0 || column == 0) {
            throw new MyArraySizeException("Строка и столбец не может быть равен 0!");
        }
    }
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
