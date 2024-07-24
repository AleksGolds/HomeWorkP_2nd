package Lesson3;

public class ArrayTasks {
    public static void main(String[] args) {
        int min = findMin(new int []{4,6,-1,7});
        System.out.println(min);


    }

    /**
     * Ищет минимальное число
     * @param array массив
     * @return
     */
    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<array.length; i++){
            if (array[i]<min) {
                min = array[i];
            }

        }
        return min;

    }

    /** Найти сумму между максимумом и минимумом (не включая)
     *
     * @param array
     * @return
     */

    public static int findSummBetweenMinAndMax(int[] array){
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int sum = 0;
        // нашли минимум и максимум
        for (int i = 0; i<array.length; i++){
            if (array[i]<min) {
                min = array[i];
            }

            if (array[i]>max) {
                max = array[i];
            }


        }
        return sum;



    }

    // Заполняет чётные столбцы двумерного массива строк плюсами (+),остальные " "
    public static void fiilWithPlus(String[][] arrayStr){
        for (int i = 0; i<arrayStr.length;i++) {
            for (int j=0; j< arrayStr[i].length;j++){

            }
        }
    }

}
