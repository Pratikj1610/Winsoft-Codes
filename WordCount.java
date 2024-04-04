package strings;

import java.util.HashMap;

public class WordCount {
    
    public static HashMap<String, Integer> countWords(String str) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        // Split the string into words
        String[] words = str.split("\\s+");
        
        // Count the occurrences of each word
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        return wordCountMap;
    }

    public static void main(String[] args) {
        String inputString = "Write a Java Program to count the number of words in a string using HashMap";
        
        HashMap<String, Integer> wordCountMap = countWords(inputString);
        
        System.out.println("Word Count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}

