package src.main.java.Lesson_6;

public class AnimalApp {

    public static void main(String[] args) {
        Animal animal = new Animal("Кто-то");
        Cat cat = new Cat("Vaska", "Brown");
        Dog dog = new Dog("Mukhtar", "Simple dog");

//        System.out.println("Animal name = " + animal.name);
//        System.out.println("Cat name = " + cat.getName());
//        System.out.println("Dog name = " + dog.getName());

//        animal.voice();
//        cat.voice();
//        dog.voice();

//        SiamCat siamCat = new SiamCat("Sc","Grey",50);
//
//        cat.voice("happy");
//        siamCat.voice("sad");

        Animal someAnimal = new Cat("Boris", "Bandits");
        Animal someAnimal2 = new SiamCat("Boris", "Bandits", 42);
        Animal someAnimal3 = new Dog("Bobik", "usual");

        Animal[] animals = new Animal[]{someAnimal, someAnimal2, someAnimal3};
        /**
         * объекты собак и кошек не теряют своих свойств, но, чтобы вызывать массив животных с кошками и собаками,
         * кошек и собак нужно создать через Animal кошек и собак
         */
        for (Animal a : animals) {
            if (a instanceof Dog){
                System.out.println("Это собака породы" + ((Dog) a).getBreet());
            }
            System.out.println(a.getName());
            a.voice();

        }
        SiamCat cat1 = new SiamCat("Siam","Brown",44);
        Cat cat2 = new SiamCat("Siam","Brown",44);
        Animal cat3 = new SiamCat("Siam","Brown",44);
        Object cat4 = new SiamCat("Siam","Brown",44);

        ((Animal)cat4).voice();

//        ExpressOrder extends Order{
//
//        }
//
//        //a-la prod
//        processOrders(Order[] orders){
//            ...
//        }


    }

}
