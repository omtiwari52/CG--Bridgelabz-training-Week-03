package com.capgemini.comparing_different_data_structures_for_searching;

import java.util.Random;

public class RandomArrayElementGeneration {
    Random rand = new Random();
    RandomArrayElementGeneration(){}

    public void generateRandomElement(int[] arr, int N){
        for(int i = 0; i < arr.length; i++){
            arr[i] = this.rand.nextInt(N);
        }
    }
}

