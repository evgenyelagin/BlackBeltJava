package collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Marina");
        set.add("Oleg");
        set.add("Igor");
        set.add("Igor"); // дубликат не добавится в коллекцию - только уникальные элементы
        set.add(null); // null можно добавлять
        System.out.println(set);
        System.out.println(set.size()); // возвращает сколько элементов в коллекции
        System.out.println(set.contains("Oleg")); // содержит ли коллекция элемент, если да - тру.

        for (String s : set) {
            System.out.println(s);
        }
    }
}
