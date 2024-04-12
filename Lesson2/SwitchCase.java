package Lesson2;

public class SwitchCase {

    public static void main(String[] args) {
        int a = 3;
        doSwitchEnum(MyEnum.NEW);

    }
    public static void  doSwitchWithIf(int a){
        if (a==1) {
            System.out.println("1");
        }
        else if(a==2){
            System.out.println("2");
        }
        else if(a==3){
            System.out.println("3");
        }
        else {
            System.out.println("Not 123");
        }
    }
    public static void doSwitch(int a){
        switch (a){
            case 1: {
                System.out.println("1");
                break;
            }
            case 2: {
                System.out.println("2");
                break;
            }
            case 3: {
                System.out.println("3");
                break;
            }
            default: {
                System.out.println("Not 123");
                break;
            }
        }
    }
    public static void doSwitchEnum(MyEnum e){
        switch (e){
            case NEW: {
                System.out.println("he is young");
                break;
            }
            case OLD:{
                System.out.println("he's too old");
                break;
            }
        }
    }
}
