package src.main.java.HWLesson7;

public class Cat {

    private String name;
    private int appetite;
    private boolean bellyful;

    public Cat(String name, int appetite, boolean bellyful) {
        this.name = name;
        this.appetite = appetite;
        this.bellyful = bellyful;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean getBellyful() {
        return bellyful;
    }

    public void setBellyful(boolean bellyful) {
        this.bellyful = bellyful;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", bellyful=" + bellyful +
                '}';
    }

    public void info(){
        System.out.println(toString());
    }

    public void catEatFood(Plate plate){
        if (plate.getFoodCount()>appetite){
            plate.checkCount(this.appetite);
                this.appetite = 0;
                this.bellyful = true;

        }
        else {
            plate.plusFoodCount(this.appetite);
            plate.checkCount(this.appetite);
            this.appetite = 0;
            this.bellyful = true;
        }

    }

}
