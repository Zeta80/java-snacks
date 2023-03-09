package snacks.java;


import java.util.Arrays;
import java.util.Random;

public class snackBonus {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4};
        int[] array2 = new int[]{5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        // Calcolo della differenza tra la lunghezza dei due array
        int diff = Math.abs(array1.length - array2.length);


        if (array1.length < array2.length) {
            array1 = addElementsToArray(array1, diff);
        } else if (array2.length < array1.length) {
            array2 = addElementsToArray(array2, diff);
        }


        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
    }

    // Metodo che aggiunge nuovi elementi all'array
    private static int[] addElementsToArray(int[] arr, int numElementsToAdd) {
        Random rand = new Random();
        int[] newArr = new int[arr.length + numElementsToAdd];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = arr.length; i < newArr.length; i++) {
            newArr[i] = rand.nextInt(100);
        }
        return newArr;
    }

    //S-S-SASSONE?  🗿
}
