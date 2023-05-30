public class CountingDuplicates {

    public static int duplicateCount(String text) {
        return recursionHelped(text, 0);
    }

    private static int recursionHelped(String text, int counter) {
        Outer: for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j < text.length(); j++) {
                if (String.valueOf(text.charAt(i)).equalsIgnoreCase(String.valueOf(text.charAt(j)))) {
                    String shortenedText = text.replaceAll(
                            String.format("(?i)[%s]", String.valueOf(text.charAt(i))), "");
                    counter++;
                    counter = recursionHelped(shortenedText, counter);
                    break Outer;
                }
            }
        }
        return counter;
    }
}
