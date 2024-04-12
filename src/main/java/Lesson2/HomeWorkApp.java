package Lesson2;

public class HomeWorkApp {

    public static void main(String[] args) {
        System.out.println(Summ(6, 4));
        PlusMinusM(0);
        System.out.println(PlusMinusBoo(-1));
        printStringN("Егор Петух, повторю", 4);
        System.out.println(LeapYear(1300));
    }

    public static boolean Summ(int a, int b) {
        return ((a + b > 10 && (a + b) <= 20));


    }

    public static void PlusMinusM(int n) {
        if (n < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    public static boolean PlusMinusBoo(int n) {
        return (n < 0);
    }

    public static void printStringN(String string, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(string);
        }
    }

    public static boolean LeapYear(int a) {
        return (((a % 4 == 0) && !(a % 100 == 0)) || ((a % 400 == 0)));


    }

}







