package string_buffer.concatenate_strings;

public class ConcatenateString {
    public static String concatenate(String[] arr){
        StringBuffer concatenatedString = new StringBuffer();
        for (String s : arr) {
            concatenatedString.append(s);
        }
        return concatenatedString.toString();
    }
}
