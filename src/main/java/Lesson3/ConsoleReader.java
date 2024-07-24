package Lesson3;

import javax.security.auth.login.LoginContext;
import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ConsoleReader {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        System.out.println("Введите размер массива");
        int size = readUntil();
        int array[] = new int[size];
        for (int i=0;  i< array.length; i++){
            System.out.printf("Введи чему равен %d элемент",(i+1));
            array[i] = scanner.nextInt();
        }
        int index = random.nextInt(array.length);
        System.out.println(array[index]);

        System.out.printf("\nВаш Массив %s", Arrays.toString(array));
        System.out.printf("\nМинимум вашего массива %d", ArrayTasks.findMin(array));
        System.out.printf("\nТут мы выведем строку: %s, а тут выведем число %d","string",10);
    }


        public static int readUntil(){
        int n = 0;
        do {

            System.out.println("Ввели число от 0 до 10");
            n = scanner.nextInt();
    } while (!(n>0 && n<10));
        return n;

}

}




