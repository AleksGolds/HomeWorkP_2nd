package src.main.java.HomeWorkLesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkAnalysis {

    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                Arrays.fill(map[i], DOT_EMPTY);
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

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= map.length || y < 0 || y >= map.length) {
            return false;
        }
        if (map[x][y] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static void humanTurn() {
        int x,y;
        do {
            System.out.println("Введите координаты точки формата X,Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }
        while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    public static void aiTurn() {
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        }
        while (!isCellValid(x, y));
        System.out.printf("Компьютер ходит: %d,%d", x + 1, y + 1);
        System.out.println();
        map[x][y] = DOT_O;
    }

    public static boolean isFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWinCycles(char dot) {
        // условия победы строк
        for (int i = 0; i < map.length; i++) {
            int dotsToWinString = 0;
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == dot) {
                    dotsToWinString += 1;
                }
                if (dotsToWinString == DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        // условия победы столбцов
        for (int i = 0; i < map.length; i++) {
            int dotsToWinColumn = 0;
            for (int j = 0; j < map[i].length; j++) {
                if (map[j][i] == dot) {
                    dotsToWinColumn += 1;
                }
                if (dotsToWinColumn == DOTS_TO_WIN) {
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

    public static void play() {
        initMap();
        printMap();
        while (true){
            humanTurn();
            printMap();
            if (checkWinCycles(DOT_X)){
                System.out.println("Выйграл человек");
                break;
            }
            if (isFull()){
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWinCycles(DOT_O)){
                System.out.println("Кожаный мешок, я выйграл");
                break;
            }

            if (isFull()){
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
