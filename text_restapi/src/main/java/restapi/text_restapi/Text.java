package restapi.text_restapi;

import java.util.HashMap;

public class Text {
    private HashMap<String, Integer> words;
    private int wordCount;
    private int startsWithUppercase;

    public Text(String text) {
        String[] wordsArray = text.split("\\s+");

        this.wordCount = wordsArray.length;
        this.words = new HashMap<>();

        for(int i = 0; i < wordsArray.length; i++) {
            int count = words.containsKey(wordsArray[i]) ? words.get(wordsArray[i]) : 0;
            words.put(wordsArray[i], count + 1);
        }
        int isUppercaseCounter = 0;

        for (String word : wordsArray) {
            char firstLetter = word.charAt(0);
            if (Character.isUpperCase(firstLetter)) {
                isUppercaseCounter++;
            }
        }
        this.startsWithUppercase = isUppercaseCounter;

    }

    public HashMap<String, Integer> getWords() {
        return this.words;
    }

    public int getWordCount() {
        return this.wordCount;
    }

    public int getStartsWithUppercase() {
        return this.startsWithUppercase;
    }
}
