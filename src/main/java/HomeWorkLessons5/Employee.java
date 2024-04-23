package src.main.java.HomeWorkLessons5;

public class Employee {

    public static String className = "Employee ";
    private String fullName;
    private String jobTitle;
    private String email;
    private String number;
    private int salary;
    private int age;

    public Employee(String fullName, String jobTitle, String email, String number, int salary, int age) {
        super();
        validateAge(age);
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNumber() {
        return this.number;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getAge() {
        return this.age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    private void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }

    }
    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", email='" + email + '\'' +
                ", number=" + number +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
    public static void checkArrAge(Employee[] emp) {
        System.out.println("Выведем сотрудников старше 40 лет");
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].age > 40) {
                System.out.println(emp[i]);
            }
        }
    }





}
