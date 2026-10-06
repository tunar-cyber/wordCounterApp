package lt.vu.wordcounterapp;

public class Counter {

    public int CountWords(String text) {
        if (text.trim().isEmpty()) {
            return 0;
        }

        String[] words = text.trim().split("[ ,.]+");
        return words.length;
    }

    public int CountSentences(String text) {
        if (text.trim().isEmpty()) {
            return 0;
        }

        String[] sentences = text.trim().split("[.!?]+");
        return sentences.length;
    }

    public int CountChars(String text) {
        return text.length();
    }

    public int CountNumbers(String text) {
        if (text.trim().isEmpty()) {
            return 0;
        }

        String[] parts = text.split("[^0-9]+");

        int count = 0;

        for (String part : parts) {
            if (!part.isEmpty()) {
                count++;
            }
        }

        return count;
    }
}