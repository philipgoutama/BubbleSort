package org.example;

public class BubbleSort {
    public static void bubbleSort(int[] A) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {7,2,76,4,99};
        System.out.println("Unsorted array:");
        for (int j : A) {
            System.out.print(j + " ");
        }
        System.out.println();

        bubbleSort(A);

        System.out.println("Sorted array:");
        for (int j : A) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
