package collection.set_interface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);
        // treeSet.add(null); null добавить нельзя
        // вывод в отсортированном виде по возрастанию [1, 2, 5, 8, 10]
        System.out.println(treeSet);
    }
}
