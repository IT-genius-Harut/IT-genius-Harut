package intro_java.class_6_algo;

import intro_java.homeworks.hw2.HW2Utils;

public class Algorithms {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 6, 1, 9, -8, -3};
        int value = 9;
        int index = sequentialSearch(arr, value);
        System.out.println("Index for value: " + value + " is: " + index);
        HW2Utils.printArray(arr);
        System.out.println("Array sorted using by bubble sort");
        bubbleSort(arr);
        HW2Utils.printArray(arr);
        int binaryIndex = binarySearch(arr, 6);
        System.out.println("Index for value 9 in a sorted array is: " + binaryIndex);
    }

    /**
     * Simple looping search for a given value. If the value is found, return the index of the value.
     * If the value is not found, return -1.
     *
     * @param arr - array to search
     * @param value - value to search for
     * @return index of value in array, or -1 if value is not found
     */
    public static int sequentialSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Binary search implementation with the initial start and end values set to the beginning and end of the array.
     *
     * @param arr the array to be sorted
     * @param value the value to be searched for
     * @return the index of the value in the array
     */
    public static int binarySearch(int[] arr, int value) {
        return binarySearch(arr, value, 0, arr.length - 1);
    }
    /**
     * recursive binary search algorithm implementation
     *
     * @param arr   the array to search
     * @param value the value to search for
     * @param start the start index of the array
     * @param end   the end index of the array
     * @return the index of the value in the array, or -1 if the value is not found
     */
    public static int binarySearch(int[] arr, int value, int start, int end) {
        if (arr[start] > value || arr[end] < value) {
            return -1;
        }
        int currentIndex = (start + end) / 2;
        if (arr[currentIndex] > value) {
            return binarySearch(arr, value, start, currentIndex);
        } else if (arr[currentIndex] < value) {
            return binarySearch(arr, value, currentIndex, end);
        } else {
            return currentIndex;
        }
    }

    /**
     * Sorts an array using bubble sort. Bubble sort is a simple sorting algorithm that works by repeatedly
     * swapping adjacent elements if they are in the wrong order. The algorithm, which is a comparison-based
     * algorithm, has O(n^2) time complexity
     *
     * @param arr the unsorted array
     */
    public static void bubbleSort(int[] arr) {
        // O(n * (n - 1)) -> O (n^2)
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    /**
     *
     * swapping two elements in an array at the given indices in O(1) time
     *
     * @param arr provided array
     * @param i   the first index to be swapped to
     * @param j   the second index to be swapped to
     */
    public static void swap(int[] arr, int i, int j) {
        if (i >= arr.length || i < 0) return;
        if (j >= arr.length || j < 0) return;
        // swap logic
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
