package src.main.java.HomeWorkLesson6;

public class Dog extends Animal {
    protected static int dogsCount = 0;

    public Dog(String name) {
        super(name);
        dogsCount++;
        System.out.println(" Собака № " + dogsCount);
    }

    @Override
    public void run(int length) {
        if (length < 0) {
            System.out.println("Длина не может быть отрицательной");
        } else if (length <= 500) {
            System.out.println(this.name + " пробежал " + length + " метров");
        } else {
            System.out.println("Cобака не может пробежать более 500 метров");
        }
    }

    @Override
    public void swim(int length) {
        if (length < 0) {
            System.out.println("Длина не может быть отрицательной");
        } else if (length <= 10) {
            System.out.println(this.name + " пробежал " + length + " метров");
        } else {
            System.out.println("Cобака не может проплыть более 10 метров");
        }
    }


    public static void dogCount(Dog[] dogsArray) {
        int dogsSum = 0;
        for (Dog dog : dogsArray) dogsSum++;
        System.out.println("Всего было рождено " + dogsSum + " собак");
    }
}
