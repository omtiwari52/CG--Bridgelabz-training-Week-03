package StringBuilder.removeDuplicates;

import java.util.HashSet;

public class RemoveDuplicate {
    public static String duplicateRemove(String str){
        StringBuilder stringBuilder = new StringBuilder();
        HashSet<Character> appeared = new HashSet<>();
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(!appeared.contains(ch)){
                stringBuilder.append(ch);
                appeared.add(ch);
            }
        }

        return stringBuilder.toString();
    }
}
