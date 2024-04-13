package src.main.java.Lesson3;

public class HomeWork_Lesson_3rd {
    public static void main(String[] args) {
        /*changePlace(new int[]{1, 0, 0, 0, 0, 1});

        newToMass(new int[100]);*/
        MelSixMultTwice(new int[]{1,2,3,4,5,6,7,8,9,100});


    }

    public static void changePlace(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {

                arr[i] = 1;
                System.out.println("arr[" + i + "] = " + arr[i]);
            } else {
                arr[i] = 0;
                System.out.println("arr[" + i + "] = " + arr[i]);
            }

        }
    }

    public static void newToMass(int[] arr){
        for (int i = 0; i<arr.length;i++){
            arr[i]= i+1;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

    }
    public static void MelSixMultTwice(int [] arr){
        for (int i = 0; i< arr.length;i++){
            if (arr[i]<6){
                arr[i] = arr[i]*2;
            }
            System.out.println("arr[" + i + "] = " + arr[i]);

        }
    }
    public static void diagonalCheck(int [][] arr) {

    }



}
