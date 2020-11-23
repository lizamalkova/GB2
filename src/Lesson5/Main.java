package Lesson5;

import java.util.Arrays;

public class Main {

    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        calculate1(fillArray());
        calculate2(fillArray());
    }

    public static float[] fillArray() {
        float[] arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1.0f;
        }
        return arr;
    }

    public static void calculate1(float[] arr) {
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5)
                    * Math.cos(0.2f + i / 5)
                    * Math.cos(0.4f + i / 2));
        }
        long b = System.currentTimeMillis();
        System.out.println( "Время выполнения первого метода: " + (b - a) );
    }

    public static void calculate2(float[] arr){
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        new Thread(new Runnable() {
            @Override
            public void run(){
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5)
                            * Math.cos(0.2f + i / 5)
                            * Math.cos(0.4f + i / 2));
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run(){
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5)
                            * Math.cos(0.2f + i / 5)
                            * Math.cos(0.4f + i / 2));
                }
            }
        }).start();

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        long b = System.currentTimeMillis();
        System.out.println( "Время выполнения второго метода: " + (b - a) );
    }
}

