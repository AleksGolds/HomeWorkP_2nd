package src.main.java.HWLesson7;

public class MyAppJS {

    public static void main(String[] args) {

       Cat[] cats = new Cat[9];
       cats[0] = new Cat("Barsik",30,false);
       cats[1] = new Cat("Mursik",30,false);
       cats[2] = new Cat("Jusik",30,false);
       cats[3] = new Cat("Tori",100,false);
       cats[4] = new Cat("Barsik",30,false);
       cats[5] = new Cat("Barsik",30,false);
       cats[6] = new Cat("Barsik",30,false);
       cats[7] = new Cat("Barsik",30,false);
       cats[8] = new Cat("EndedBUR",30,false);

       Plate plate = new Plate(200);

        System.out.println("\n ДО КОРМЁЖКИ\n");

        for (Cat cat : cats) {

            cat.info();
            plate.info();
        }


        System.out.println("\n ПОСЛЕ КОРМЁЖКИ\n");

        for (Cat cat : cats) {
            cat.catEatFood(plate);
            cat.info();
            plate.info();
        }







    }

}
