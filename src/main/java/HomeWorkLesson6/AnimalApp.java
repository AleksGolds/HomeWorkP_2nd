package src.main.java.HomeWorkLesson6;

import com.sun.source.tree.ConstantCaseLabelTree;

public class AnimalApp {

    public static void main(String[] args) {



        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik");
        cats[1] = new Cat("Mursik");
        cats[2] = new Cat("Versik");

        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Biba");
        dogs[1] = new Dog("Boba");
        dogs[2] = new Dog("Xoba");

        System.out.println("\nВ соревновании участвует " + Animal.animalCount + " животных\n");
        System.out.println("Из них " + Cat.catsCount + " котов и " + Dog.dogsCount + " собак\n");











        System.out.println("Забег кошечек\n");

        cats[0].run(-1);
        cats[1].run(0);
        cats[2].run(202);

        System.out.println("\nЗабег собачек\n");

        dogs[0].run(-1);
        dogs[1].run(0);
        dogs[2].run(502);

        System.out.println("\nЗаплыв кошечек\n");

        cats[0].swim(-1);
        cats[1].swim(0);
        cats[2].swim(12);

        System.out.println("\nЗаплыв собачек\n");

        dogs[0].swim(-1);
        dogs[1].swim(0);
        dogs[2].swim(12);


    }

}
