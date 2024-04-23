package src.main.java.Lesson_6;

public class Dog extends Animal{

    private String breed;

    public Dog(String name, String breet) {
        super(name);
        this.breed = breet;
    }

    public String getBreet() {
        return breed;
    }

    public void setBreet(String breet) {
        this.breed = breet;
    }
    public void playWhithBall(){
        System.out.println("I'll bring it back!");
    }
}
