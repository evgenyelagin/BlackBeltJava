package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchObjectEmployee {
    public static void main(String[] args) {
        // создаем обекты Работник с параметрами из конструктора
        Employee emp1 = new Employee(100, "Zaur", 12345);
        Employee emp2 = new Employee(15, "Ivan", 6542);
        Employee emp3 = new Employee(123, "Petr", 8542);
        Employee emp4 = new Employee(15, "Mariya", 5678);
        Employee emp5 = new Employee(182, "Kolya", 125);
        Employee emp6 = new Employee(15, "Sasha", 9874);
        Employee emp7 = new Employee(250, "Elena", 1579);
        List<Employee> employeeList = new ArrayList<>(); // создаем коллекцию employeeList c объектами Работники
        employeeList.add(emp1); // Добавление первого работника
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        System.out.println(employeeList);
        // сортируем коллекцию работников по id, если id одинаковые, то по name.
        Collections.sort(employeeList);
        System.out.println(employeeList);
        // метод revers -сортирует в обратном порядке - просто как пример метода
        //Collections.reverse(employeeList);
        //System.out.println(employeeList);
        // поиск работника Коля, сэлари не важно, так как идет поиск по id и name.
        int index2 = Collections.binarySearch(employeeList, new Employee(182, "Kolya", 125));
        System.out.println(index2);

    }
}

    class Employee implements Comparable<Employee> { /* чтобы работала сортировка имплементируем Компарэйбл и
        указываем, что работать будем с Employee */
        // поля
        int id;
        String name;
        int salary;

        // генерация конструктора
        public Employee(int id, String name, int salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

// переопределение toString
        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        @Override
        public int compareTo(Employee anotherEmp) {
            int result = this.id - anotherEmp.id; // переписываем result - чтобы сортировка шла по id
            if (result == 0) { // если id одинаковые, то сравниваем имена в лексиграфическом плане
                result = this.name.compareTo(anotherEmp.name);
            }
            return result;
        }
    }




