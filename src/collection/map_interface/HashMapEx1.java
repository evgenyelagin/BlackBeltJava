package collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap();
        map1.put(1000, "Zaur Tregulov");
        map1.put(3568, "Ivan Ivanov");
        map1.put(6578, "Mariya Sidorova");
        map1.put(15879, "Nikolay Petrov");
        // если ключ уникальный, то можно добавить неуникальное значение.
        map1.put(58393, "Nikolay Petrov");
        // если ключ не уникальный, то ключ остается, а значение перезаписывается вместо Заура будет Жан Клод
        map1.put(1000, "Jan Klod");
        // добавление элемента с ключом НАЛЛ
        map1.put(null, "Kris Cyborg");
        // добавление элемента со значение НАЛЛ
        map1.put(1239, null);
        // если ключ не уникальный, то с методом putIfAbsent элемент НЕ добавляется в коллекцию.
        map1.putIfAbsent(58393, "Nikolay Petrov");
        // пробуем метод get - вывод значения по KEY ключу - если такого нет - НАЛЛ
        System.out.println(map1.get(1000));
        // удаление элемента по ключу - Ivana Ivanova больше нет :)
        map1.remove(3568);
        System.out.println(map1);
        // метод containsValue возвращает ТРУ - если коллекция содержит значение, которые ищем.
        System.out.println(map1.containsValue("Jan Klod"));
        // метод containsKey возвращает ТРУ - если коллеция содержит ключи, которые ищем.
        System.out.println(map1.containsKey(6578));
        // keySet - возращает множество ключей - выводит только ключи, без значений
        System.out.println(map1.keySet());
        // values - возвращает множество значений
        System.out.println(map1.values());
        // ключи и значения могут быть разных типов в HashMap
        Map<String, Integer> map2 = new HashMap<>();
        Map<Double, String> map3 = new HashMap<>();
        Map<String, String> map4 = new HashMap<>();
        map4.put("Vasya", "Krasavchik");
    }
}
