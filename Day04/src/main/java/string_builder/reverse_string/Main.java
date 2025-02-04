package string_builder.reverse_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Enter your String: ");
            String str = br.readLine();
            System.out.print("Your reversed string is: "+ReverseString.reverse(str));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
