package lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {{"1", "a", "3", "6"},
                {"5", "6", "7", "1"},
                {"9", "10", "11", "1"},
                {"9", "10", "11", "1"}};

        printArray(arr);

        int i = arr.length;
        int j = arr.length;
        for (int jx = 0; jx < arr.length; jx++) {
            if (arr[jx].length != arr.length) {
                j = arr[jx].length;
            }
        }
        try {
            arraySizeTest(i, j);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            arrToIntSum(arr);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }


    public static void arraySizeTest(int row, int column)
            throws MyArraySizeException {
        if (row != 4 || column != 4) {
            throw new MyArraySizeException("Массив может быть только 4х4!");
        }
    }

    public static void arrToIntSum(String[][] arr)
            throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Сумма массива: " + sum);
    }


    public static void printArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();

        }
    }
}
