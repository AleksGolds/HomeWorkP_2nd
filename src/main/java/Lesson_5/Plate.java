package src.main.java.Lesson_5;

public class Plate {

   private int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "foodCount=" + foodCount +
                '}';
    }

    public void info(){
        System.out.println(toString());
    }

    public void decreaseCount (int appetite){
        foodCount -= appetite;
    }
}
