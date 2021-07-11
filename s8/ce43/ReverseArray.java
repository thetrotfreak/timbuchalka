package s8.ce43;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] ilist = { 1, 2, 3, 4, 5 };
        reverse(ilist);
    }

    private static void reverse(int[] array) {
        int leftPointer = 0;
        int rightPointer = array.length - 1;

        System.out.println("Array = " + Arrays.toString(array));

        while (leftPointer < rightPointer) {
            int temp = array[leftPointer];
            array[leftPointer] = array[rightPointer];
            array[rightPointer] = temp;
            leftPointer++;
            rightPointer--;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}