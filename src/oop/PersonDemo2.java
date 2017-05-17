package oop;

public class PersonDemo2 {
    public static void main(String[] args) {
        Student person1 = new Student("Петров Иван Иванович", 56, false);
        Student person2 = new Student("Петров Иван Иванович", 56, false);
        Student person3 = person1;

        System.out.println(person1 == person2);
        System.out.println(person1 == person3);

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
    }
}
