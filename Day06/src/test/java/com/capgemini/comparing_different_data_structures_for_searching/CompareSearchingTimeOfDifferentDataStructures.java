package com.capgemini.comparing_different_data_structures_for_searching;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class CompareSearchingTimeOfDifferentDataStructures {
    @Test
    void searchingTestOne() {
        int n = 1_000_000; // Number of elements
        Random rand = new Random();

        // Generate random data
        int[] arr1 = new int[n];
        HashSet<Integer> hs = new HashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        // Add random data in the data structures
        for (int i = 0; i < n; i++) {
            int num = rand.nextInt(n * 10);
            arr1[i] = num;
            hs.add(num);
            ts.add(num);
        }

        // Pick a random element to search
        int target = arr1[rand.nextInt(n)];


        long startTime1 = System.nanoTime();
        boolean foundInArray = SearchingInArray.searchInArray(arr1, target);
        long endTime1 = System.nanoTime();

        // Measure search time in HashSet (O(1))
        long startTime2 = System.nanoTime();
        boolean foundInHashSet = SearchingInHashSet.searchInHashSet(hs, target);
        long endTime2 = System.nanoTime();

        // Measure search time in TreeSet (O(log N))
        long startTime3 = System.nanoTime();
        boolean foundInTreeSet = SearchingInTreeSet.searchInTreeSet(ts, target);
        long endTime3 = System.nanoTime();

        assertTrue(TimeUnit.NANOSECONDS.toMillis((endTime1 - startTime1)) >= TimeUnit.NANOSECONDS.toMillis(endTime2 - startTime2)
                && TimeUnit.NANOSECONDS.toMillis(endTime2 - startTime2) >= TimeUnit.NANOSECONDS.toMillis(endTime3 - startTime3));
    }
}
