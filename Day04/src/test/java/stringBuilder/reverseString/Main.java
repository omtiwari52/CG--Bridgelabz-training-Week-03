package stringBuilder.reverseString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static StringBuilder.ReverseAString.ReverseString.reverse;

public class Main {

    @Test
    void test1(){
        assertEquals("mo", reverse("om"));
    }

    @Test
    void test2(){
        assertEquals("hello", reverse("olleh"));
    }
}
