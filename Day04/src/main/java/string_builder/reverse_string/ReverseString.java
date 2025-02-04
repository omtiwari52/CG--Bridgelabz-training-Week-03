package string_builder.reverse_string;

public class ReverseString {
    public static String reverse(String str){
        StringBuilder stringBuilder = new StringBuilder(str);

        stringBuilder.reverse();

        return stringBuilder.toString();
    }
}
