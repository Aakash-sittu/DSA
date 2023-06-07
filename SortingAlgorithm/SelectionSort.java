package SortingAlgorithm;

public class SelectionSort {
    public static void main(String args[]) {
        int[] arr = new int[] { 12, 18, 9, 13, 65, 3, 1 };

        System.out.println("Original Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < arr.length - 1; i++) {
            int minimum = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minimum])
                    minimum = j;
            }
            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted Arary");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}