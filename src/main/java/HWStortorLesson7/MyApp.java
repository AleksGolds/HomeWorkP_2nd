package src.main.java.HWStortorLesson7;

public class MyApp {

    public static void main(String[] args) {

//        /**
//         * №1 Расширить задачу про котов и тарелки с едой.
//         */
//        Cat cat1 = new Cat("First", 30,true);
//        Cat cat2 = new Cat("Second",20);
//        Plate firstsPlate = new Plate(100);
//        Plate secondsPlate = new Plate(10);
//
//        cat1.info();
//        cat1.eat(firstsPlate);
//        cat1.info();
//        firstsPlate.info();
//
//        cat2.info();
//        cat2.eat(secondsPlate);
//        secondsPlate.info();
//        cat2.info();
//        cat2.info();
//
//        firstsPlate.info();
//        firstsPlate.addFood(50);
//        firstsPlate.info();
//        firstsPlate.addFood(30);
//        firstsPlate.info();


        /**
         * №5 Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
         */
        Plate plateForAll = new Plate(250);
        Cat[] cats = new Cat[5];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("ArrayCat",60);
            cats[i].eat(plateForAll);
            cats[i].info();
            plateForAll.info();
        }



    }

}
