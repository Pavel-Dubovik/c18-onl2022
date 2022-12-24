package by.tms.hw2;

public class TextFormatter {
    public int getNumberOfWords(String str) {
        String[] words = str.split(" ");
        return words.length;
    }

    public int getNumberOfSentences(String str) {
        String[] words = str.split("\\.");
        return words.length;
    }

    public boolean isPalindromeInString(String[] str) {
        boolean result = false;
        for (String word : str) {
            String sLowerCase = word.toLowerCase();
            StringBuilder stringBuilder = new StringBuilder(sLowerCase);
            StringBuilder reverse = stringBuilder.reverse();
            return (reverse.toString()).equals(sLowerCase);
        }
        return false;
    }
}
