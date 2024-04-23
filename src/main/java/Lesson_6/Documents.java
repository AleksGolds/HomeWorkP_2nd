package src.main.java.Lesson_6;

public abstract class Documents {
    protected String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    abstract String getType();

    public String getName(){
        return "DefaultName";
    }
}
