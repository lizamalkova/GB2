package lesson2;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(int i, int j){
        i += 1;
        j += 1;
        System.out.println("Неверные данные в строке: " + i +" и столбце: " + j);
    }

}
