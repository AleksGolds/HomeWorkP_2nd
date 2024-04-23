package src.main.java.HomeWorkLesson6;

import src.main.java.HomeWorkLessons5.Employee;

public class Cat extends Animal {
    protected static int catsCount = 0;

    public Cat(String name) {
        super(name);
        catsCount++;
        System.out.println(" Кот № " + catsCount);
    }

    @Override
    public void run(int length) {
        if ( length<0) {
            System.out.println("Длина не может быть отрицательной");
        } else if (length<=200){
            System.out.println(this.name + " пробежал " + length + " метров");
        }
        else {
            System.out.println("Кот не может пробежать более 200 метров");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Коты боятся воды и не умеют плавать");
    }


    public static void catCount(Cat[] catsArray) {
        int catsSum = 0;
        for (Cat cat : catsArray) catsSum++;
        System.out.println("Всего было рождено " + catsSum + " котов");
    }


}
