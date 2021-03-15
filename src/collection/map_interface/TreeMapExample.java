package collection.map_interface;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Dolf", "Lungren", 5);
        Student st3 = new Student("Jess", "Alba", 2);
        Student st4 = new Student("Rick", "Rufus", 1);
        Student st5 = new Student("Sho", "Kosugi", 2);
        Student st6 = new Student("John", "Johnson", 5);
        Student st7 = new Student("Hugo", "Grant", 4);
        Student st8 = new Student("Petr", "Sidorov", 4);

        treeMap.put(5.8, st1);
        treeMap.put(9.1, st7);
        treeMap.put(6.4, st2);
        treeMap.put(7.2, st3);
        treeMap.put(7.5, st4);
        treeMap.put(8.2, st6);
        treeMap.put(7.9, st5);
        treeMap.put(9.2, st8);
        System.out.println(treeMap);
        System.out.println(treeMap.get(5.8));
        treeMap.remove(5.8);
        System.out.println(treeMap);
        // метод descendingMap - развернуть treeMap в обратную сторону
        System.out.println(treeMap.descendingMap());
        // метод tailMap - выведи мне ключи от 7.3 и выше
        System.out.println(treeMap.tailMap(7.3));
        // метод headMap - выведи мне ключи меньше 7.5
        System.out.println(treeMap.headMap(7.5));
        // lastEntry - показывает последнее значеник Мар
        System.out.println(treeMap.lastEntry());
        // firstEntry
        System.out.println(treeMap.firstEntry());
    }

}
