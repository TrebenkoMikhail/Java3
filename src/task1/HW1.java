package task1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW1 {

    public static void main(String[] args) {
        String[] strArray = {"one", "two", "tree", "four", "five"};
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        changeElements(strArray, 0, 4);
        swapElements(intArray, 2,3);
        swapElements(doubleArray, 0, 3);

        ArrayList<Double> list = new ArrayList<Double>();
        convertToList(doubleArray);

        System.out.println("-----3rd task------");

        Box<Apple> boxApples = new Box<>(new ArrayList<>());
        for (int i = 0; i < 6; i++) {
            boxApples.addFruit(new Apple());
        }

        Box<Apple> boxApples2 = new Box<>(new ArrayList<>());
        for (int i = 0; i < 6; i++) {
            boxApples.addFruit(new Apple());
        }

        Box<Orange> boxOranges = new Box<>(new ArrayList<>());
        for (int i = 0; i < 6; i++) {
            boxOranges.addFruit(new Orange());
        }
        System.out.println(boxApples.getWeight());
        System.out.println(boxOranges.getWeight());
        System.out.println(boxApples.compare(boxOranges));
        boxApples.switchFruitToAnotherBox(boxApples2);
        System.out.println(boxApples.getWeight());
        System.out.println(boxApples2.getWeight());

    }

    private static <E> void changeElements (E[] arrayToTest, int posit1, int posit2) {
        System.out.println("Original Array:\n" + Arrays.toString(arrayToTest));
        swapElements(arrayToTest, posit1, posit2);
        System.out.println("Changed Array:\n" + Arrays.toString(arrayToTest));
    }

    private static <F> List<F> convertToList(F[] array) {
        ArrayList<F> arrayList = new ArrayList<>();
        for (F f : array) {
            arrayList.addAll(Arrays.asList(array));
        }
        List<F> list = Arrays.asList(array);
        System.out.println("Original Array:\n" + array.getClass() + " : " + Arrays.toString(array) +
                "\nModified Array: \n " + list.getClass() + " : " + list);
        return list;
    }

    private static <T> void swapElements (T[] array, int index1, int index2) {
    T temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
    }
}
