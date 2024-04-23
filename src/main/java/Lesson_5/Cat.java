package src.main.java.Lesson_5;

public class Cat {
    private String name;
    private String color;
    int age;

    public Cat(String name, String color, int age) {
        super();
        validateAge(age);
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat(String name, int age) {
        this(name, "Бандитский", age);
    }

    public Cat() {
        this("Степан", "Бандитский",5 );
        System.out.println("Создаём кота, которого видим впервые");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
    public String getName(){
        return this.name;
    }
    public String getColor(){
        return this.color;
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    private void validateAge(int age){
        if (age<0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        if (age>25) {
            throw new IllegalArgumentException("Коты столько не живут");
        }
    }


}

