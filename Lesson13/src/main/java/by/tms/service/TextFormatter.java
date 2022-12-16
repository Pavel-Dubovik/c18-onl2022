package by.tms.service;

public class TextFormatter {
    public int getNumberOfWords(String str) {
        String[] words = str.split(" ");
        return words.length;
    }

    public boolean isPalindromeInString(String[] str) {
        boolean result = false;
        for (String word : str) {
            String sLowerCase = word.toLowerCase();
            StringBuilder stringBuilder = new StringBuilder(sLowerCase);
            StringBuilder reverse = stringBuilder.reverse();
            if ((reverse.toString()).equals(sLowerCase)) {
                result = true;
            }
        }
        return result;
    }

    public String getMiddleSigns(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }
}
