package com.capgemini.comparing_different_data_structures_for_searching;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        RandomArrayElementGeneration addRandomElements = new RandomArrayElementGeneration();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size for first Array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        HashSet<Integer> hs = new HashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        Random rand = new Random();
        for(int i = 0; i < n; i++){
            int num = rand.nextInt( n * 10);
            arr1[i] = num;
            hs.add(i);
            ts.add(i);
        }

        int target = arr1[rand.nextInt(n)];

        long startTime = System.nanoTime();
        boolean foundInArray = SearchingInArray.searchInArray(arr1,target);
        long endTime = System.nanoTime();
        System.out.println("Time taken by Array search: " + TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms");

        // Measure search time in HashSet (O(1))
        startTime = System.nanoTime();
        boolean foundInHashSet = SearchingInHashSet.searchInHashSet(hs,target);
        endTime = System.nanoTime();
        System.out.println("Time taken by HashSet search: " + TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms");

        // Measure search time in TreeSet (O(log N))
        startTime = System.nanoTime();
        boolean foundInTreeSet = SearchingInTreeSet.searchInTreeSet(ts,target);
        endTime = System.nanoTime();
        System.out.println("Time taken by TreeSet search: " + TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms");

    }
}
