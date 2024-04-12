package src.main.java.Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReadString {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите строку и мы посчитаем сколько в ней слов больше 5 букв");
        String line = scanner.nextLine();
        System.out.printf("В вашей строке %d слов", countWords(line.split(" ")));


    }


   public static int countWords (String[] arr){
        int count = 0;
        for (int i= 0; i < arr.length; i++){
            if (arr[i].length() >=5){
                count++;
            }

       }
        return count;
    }
}
