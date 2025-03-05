package OOP;

//Класс "Студент"
//Создайте класс Student с полями name, age, grade. Напишите метод для вывода информации о студенте.

public class Student {
    public Student(){}
    public Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    private String name;
    private int age;
    private double grade;

    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public void setGrade(double grade){this.grade = grade;}

    public double getGrade() {return grade;}
    public String getName() {return name;}
    public int getAge() {return age;}

    public void StudentInfo(){
        System.out.println("Name: " + name + "\nAge: "+age+"\nGrade: "+grade);
    }
}
