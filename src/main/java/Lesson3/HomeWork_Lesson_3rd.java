

package src.main.java.Lesson3;

import java.util.Arrays;

public class HomeWork_Lesson_3rd {
    public static void main(String[] args) {
        /*changePlace(new int[]{1, 0, 0, 0, 0, 1});
        newToMass(new int[100]);
        MelSixMultTwice(new int[]{1,2,3,4,5,6,7,8,9,100});
        diagonalChange();
        System.out.println(Arrays.toString(returnMassVal(4,5)));
        System.out.println(Arrays.toString(findMinMax(new int[]{-20,10,8,17,55})));*/
        System.out.println(checkBalance(new int[]{1, 1, 1, 2, 1}));


    }

    public static void changePlace(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {

                arr[i] = 1;
                System.out.println("arr[" + i + "] = " + arr[i]);
            } else {
                arr[i] = 0;
                System.out.println("arr[" + i + "] = " + arr[i]);
            }

        }
    }

    public static void newToMass(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

    }

    public static void MelSixMultTwice(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.println("arr[" + i + "] = " + arr[i]);

        }
    }

    public static void diagonalChange() {
        int arr[][] = new int[4][4];

        // заполним данными от 1 до 16
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || i == arr.length - 1 - j) {
                    arr[i][j] = index;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }
    }

    public static int[] returnMassVal(int len, int initualValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initualValue;

        }
        return arr;

    }

    public static int[] findMinMax(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        int minmax[] = new int[]{min, max};
        return minmax;

    }

    public static boolean checkBalance(int[] arr) {
        boolean c = false;
        int sum = 0;
        int sum2;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            sum2 = 0;
            if (c == false) {
                for (int j = arr.length - 1; j > i; j--) {
                    sum2 = sum2 + arr[j];
                }
                if (sum == sum2) {
                    c = true;
                }
            }

        }
        return c;

    }


}



