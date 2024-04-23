package src.main.java.Lesson_6;

public class SiamCat extends Cat {
    private int shadeOfGrey;

    public SiamCat(String name, String color, int shadeOfGrey) {
        super(name, color);
        this.shadeOfGrey = shadeOfGrey;
    }

    public int getShadeOfGrey() {
        return shadeOfGrey;
    }

    public void setShadeOfGrey(int shadeOfGrey) {
        this.shadeOfGrey = shadeOfGrey;
    }

    @Override
    public void voice() {
        System.out.println("very loud voice");
    }

    @Override
    public void voice(String mood) {
        System.out.println("Always sad");
    }
}
