import java.util.*;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        List<String> charList = Arrays.asList(text.toUpperCase().split(""));
        return (int) charList.stream()
                .filter(letter -> Collections.frequency(charList, letter) > 1)
                .distinct()
                .count();
    }
}
