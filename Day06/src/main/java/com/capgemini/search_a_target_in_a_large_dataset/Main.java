package com.capgemini.search_a_target_in_a_large_dataset;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RandomArrayElementGeneration addRandomElements = new RandomArrayElementGeneration();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size for first Array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter size for Second Array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter size for Third Array: ");
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];

        // Add random values to the array
        addRandomElements.generateRandomElement(arr1, n1);
        addRandomElements.generateRandomElement(arr2, n2);
        addRandomElements.generateRandomElement(arr3, n3);

        System.out.println("Time Taken By The Different Search Algorithms");
        System.out.println("---------------------------------------------");
        // Invoke the method for the middle element
        SearchInLargeDataset.display(arr1, arr1[arr1.length / 2]);
        System.out.println("--------------------------------------------");
        SearchInLargeDataset.display(arr2, arr2[arr2.length / 2]);
        System.out.println("--------------------------------------------");
        SearchInLargeDataset.display(arr3, arr3[arr3.length / 2]);
    }
}
