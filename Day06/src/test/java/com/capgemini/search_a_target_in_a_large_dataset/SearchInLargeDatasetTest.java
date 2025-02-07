package com.capgemini.search_a_target_in_a_large_dataset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchInLargeDatasetTest {
    @Test
    void searchTargetElement(){
        int[] arr1 = new int[1000];
        int[] arr2 = new int[10000];
        int[] arr3 = new int[100000];

        RandomArrayElementGeneration rand = new RandomArrayElementGeneration();
        rand.generateRandomElement(arr1,1000);
        rand.generateRandomElement(arr2,10000);
        rand.generateRandomElement(arr3,1000000);

        double timeTakenByBinarySearch1 = SearchInLargeDataset.calculateBinarySearchTime(arr1,arr1[arr1.length / 2]);
        double timeTakenByBinarySearch2 = SearchInLargeDataset.calculateBinarySearchTime(arr2,arr2[arr2.length / 2]);
        double timeTakenByBinarySearch3 = SearchInLargeDataset.calculateBinarySearchTime(arr3,arr3[arr3.length / 2]);

        double timeTakenByLinearSearch1 = SearchInLargeDataset.calculateLinearSearchTime(arr1,arr1[arr1.length / 2]);
        double timeTakenByLinearSearch2 = SearchInLargeDataset.calculateLinearSearchTime(arr2,arr2[arr2.length / 2]);
        double timeTakenByLinearSearch3 = SearchInLargeDataset.calculateLinearSearchTime(arr3,arr3[arr3.length /2]);

        assertTrue(timeTakenByBinarySearch1 < timeTakenByLinearSearch1);
        assertTrue(timeTakenByBinarySearch2 < timeTakenByLinearSearch2);
        assertTrue(timeTakenByBinarySearch3 < timeTakenByLinearSearch3);

    }
}
