import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {6, 5, 8, 7, 11};
        // Part 1 Test
        System.out.println("Smallest: " + MainProgram.smallest(numbers));

        // Part 2 Test
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));

        // Part 3 Test
        int[] numbers1 = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers1, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers1, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers1, 2));

        // Part 4 Test
        int[] numbers2 = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers2));

        MainProgram.swap(numbers2, 1, 0);
        System.out.println(Arrays.toString(numbers2));

        MainProgram.swap(numbers2, 0, 3);
        System.out.println(Arrays.toString(numbers2));

        // Part 5 - Selection Sort
        int[] numbers3 = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers3);

    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i : array) {
            if (smallest > i) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int index = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == index) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        if (table.length == 0) {
            return -1;
        }
        int smallest = table[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] <= smallest) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array){
        int[] temp = array.clone();
        for(int i = 0; i < array.length;i++){
            int index = indexOfSmallestFrom(array,i);
            swap(array,index,i);
            System.out.println(Arrays.toString(array));
        }
    }
}
