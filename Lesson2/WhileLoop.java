package Lesson2;

public class WhileLoop {

    public static void main(String[] args) {
        doWhile(10);
    }
    public static void simpleWhile(){
        int i = 10;
        while(i>0){
            System.out.println(i);
            i--;
        }
    }
    public static void doWhile(int i){
        do {
            System.out.println(i);
            i--;
        }
        while (i>0);
    }
}
