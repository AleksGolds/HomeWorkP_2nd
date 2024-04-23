package src.main.java.HomeWorkLessons5;

public class MyHomeworkApp {

    static void testEmployee() {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Голубев А.А.", "ГлавБух", "AleksGolds7@yandex.ru", "9601788799", 120000, 27);
        empArray[1] = new Employee("Голубев А.В.", "Дежурный", "AleksGolds7@yandex.ru", "9601788798", 120000, 45);
        empArray[2] = new Employee("Голубев А.Г.", "Оперуполномоченный", "AleksGolds7@yandex.ru", "9601788797", 120000, 41);
        empArray[3] = new Employee("Голубев А.Н.", "Участковый", "AleksGolds7@yandex.ru", "9601788796", 120000, 50);
        empArray[4] = new Employee("Голубев А.Ю.", "Следователь", "AleksGolds7@yandex.ru", "9601788795", 120000, 25);

        for (int i = 0; i < empArray.length; i++) {
            System.out.println(empArray[i].toString());
        }
        System.out.println("* * * * * * * * * *");
        Employee.checkArrAge(empArray);
    }

    public static void main(String[] args) {
        testEmployee();
    }
}
