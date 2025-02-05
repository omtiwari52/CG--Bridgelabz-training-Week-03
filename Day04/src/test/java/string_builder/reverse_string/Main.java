package string_builder.reverse_string;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static string_builder.reverse_string.ReverseString.reverse;

public class Main {

    @Test
    void test1(){
        assertEquals("mo", reverse("om"));
    }

    @Test
    void test2(){
        assertNotEquals("hello", reverse("olleh"));
    }
}
