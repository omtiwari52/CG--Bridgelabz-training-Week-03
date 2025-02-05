package string_builder.remove_duplicates;

import org.junit.jupiter.api.Test;

import static string_builder.remove_duplicates.RemoveDuplicate.duplicateRemove;
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
