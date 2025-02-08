package com.capgemini.compare_string_concatenation_efficiency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComapreStringConcatenationEfficiencyTest {

    @Test
    void compareStringConcatenationEfficiencyTest1(){
        long timeByString = StringPerformance.calculateStringTime(1000);
        long timeByStringBuilder = StringBuilderPerformance.calculateBuilderTime(1000);
        long timeByStringBuffer = StringBufferPerformance.calculateBufferPerformance(1000);

        assertTrue(timeByStringBuilder <= timeByStringBuffer && timeByStringBuilder <= timeByString);
        assertTrue(timeByStringBuffer <= timeByString);
    }
}
