package collection.set_interface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Zaur", 3);
        Student st2 = new Student("Dolf", 5);
        Student st3 = new Student("Jess", 2);
        Student st4 = new Student("Rick", 1);
        Student st5 = new Student("Sho", 4);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        Student st6 = new Student("Oleg", 3);
        Student st7 = new Student("Ivan", 4);
        // показывает элементы ниже st6
        System.out.println(treeSet.headSet(st6));
        // показывает элементы выше или равные st6
        System.out.println(treeSet.tailSet(st6));
        // показывает элементы в промежутке между - по course сравнение
        System.out.println(treeSet.subSet(st3, st6));
        // сравенение курсов
        System.out.println(st6.equals(st1));
        System.out.println(st6.compareTo(st1));
        System.out.println(st6.hashCode() == st1.hashCode());

    }
}

class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public int compareTo(Student other) {
        return this.course - other.course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}