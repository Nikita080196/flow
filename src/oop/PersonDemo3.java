package oop;

public class PersonDemo3 {
    public static void main(String[] args) {
        Student person1 = new Student("Петров Иван Иванович", 56, false);
        Student person2 = new Student("Петров Иван Иванович", 56, false);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person1.hashCode() == person2.hashCode());
    }
}
