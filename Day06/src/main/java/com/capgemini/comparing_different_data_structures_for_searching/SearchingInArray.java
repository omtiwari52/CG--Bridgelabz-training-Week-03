package com.capgemini.comparing_different_data_structures_for_searching;

public class SearchingInArray {
    public static boolean searchInArray(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
