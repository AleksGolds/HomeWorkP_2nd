package src.main.java.HWLesson7;

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

    public void info() {
        System.out.println(toString());
    }

    public void checkCount(int appetite) {
        foodCount -= appetite;
    }

    public void plusFoodCount(int appetite) {
        if (foodCount < 0 || foodCount < appetite) {
            System.out.println("\nЕда кончилась, но у нас автоматическая подача еды, возрадуйся, пушистый мешок!\n");
            foodCount += 200;
        }
    }
}
