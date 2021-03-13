package collection.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        // создаем хэшмэп
        Map<Student, Double> map = new HashMap<>();
        // создаем объекты - студентов - см. класс Студент
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Dolf", "Lungren", 5);
        Student st3 = new Student("Jess", "Alba", 2);
        // добавляем в хэшмэп студентов + тк в мэпе <Student i Double> - после объекта доб. значение double
        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);
        System.out.println(map);

        Student st4 = new Student("Zaur", "Tregulov", 3);
        Student st5 = new Student("Igor", "Sidorov", 4);

        boolean result = map.containsKey(st4);
        // выдает фолс, так как не переопределен (закомментирован для теста) hashcode
        System.out.println("result = " + result);
        // но если сравнивать equals, то для него они одинаковые - тру.
        System.out.println(st1.equals(st4));
        // снял коментирование с хэшкода и результат тру - т.к. теперь хэшкод переопределен
        boolean result1 = map.containsKey(st4);
        System.out.println("проверяем = " + result1);
        // смотрим хэшкод студентов
        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());
        System.out.println(st5.hashCode());
    }
}
class Student{
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}
