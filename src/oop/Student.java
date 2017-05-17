package oop;

public class Student {
    private String fullName;
    private int age;
    private boolean aspirant;

    public Student() {
    }

    public Student(String fullName, int age, boolean retired) {
        this.fullName = fullName;
        this.age = age;
        this.aspirant = retired;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAspirant() {
        return aspirant;
    }

    public void setAspirant(boolean aspirant) {
        this.aspirant = aspirant;
    }

    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", aspirant=" + aspirant +
                '}';
    }

    @Override
    public int hashCode() {
        int result = fullName.hashCode();
        result = 31 * result + age;
        result = 31 * result + (aspirant ? 1 : 0);
        return result;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student person = (Student) o;

        if (getAge() != person.getAge()) return false;
        if (isAspirant() != person.isAspirant()) return false;
        return getFullName() != null ? getFullName().equals(person.getFullName()) : person.getFullName() == null;

    }
}
