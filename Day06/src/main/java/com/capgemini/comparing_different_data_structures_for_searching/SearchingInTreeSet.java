package com.capgemini.comparing_different_data_structures_for_searching;

import java.util.TreeSet;

public class SearchingInTreeSet {
    public static boolean searchInTreeSet(TreeSet<Integer> ts, int target){
        return ts.contains(target);
    }
}
