package stringBuilder.removeDuplicates;

import org.junit.jupiter.api.Test;

import static StringBuilder.removeDuplicates.RemoveDuplicate.duplicateRemove;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesTest {

    @Test
    void test1(){
        assertEquals("helos", duplicateRemove("Hellohhssll"));
    }

    @Test
    void test2(){
        assertNotEquals("helos", duplicateRemove("Hellohhssll"));
    }
}
