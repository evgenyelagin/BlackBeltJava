package collection;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(19);
        arrayList.add(150);
        // сначала надо отсортировать коллекцию, иначе будет выдавать некорректный результат
        Collections.sort(arrayList);
        int index1 = Collections.binarySearch(arrayList, 0); /* коллекция.метод бинари сёрч(вставляем свою
        коллекцию arrayList и элемент, который надо найти */
        System.out.println(index1); // вывод в консоль ПОЗИЦИИ - по сути индексе, где находится int 12.
        // если на консоль выводится ОТРИЦАТЕЛЬНЫЙ результат, значит значение не найдено.
    }
}
