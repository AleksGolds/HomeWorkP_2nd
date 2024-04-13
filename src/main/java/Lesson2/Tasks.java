package Lesson2;

public class Tasks {
    public static void main(String[] args) {
        System.out.println(evenSum(10, MyEnum.ODD));
        System.out.println(evenSum(10, MyEnum.EVEN));
        printCubes(2, 8);
        System.out.println(fact(25));

    }

    /**
     * Найти сумму чётных цифр числа
     */
    public static int evenSum(int n, MyEnum e) {
        int sum = 0;
        for (int i = n; i > 0; i--) {

            switch (e) {
                case ODD -> {
                    if (i % 2 != 0) {
                        sum += i;
                    }
                    break;
                }
                //если чётное
                case EVEN -> {
                    if (i % 2 == 0) {
                        sum += i;
                    }
                }
            }


        }
        return sum;
    }

    /**
     * Вывести на экран все кубы чисел от А до В
     */
    public static void printCubes(int a, int b) {
        for (int i = a; i <= b; i++)
            System.out.println(i * i * i);

    }

    public static long fact(long n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;

    }



}
