package Lesson3;

import java.util.Arrays;

public class ArrayStudy {
    public static void main(String[] args) {

        /**
         * definition
         * int array [];
         * String array [];
         * boolean [];
         *
         */
        int arrayint[] = new int[10];//default 0
        String arrayStr[] = new String[20];//default 0
        boolean arrayBoo[] = new boolean[5];//default 0 (false)

        Arrays.fill(arrayint, 10);

        /*for (int i = 0; i < arrayint.length; i++) {
            arrayint[i] = i + 1;
            System.out.println(arrayint[i]);
        }*/

        int dda[][] = new int[4][4];
       /* System.out.println(Arrays.toString(arrayint));
        System.out.println(Arrays.toString(dda[0]));*/



        // заполним данными от 1 до 16
        int index = 1;
        for (int i = 0; i < dda.length; i++) {
            for (int j = 0; j < dda[i].length; j++) {
                dda[i][j] = index;
                index++;
            }
        }


        for (int i = 0; i < dda.length; i++) {
            System.out.println(Arrays.toString(dda[i]));
        }

        int doubleMas[][] = new int[4][];
        for (int i = 0; i < doubleMas.length; i++) {
            doubleMas[i] = new int[2 + i];
            System.out.println(Arrays.toString(doubleMas[i]));
        }
        index = 1;
        for (int i = 0; i < doubleMas.length; i++) {
            for (int j = 0; j < doubleMas[i].length; j++) {
                doubleMas[i][j] = index;
                index++;
            }
        }
        //for (int i = 0; i < doubleMas.length; i++) {
            //System.out.println(Arrays.toString(doubleMas[i]));


        }
        //0    1   2   3   4   n-1
        //[]  []  []  []  []  []


    }

