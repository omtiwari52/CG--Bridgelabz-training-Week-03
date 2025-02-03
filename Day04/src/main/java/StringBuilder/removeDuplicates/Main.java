package StringBuilder.removeDuplicates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter your string: ");
            String str = br.readLine();
            System.out.println("String after duplicates removed: "+ RemoveDuplicate.duplicateRemove(str));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
