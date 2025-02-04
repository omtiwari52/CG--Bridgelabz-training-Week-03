package fileReader.count_the_occurrence_of_word;

import org.junit.jupiter.api.Test;

import static file_reader.count_the_occurrence_of_word.CountTheOccurrence.countWordOccurrences;
import static org.junit.jupiter.api.Assertions.*;

public class CountTheOccurrenceTest {


    //create a test method to check if the code is right or not
    @Test
    void countWordOccurrences1(){

        //using assertEquals method to test
        assertEquals(5, countWordOccurrences("demo_file.txt", 'w'));
    }
}
