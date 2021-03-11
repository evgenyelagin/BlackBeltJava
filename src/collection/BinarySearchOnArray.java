package collection;

import java.util.Arrays;

public class BinarySearchOnArray {
    public static void main(String[] args) {
        // пример на массиве интов
        int[] arrayInt = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
        System.out.println(Arrays.toString(arrayInt));
        Arrays.sort(arrayInt); // обязательно отсортировать массив
        // если не использовать toString, то получим ссылку на память, а не красивые значения
        System.out.println(Arrays.toString(arrayInt));
        // бинарный поиск в массиве элемента 150
        int index1 = Arrays.binarySearch(arrayInt, -3);
        System.out.println(index1);
    }
}


