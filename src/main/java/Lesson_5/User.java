package src.main.java.Lesson_5;

public class User {
    public static String className = "User";
    int id;
    String name;
    String position;
    int age;

    public User(int id, String name, String position, int age) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public void info() {
        System.out.printf(className + "ID:%d\n name:%s\n position:%s\n age:%d\n", id, name, position, age);

    }
    public static void printClassName(){
        System.out.println(className);
    }

    public void changePosition(String newPosition) {
        position = newPosition;
        System.out.println("Новая должность " + newPosition);

    }
    public boolean isOlderThan18(){
        return age>=18;
    }

}
