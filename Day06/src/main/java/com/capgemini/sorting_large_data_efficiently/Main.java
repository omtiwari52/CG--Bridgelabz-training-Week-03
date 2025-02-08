package com.capgemini.sorting_large_data_efficiently;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RandomArrayElementGeneration addRandomElements = new RandomArrayElementGeneration();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size for first Array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter size for Second Array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter size for Third Array: ");
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];

        // Add random values to the array
        addRandomElements.generateRandomElement(arr1, n1);
        addRandomElements.generateRandomElement(arr2, n2);
        addRandomElements.generateRandomElement(arr3, n3);

        System.out.println("Time Taken By The Sorting Algorithms 1000");
        System.out.println("---------------------------------------------");
        // Invoke the method for the middle element
        double timeTakenByBubbleSort1 = BubbleSort.bubbleSort(arr1);
        double timeTakenByMergeSort1 = QuickSort.quickSort(arr1);
        double timeTakenByQuickSort1 = MergeSort.mergeSort(arr1);
        System.out.println(timeTakenByQuickSort1 + " Time taken by quick sort");
        System.out.println(timeTakenByMergeSort1 + " Time taken by merge sort");
        System.out.println(timeTakenByBubbleSort1 +" Time taken by bubble sort ");



        System.out.println("Time Taken By The Sorting Algorithms 10000");
        System.out.println("---------------------------------------------");
        double timeTakenByBubbleSort2 = BubbleSort.bubbleSort(arr2);
        double timeTakenByMergeSort2 = QuickSort.quickSort(arr2);
        double timeTakenByQuickSort2 = MergeSort.mergeSort(arr2);
        System.out.println(timeTakenByQuickSort2 +  " Time taken by quick sort");
        System.out.println(timeTakenByMergeSort2  + " Time taken by merge sort");
        System.out.println(timeTakenByBubbleSort2 + " Time taken by bubble sort ");

        System.out.println("Time Taken By The Sorting Algorithms 1000000");
        System.out.println("---------------------------------------------");
        double timeTakenByMergeSort3 = QuickSort.quickSort(arr3);
        double timeTakenByQuickSort3 = MergeSort.mergeSort(arr3);
        System.out.println(timeTakenByQuickSort3  + " Time taken by quick sort");
        System.out.println(timeTakenByMergeSort3 +  " Time taken by merge sort ");

        // Bubble sort taken very much time and take much time to reach and calculate the time

        double timeTakenByBubbleSort3 = BubbleSort.bubbleSort(arr3 );
        System.out.println(timeTakenByBubbleSort3 + " Time taken by bubble sort ");

    }
}
