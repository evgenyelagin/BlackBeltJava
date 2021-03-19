package collection.set_interface;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(5);
        hashSet1.add(8);
        System.out.println(hashSet1);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(7);
        hashSet2.add(8);

        // union принял в параметры hashSet1, поэтому такой же как HshSet1
        HashSet<Integer> union = new HashSet<>(hashSet1);
        System.out.println(union);
        // добавить всех и в параметры  вставляем hashSet2
        union.addAll(hashSet2);
        // результат - [1, 2, 3, 4, 5, 7, 8]
        System.out.println(union);

        HashSet<Integer> intersect = new HashSet<>(hashSet1);
        // оставляет только общие элементы двух коллекций
        intersect.retainAll(hashSet2);
        // результат - [3, 5, 8]
        System.out.println(intersect);

        HashSet<Integer> subtract = new HashSet<>(hashSet1);
        // от 1-го множества отнимаем 2-е множество
        subtract.removeAll(hashSet2);
        // результат - [1, 2]
        System.out.println(subtract);
    }
}
