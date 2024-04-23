package src.main.java.Lesson_6;

public class Cat extends Animal {
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void voice() {
        System.out.println("Кот квакает");
    }

    public void voice(String mood){
        System.out.println("meow with mood " + mood);

    }



}
