package Lesson2;

public class Methods {
    /**
     * [modifier] [type возвращаемого значения] [name] (arguments);
     * сейчас используем static для всех методов
     */

    public static void main(String[] args) {
        System.out.println(summ(1,3));
        System.out.println(summ(1,4));
        System.out.println(mult(2,4));
        printStringTwice("ЕГОР");

        System.out.println(summ());
        System.out.println(summ10(25));
        print("My int",1);
        print (2,"My string2");


    }

    /**
     * по умолчанию всегда 0
     * @return
     */
    public static int summ(){
        return summ(0,0);
    }

    /**
     * всегда суммирует с 10
     * @return
     */
    public static int summ10 (int a){
        return summ(10,a);

    }


    public static int summ(int a, int b){
        return a + b;
    }

    public static int mult(int a, int b){
        return a*b;

    }
    public static void  print(String s, int a){
        System.out.println(s+a);
    }
    public static void  print(int a, String s){
        System.out.println(s+a);
    }

    public static void printStringTwice(String string){
        System.out.println(string);
        System.out.println(string);
    }

}
