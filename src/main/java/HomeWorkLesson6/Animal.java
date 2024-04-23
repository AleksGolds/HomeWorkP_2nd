package src.main.java.HomeWorkLesson6;

public class Animal {

    protected String name;
    protected static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
        System.out.printf("Животное № " + animalCount);
    }


    public void run(int length) {
        System.out.println(this.name + " пробежал " + length + " метров");

    }

    public void swim(int length) {
        System.out.println(this.name + " проплыл " + length + " метров");
    }

    public static void animalCount(Animal[] animalsArray) {
        int animalsSum = 0;
        for (Animal animal : animalsArray) animalsSum++;
        System.out.println("Всего было рождено " + animalsSum + " животных");
    }
}
