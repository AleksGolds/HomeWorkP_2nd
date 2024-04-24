package src.main.java.Lesson_5;

public class MyApp {
   /* static void testCats() {
        Cat cat = new Cat();

        Cat cat2 = new Cat("Борис", "Энергичный", 5);

        System.out.println(" Имя кота " + cat2.getName() + ", Цвет " + cat2.getColor() + ", Возраст " + cat2.getAge());

        Cat cat3;
        cat3 = cat2;
        if (cat2.equals(cat3)) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }
        cat3.setName("Мурзик"); //Изменения сделанные в cat2 будут сделаны и в cat3 и наоборот!!!
        System.out.println(cat2);


        System.out.println("-------");
        System.out.println(cat);

    }*/


    public static void main(String[] args) {
        //testCats();
//        User user = new User(1, "Vasya", "Dvornik",33);
//
//        System.out.println(user.isOlderThan18());
//
//        System.out.println(UserUtil.isUserOlderThan18(user));
//
//        Vahkter vakhter = new Vahkter("Kolyan");
//        vakhter.checkUsers(new User[]{user});

        //Покорми кота
        Cat cat = new Cat();
        cat.setAppetite(30);
        Plate plate = new Plate(150);

        plate.setFoodCount(plate.getFoodCount() - cat.getAppetite());

        cat.info();
        plate.info();

        cat.eatFood(plate);

        cat.info();
        plate.info();





/*
        User user = new User(1, "Vasya","Dvornik",33);
        user.info();
        user.changePosition("Starshiy Dvornik");
        user.info();

        User users[] = new User[10]; */

    }

}

/* modifier (public,private,protected) class ClassName {
    modifier type name field_name; поле 1
    modifier type name field_name;
    modifier type name field_name;
    ...
    modifier type name field_name; поле n
}

//
 */
