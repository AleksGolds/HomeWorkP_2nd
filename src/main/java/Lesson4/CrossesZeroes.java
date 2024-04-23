package src.main.java.Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CrossesZeroes {
    /** Вводим поле игры
     * если final - это значение не будет больше меняться;
     * константы именуются большими буквами.
     */
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    //Вводим константы-символы:
    public static final char DOT_EMPY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();


    /**
     * создать игровое поле и заполнить его пустыми точками.
     */
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                Arrays.fill(map[i], DOT_EMPY);
            }

        }

    }

    public static void printMap() {
        // нумерация столбцов
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            //вывод номера строки
            System.out.print((i + 1) + "  ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print((map[i][j]) + "  ");
            }
            System.out.println();
        }
    }

    /**
     * Считавть 2 числа и установить значение Х.
     */
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты хода в формате Х,Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

        }
        while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    private void validateAge(int age){
        if (!scanner.hasNextInt()) {
            throw new IllegalArgumentException("Кожаный мешок, я же сказал ввести цифры, а не буквы, ебло");
        }

    }


    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
            /*Math.random()* также можно применить */
        }
        while (!isCellValid(x, y));
        System.out.printf("Искусственный интеллект ходит: %d %d", x + 1, y + 1);
        System.out.println();
        map[x][y] = DOT_O;

    }

    public static void aiTurnClever() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
            /*Math.random()* также можно применить */
        }
        while (!isCellValid(x, y));
        System.out.printf("Искусственный интеллект ходит: %d %d", x + 1, y + 1);
        System.out.println();
        map[x][y] = DOT_O;

    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= map.length || y < 0 || y >= map.length) {
            return false;
        }
        // 1 вариант
        if (map[x][y] == DOT_EMPY) {
            return true;
        }
        /*2 вариант
        if (map[x][y]==DOT_X){
            return true;
        }*/
        return false;
    }


    public static boolean checkWinCycle(char dot) {
        // условия победы строк


        for (int i = 0; i < map.length; i++) {
            int dotsSumString = 0; // должно равняться DotsToWin
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == dot) {
                    dotsSumString += 1;
                }
                if (dotsSumString == DOTS_TO_WIN) {
                    return true;
                }
            }
        }

        // условия победы столбцов

        for (int i = 0; i < map.length; i++) {
            int dotsSumColumn = 0; // должно равняться DotsToWin
            for (int j = 0; j < map.length; j++) {
                if (map[j][i] == dot) {
                    dotsSumColumn += 1;
                }
                if (dotsSumColumn == DOTS_TO_WIN) {
                    return true;
                }
            }
        }


        // условия победы диагоналей
        ; // должно равняться DotsToWin
        int dotsSumDiagonl1 = 0;
        int dotsSumDiagonl2 = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if ((i == j) && (map[i][j] == dot)) {
                    dotsSumDiagonl1 += 1;
                }
                if ((i == map.length - j - 1) && (map[j][i] == dot)) {
                    dotsSumDiagonl2 += 1;
                }

                if ((dotsSumDiagonl1 == DOTS_TO_WIN) || (dotsSumDiagonl2 == DOTS_TO_WIN)) {
                    return true;
                }
            }
        }


        return false;
    }


    /**
     * Проверяет, что поле заполнено (ничья)
     * @return
     */
    public static boolean isFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void play() {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWinCycle(DOT_X)) {
                System.out.println("Выйграл человек");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWinCycle(DOT_O)) {
                System.out.println("Кожаный мешок, я победил, АХАХАХАХАХА!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }

        }
    }


    public static void main(String[] args) {
        System.out.println("Я хочу сыграть с тобой в игру, кожаный мешок");
        play();

    }


}
