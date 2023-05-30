import java.util.*;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        HashMap<Character, Boolean> charCountMap = new HashMap<Character, Boolean>();
        for (char c : text.toUpperCase().toCharArray()) {
            charCountMap.put(c, charCountMap.containsKey(c) ? true : false);
        }
        return (int) charCountMap.values().stream()
                .filter(bool -> bool)
                .count();
    }
}
