package oop;

public class StudentDemp {
    public static void main(String[] args) {
        Student person = new Student();
        person.setFullName("Вова Вова Вовочка");
        person.setAge(56);
        person.setAspirant(false);

        System.out.println("Имя студента " + person.getFullName());
        System.out.println("Возраст студента" + person.getAge());
        System.out.println("Аспирант ли студент или нет" + person.isAspirant());
    }
}
