package com.capgemini.compare_recursion_and_iterative_fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompareRecursionAndIterativeFibonacciTest {

    @Test
    void compareRecursionAndIterativeFibonacciTest1(){
        assertTrue(CalculateTimeAndDisplay.displayTimeResult(30));
    }
}
