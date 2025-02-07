package com.capgemini.search_a_target_in_a_large_dataset;

import java.util.Arrays;

public class SearchInLargeDataset {

    // Method which give the ms of the linear search to search the element
    static long calculateLinearSearchTime(int[] arr, int target){
        // Search the target element
        long nanoTimeBefore = System.nanoTime();
        for (int j : arr) {
            if (j == target){
                break;
            }
        }
        return (System.nanoTime() - nanoTimeBefore);
    }

    // Method to calculate the ms time of binary Search
    static long calculateBinarySearchTime(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;
        int mid;
        Arrays.sort(arr);
        long nanoTimeBefore = System.nanoTime();
        while(left <= right){
            // update the mid element
            mid = left + (right - left) / 2;
            // Check the element is equal to mid or not
            if (arr[mid] == target) break;
            else if(arr[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return (System.nanoTime() - nanoTimeBefore);
    }


    static void display(int[] arr, int target){
        double binarySearchTime = calculateBinarySearchTime(arr, target);
        double linearSearchTime = calculateLinearSearchTime(arr, target);

        System.out.println("Time taken by binary search is: "+binarySearchTime + " ns\nTime taken by linear search is: "+ linearSearchTime+" ns");
    }
}
