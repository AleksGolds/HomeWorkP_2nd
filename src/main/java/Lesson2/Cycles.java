package Lesson2;

public class Cycles {
    /**
     * for (инициализация; условие; итерация)
     * @param args
     */
    public static void main(String[] args) {
        twoCycles(4,3);

    }
    private static void printLine(String str, int n) {
        for(int i = n; i>0; i--) {
            System.out.println(str + i);
        }
    }
    private static void cyclesTwice(){
        for(int i = 0, j=10; i<10 && j>0; i++, j--){
            System.out.println("i = "+i + " j = "+j);
        }
    }

    private static void cycleWhithBreak(int n){
        for(int i=0; i<n; i++){
            if (i>4) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("end cycle");
    }

    private static void infiniteCycle(){
        for(;;){

        }
    }
    private static void forEach(){
        String [] array = {"s1","s2","s3"};
        for (String s : array) {
            System.out.println(s);
        }
    }
    public static void twoCycles(int m, int n){
        for (int i = 0; i<n; i++){
            for (int j=0; j<m; j++) {
                if (i>=2){
                    break;
                }
                System.out.println("(" + i +" " + j + ") ");
            }
        }
    }
}
